package com.melin.reflection;

import java.util.HashMap;
import java.util.Map;

public class Test {

	@org.junit.Test
	public void test() {
		Map<String, Object> map = new HashMap<>();
		
		UserManager u = new UserManager();
		u.loadProp("config.properties");
		map.put("name", "melin.chao");
		map.put("id", "F123456789");
		map.put("sex", "¨k");
		map.put("tel", "1234");
		User user = u.gen("config1",map);
		System.out.println(user);
	}

}
