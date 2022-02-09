package com.example.demo.repository;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public Map<String, Map<String, String>>users;
	{
		// A01, 1234 ,admin,normal,ROLE_manager
		Map<String, String>info1=new LinkedHashMap<>();
		info1.put("pasword", "$2a$10$TrgQ4ZDsiLWmF21dmO1kUuzlnIf72wSpm95WUtExjd8StL3yDHW1u");
		info1.put("authority", "admin,normal,ROLE_manager");
		// A02, 5678, 
		Map<String, String>info2=new LinkedHashMap<>();
		info2.put("pasword", "$2a$10$k2d3Mo9kOu0P8ooX1rAFNeA3Hyk8R7H5aZxd1QBqoXds4F1rppH..");
		info2.put("authority", "normal,ROLE_employee");
		
		users=new LinkedHashMap<>();
		users.put("A01", info1);
		users.put("A02", info2);
		
		System.out.println(users);
		
	}
}
