package com.testingb2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@AutoConfiguration(after = MongoAutoConfiguration.class)
@ConditionalOnClass({ com.mongodb.client.MongoClient.class, org.springframework.data.mongodb.core.MongoTemplate.class })
@EnableConfigurationProperties(MongoProperties.class)
public class TestingB2bApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingB2bApplication.class, args);
	}

}
