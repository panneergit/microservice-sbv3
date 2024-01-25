package com.in28min.ms.sbv3.limits.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {
	private Integer minimum;
	private Integer maximum;
}
