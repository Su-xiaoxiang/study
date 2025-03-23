# Spring Cache

```
Spring Cache 是一个框架，实现了基于注解的缓存功能，只需要简单地加一个注解，就能实现缓存功能。
```

```java
底层可以切换不同的缓存实现 
EHCache
Caffeine
Redis
```

```java
Maven坐标	
   <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-cache</artifactId>
   </dependency>
    如果用redis就导入redis
          <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-redis</artifactId>
            </dependency>
```

```java
常用注解
@EnableCaching 开启缓存注解功能,通常加在启动类上
@Cacheable 在方法执行前先查询缓存中是否有数据,如果有数据，则直接返回缓存数据;如果没有缓存数据，调用方法并将方法返回值放到缓存中
   //尽量使用这个注解@Cacheable(cacheNames ="userCache",key="#user.id")
@CachePut 将方法的返回值放到缓存中 
    eg:@CachePut(cacheNames ="userCache",key="#user.id")如果使用Spring Cache缓存数据，key的生成 userCache：id  // key(user)与形参保持一致 "."对象导航  尽量使用第一种
    eg:   @CachePut(cacheNames ="userCache",key="#result.id")如果使用Spring Cache缓存数据，key的生成 userCache：id  // key(result)与返回值 "."对象导航
    eg:   @CachePut(cacheNames ="userCache",key="#p0.id")如果使用Spring Cache缓存数据，key的生成 userCache：id  // p0获取第一个参数(比如说user)
    eg:   @CachePut(cacheNames ="userCache",key="#a0.id")如果使用Spring Cache缓存数据，key的生成 userCache：id  // p0获取第一个参数(比如说user)
@CacheEvict 将一条或多条数据从缓存中删除		
      eg：@CacheEvict(cacheNames = "setmealCache",allEntries = true) 清楚setmealCache下的所有数据
```

