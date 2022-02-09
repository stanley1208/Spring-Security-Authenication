package com.example.demo;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


class SpringSecurityAuthenicationApplicationTests {

	
	public static void main(String[] args) {
		
		PasswordEncoder pe=new BCryptPasswordEncoder();
		String encode=pe.encode("1234");
		System.out.println(encode);
		boolean matches=pe.matches("1234", encode);
		System.out.println(matches);
		
		System.out.println();
		
		String encode2=pe.encode("5678");
		System.out.println(encode2);
		boolean matches2=pe.matches("5678", encode2);
		System.out.println(matches2);
		
		// $2a$10$cY.GT.qNI6MRXZ35oVcHluOaxRk0ZNTHRjpyB8VXCObAW96YFvcci
		// boolean matches3=pe.matches("1234", "$2a$10$Xb2PEZwV7sEjLgzX.Vxfqe1tpu3UqC4m4UbTG7WJBUMOKYJvviHeC");
		// System.out.println(matches3);
	}

}
