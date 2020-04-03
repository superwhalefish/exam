package com.yy.spring.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolConfigTest {
	private static JedisPool pool ;
static {
	JedisPoolConfig poolConfig = new JedisPoolConfig();
	poolConfig.setMaxTotal(5);
	poolConfig.setMaxIdle(1);
	String host = "127.0.0.1";
	int port = 6379;
	 pool = new JedisPool(poolConfig,host, port);
}

public static Jedis getJedis() {
	Jedis jedis = pool.getResource();
	return jedis;
	
}
//关闭
public static void close(Jedis jedis) {
	jedis.close();
	
}
}
