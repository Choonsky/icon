package com.choonsky.astra.basic_icon;

import java.util.Map;
import lombok.Setter;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("basic-icon.service")
public class IconProperties {
	String name;
	Map<String, Integer> presents;
}