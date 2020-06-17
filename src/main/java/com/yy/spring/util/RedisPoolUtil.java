package com.yy.spring.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPoolUtil {
	private static JedisPool pool ;
	static {
		//redis连接
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(5);//最大连接
		poolConfig.setMaxIdle(1);//最小连接
		poolConfig.setMaxWaitMillis(5000);//最大等待时间
		String host = "127.0.0.1";//本地连接
		int port = 6379;//端口号
		 pool = new JedisPool(poolConfig,host, port);
	}

	public static Jedis getJedis() {
		Jedis jedis = pool.getResource();
		//jedis.auth("rides登录密码");//未设置可以不写
		return jedis;
		
	}
	//关闭
	public static void close(Jedis jedis) {
		jedis.close();
		
	}
}
