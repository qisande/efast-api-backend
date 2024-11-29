# 简快（efast）API 接口平台

## 项目简介

本项目是一个提供 API 接口供开发者调用的平台。使用者可以注册一个账号，开通接口调用权限，可以 浏览和调用接口。每次调用都会进行统计次数。管理员可以发布接口、下线接口、接入接口。

## 工作原理

首先管理员创建接口后通过 backend 保存到数据库中。用户在自己的项目中引入 SDK 模块，并通过方法调用 API 接口。然后请求被发送到 API 网关，进行用户鉴权和接口调用统计，最后将接口转发到实际的 API 接口。

大致的调用流程如下图所示：

![4455d938-8bb1-465e-8c8e-2b1df33d5dea](https://images73.oss-cn-beijing.aliyuncs.com/img/4455d938-8bb1-465e-8c8e-2b1df33d5dea.svg)

## 模块介绍

src：核心业务后端，负责用户和接口管理等核心业务功能。

efast-api-gateway：API网关服务，负责集中的路由转发、统一鉴权、统一业务处理、访问控制等。

efast-api-common：公共模块，包括各其他模块中需要复用的方法、工具类、实体类、全局异常等。

efast-api-client-sdk：客户端SDK，封装了对各API接口的调用方法，降低开发者的使用成本。

efast-api-interface：提供模拟API接口。

## 文件结构

```
├── src                   # 负责用户和接口管理    
├── efast-api-interface   # 提供模拟的 API 接口
├── efast-api-gateway     # 主要负责集中的路由转发和业务处理
├── efast-api-common      # 包含其他模块中需要用到的方法、工具类、实体类等
└── efast-api-client-sdk  # 封装了对各个 API 接口的调用方法
```

## 快速开始

使用者引入 SDK 依赖

```xml
<dependency>
    <groupId>com.qisande</groupId>
    <artifactId>efast-api-client-sdk</artifactId>
    <version>0.0.1</version>
</dependency>
```

## 配置指南

首先去平台上注册一个用户，并获取到 ak 和 sk。

### 配置文件示例（ `application.yml` 文件）

编写有关 SDK 的配置

```yml
efast-api:
  client:
    access-key: xxx
    secret-key: xxx
```

## 许可证

该项目遵循 MIT 许可证 - 请参阅 LICENSE 文件了解详细信息。