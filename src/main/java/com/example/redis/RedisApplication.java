package com.example.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

	@Autowired
	RedisTemplate redisTemplate;

	@Override
	public void run(String... args) {
		final User user = new User("kc",100);
		redisTemplate.opsForValue().set("kc",user);
		User kc = (User) redisTemplate.opsForValue().get("kc");
		System.out.println(kc.getName()+" "+kc.getScore());
	}
}

