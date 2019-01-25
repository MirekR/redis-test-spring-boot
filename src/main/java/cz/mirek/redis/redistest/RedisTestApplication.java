package cz.mirek.redis.redistest;

import cz.mirek.redis.redistest.handler.NoActionCacheErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheErrorHandler;

@SpringBootApplication
@EnableCaching
public class RedisTestApplication extends CachingConfigurerSupport {

	public static void main(String[] args) {
		SpringApplication.run(RedisTestApplication.class, args);
	}

	@Override
	public CacheErrorHandler errorHandler() {
		return new NoActionCacheErrorHandler();
	}
}

