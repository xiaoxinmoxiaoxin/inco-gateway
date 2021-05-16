/*
package com.inco.gateway.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.filter.ratelimit.RateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;

//@Configuration
public class GatewayConfiguration {

    @Autowired
    private KeyResolver ipKeyResolver;

    @Autowired
    private KeyResolver userKeyResolver;

    @Autowired
    private KeyResolver apiKeyResolver;

    @Autowired
    private RateLimiter redisRateLimiter;

    //@Bean
   // @Order
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                //多个路由规则就添加多个route
               */
/* .route(r ->
                        r.path("/inco-xtgl/**")
                                .filters(f ->
                                        f.stripPrefix(1).
                                                //添加自定义的filter
                                                        requestRateLimiter(c -> {
                                                    c.setKeyResolver(ipKeyResolver);
                                                    c.setRateLimiter(redisRateLimiter);
                                                    c.setStatusCode(HttpStatus.BAD_GATEWAY);
                                                })
                                )
                                .uri("lb://inco-xtgl")
                )
                .route(r ->
                        r.path("/inco-xkgl/**")
                                .filters(f ->
                                        f.stripPrefix(1).
                                                //添加自定义的filter
                                                        requestRateLimiter(c -> {
                                                    c.setKeyResolver(ipKeyResolver);
                                                    c.setRateLimiter(redisRateLimiter);
                                                    c.setStatusCode(HttpStatus.BAD_GATEWAY);
                                                })
                                )
                                .uri("lb://inco-xkgl")
                )
*//*



                .build();
    }


}
*/
