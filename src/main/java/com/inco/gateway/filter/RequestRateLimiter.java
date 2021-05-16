package com.inco.gateway.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import reactor.core.publisher.Mono;

import java.util.List;
@Configuration
public class RequestRateLimiter {

   // @Bean("redisRateLimiter")
   // public RedisRateLimiter redisRateLimiter(){
   //     return new RedisRateLimiter(1,1);
   // }

    //ip限流
    @Bean
    public KeyResolver ipKeyResolver() {
        System.out.println("ddddddddddddddddd");
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

    //用户限流
    @Bean
    KeyResolver userKeyResolver() {
        return exchange ->
                Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }

    //接口限流
    @Bean
    KeyResolver apiKeyResolver() {
        return exchange ->
                Mono.just(exchange.getRequest().getPath().value());
    }

}
