package com.lxk.test;

import redis.clients.jedis.Jedis;

/**
 * description:
 * <p>
 * </P>
 *
 * @author fanyao created redistest at 2018/4/25 version: 1.0.0
 */
public class test {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("10.0.193.182");
        System.out.println("Connection to server successfully");
        jedis.setnx("liuxiaokai", "testRedis222");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());
        System.out.println(jedis.get("liuxiaokai"));
    }
}
