package com.choonsky.astra.basic_icon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {"spring.cloud.config.enabled:false"})
@TestPropertySource(locations = {"classpath:test.yml"})
public class IconApplicationTests {

	@Autowired
	TestRestTemplate rest;

	@Test
	public void contextLoads() {
		String burritoGreeting = this.rest.getForObject("/burrito", String.class);
		String avocadoGreeting = this.rest.getForObject("/avocado", String.class);
		String shamrockGreeting = this.rest.getForObject("/shamrock", String.class);
		String defaultGreeting = this.rest.getForObject("/", String.class);
		assertEquals("<h1>Here is your \uD83C\uDF2F from IconService!!!</h1>", burritoGreeting);
		assertEquals("<h1>Here is your \uD83E\uDD51 from IconService!!!</h1>", avocadoGreeting);
		assertEquals("<h1>Here is your ☘ from IconService!!!</h1>", shamrockGreeting);
		assertEquals("<h1>Here is your present, Developer!!!</h1>", defaultGreeting);

	}

}