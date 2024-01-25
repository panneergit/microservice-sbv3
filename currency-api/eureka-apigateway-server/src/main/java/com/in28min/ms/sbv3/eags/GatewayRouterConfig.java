package com.in28min.ms.sbv3.eags;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRouterConfig {

    @Bean
    RouteLocator getRouterLocator(RouteLocatorBuilder builder) {
		return builder.routes()
					  .route("currency-conversion-1", p -> p.path("/conversion-service/**").uri("lb://conversion-service"))
					  .route("currency-conversion-2", p -> p.path("/conversion-service-new/**")
							  .filters(f -> f.rewritePath("/conversion-service-new/(?<segment>.*)", "/conversion-service/${segment}"))
							  .uri("lb://conversion-service"))
					  .route("exchange-service-1", p -> p.path("/exchange-service/**").uri("lb://exchange-service"))
					  .build();
	}
}
