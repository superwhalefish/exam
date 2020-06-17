package com.yy.spring.redis;

import java.util.HashSet;
import java.util.Set;

public class a {
public static void main(String[] args) {
	Set set= new HashSet();
	set.add("aaa");
	set.add("bbb");
	set.add("aaa");
	System.out.println(set.size());

}
}
