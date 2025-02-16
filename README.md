# 小红书项目
- 项目描述：一个仿制小红书社区交友项目，主要包括笔记发布、点赞、收藏、关注等功能。平台需要满足海量用户的高并发读写和数据一致性要求，确保用户操作的实时响应，并通过分布式架构实现高可用和高扩展性。

- 项目架构：微服务分布式架构 + Maven 多模块 + Spring Boot Starter 组件 + 前后端分离；

- 技术栈：Spring Cloud Alibaba + Nacos + Gateway + Feign + Mybatis + MySQL + Redis + RocketMQ + SaToken + Minio + Cassandra + Zookeeper

- 担任角色： Java 后端开发

- 核心职责：

    - 平台设计：负责平台整体的需求梳理、技术选型、架构设计、项目搭建、接口与表设计，从 0 落地一个微服务架构，确保平台具有高扩展性、高可用性和高性能，能够承载海量用户访问和操作。

    - 组件、工具类封装：主导了多个通用功能模块的组件化封装，提升了代码的复用性和可维护性，包括用户上下文组件、接口切面日志组件、Jackson 自动化配置组件；全局异常捕获、自定义参数校验注解、响应工具类等等。

    - 服务拆分：根据业务领域和职责边界来拆分服务，包括网关服务、认证服务、用户服务、笔记服务、用户关系服务、计数服务、OSS 对象存储服务、分布式 ID 生成服务、KV 短文本键值存储服务等等，确保每个服务具备单一职责，降低耦合度。每个微服务都独立部署与维护，支持水平扩展。

    - 【基础服务】网关服务：负责 Gateway 网关服务的搭建与开发，实现统一路由管理、负载均衡；使用 SaToken 实现网关的统一鉴权；全局过滤器解析 Token 令牌，并将用户 ID 透传给下游服务。

    - 【基础服务】认证服务：负责认证服务的搭建与开发，基于 RBAC 模型，使用 SaToken 实现用户的 JWT 登录认证（支持账号登录、手机验证码登录）、登出、用户自注册、密码修改；对接阿里云 SMS 服务，自定义线程池异步发送手机号验证码，并实现短信接口防刷。

    - 【基础服务】分布式 ID 生成服务：负责整合美团 Leaf 源码，搭建分布式 ID 生成服务，以 Feign 接口的形式，对外提供号段 ID 生成、雪花算法 ID 生成 两种模式的分布式 ID 生成方式；使用 Jmeter 压测单机单节点，接口的吞吐量可达到 22000+/s , 平均响应耗时 4ms，日提供 19 亿+ 次的 ID。

    - 【基础服务】OSS 对象存储服务：负责对象存储服务的搭建与开发，以存储图片、视频等非结构化数据。使用工厂模式 + 策略模式实现文件存储的扩展性，目前已支持阿里云 OSS、Minio 两种不同类型；并通过 Nacos 分布式配置，实现动态注册文件策略实现类 Bean 到 Spring 容器中。

    - 【基础服务】KV 短文本键值存储服务：负责 KV 键值存储服务的搭建与开发，基于 RocksDB 存储引擎上构建的 Apache Cassandra，实现对平台短文本的的存储与查询，如笔记正文、评论内容等。

    - 【业务服务】用户服务：负责设计和实现用户服务，提供用户的基本信息管理，如用户信息修改、注册、查询、密码更新（BCrypt 随机 “盐” 加密）等；使用 Redis + Caffeine 本地缓存构建二级缓存，实现对外提供的接口，能够支持对用户信息查询的高并发读，能够有效防止缓存雪崩、缓存穿透、缓存击穿。

    - 【业务服务】笔记服务：负责设计和实现笔记服务，支持用户进行笔记发布、编辑、查询、置顶、权限修改等功能。

      - 通过 CompletableFuture 并发调用下游服务，以降低接口响应耗时；并通过二级缓存，支持笔记详情查询的高并发读；
笔记更新、删除时，使用 RocketMQ 广播服务，实现集群环境下，对本地缓存中缓存的删除，达到数据一致性；
点赞接口支持高并发写：使用 Redis Bloom 布隆过滤器，高性能判断用户是否点赞，通过 Redis ZSET + MQ 异步落库，消费者中使用 RateLimiter 令牌桶实现流量削峰，防止打垮数据库；
      - 【业务服务】用户关系服务：负责设计和实现用户关系服务。

      - 用户关注与取关：支持平台用户之间的关注、取关高并发写等社交操作，维护用户的社交关系链。通过 Redis 缓存 + 发送顺序消息 MQ 异步存库，实现接口的高并发写与操作的顺序性，使用 Lua 脚本，避免频繁操作 Redis 造成的性能瓶颈，且保证多次操作的原子性；消费者使用联合唯一索引保证关系记录的幂等性；
粉丝列表、关注列表查询：通过 Redis ZSET 数据结构，针对两种列表，分别使用不同的策略来缓存热点数据，以支持的高并发读分页查询请求；

    - 【业务服务】计数服务：负责设计并实现高并发场景下的计数服务，用于统计用户的关注数、粉丝数、点赞数等各种计数需求，确保在大规模用户互动下，计数服务依然具备高性能与高可用性。

      - 通过消费用户行为操作的 MQ，如关注、取关, 在消费者中，使用 BufferTrigger 进行流量聚合，如 1000 条一批，1s 写入一次，先将计数数据写入 Redis 中, 再异步流量削峰进行落库，以支持高并发写；