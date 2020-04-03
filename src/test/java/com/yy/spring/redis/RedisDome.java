package com.yy.spring.redis;

import java.util.Map;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisDome {
	public static void main(String[] args) {
		/*
		 * String host = "127.0.0.1"; int port = 6379; //1 连接池redis 基本配置信息
		 * JedisPoolConfig poolConfig = new JedisPoolConfig();
		 * poolConfig.setMaxTotal(5); poolConfig.setMaxIdle(1); //2 连接池 JedisPool pool =
		 * new JedisPool(poolConfig,host, port);
		 * 
		 * Jedis jedis = pool.getResource();
		 * 
		 * System.out.println(jedis.ping());
		 */
	}

	@Test
	public void t1() {
		// 获取连接
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		jedis.set("sName", "1好连接");
		String sName = jedis.get("sName");
		System.out.println(sName);
		jedis.close();
	}

//redis模拟实战
	@Test
	public void t2() {
		Jedis jedis = JedisPoolConfigTest.getJedis();
		String key = "appName";
		if (jedis.exists(key)) {
			String s1 = jedis.get(key);
			System.out.println("redis中查询出来的" + s1);
		} else {
			String result = "测试1";
			jedis.set(key, result);
			System.out.println("数据库查询" + result);
		}
		JedisPoolConfigTest.close(jedis);
	}
	
	@Test
	public void t3() {
		Jedis jedis = JedisPoolConfigTest.getJedis();
		String key="users";
		if(jedis.exists(key)) {
			Map<String,String> map =jedis.hgetAll(key);
			System.out.println("这是redis的查询：");
			System.out.println(map.get("id")+"\t"+map.get("name"));
		}else {
			String id="1";
			String name="小明";
			jedis.hset(key, "id", id);
			jedis.hset(key, "name", name);
			System.out.println("数据库查询：id:"+id+"name:"+name);
		}
	}
}
