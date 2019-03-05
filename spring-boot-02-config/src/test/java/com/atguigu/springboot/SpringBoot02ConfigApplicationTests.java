package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * SpringBoot单元测试;
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

	@Autowired
	Person person;

	@Value("${person.last-name2}")
	String lastName;

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	@Test
	public void PropertySourceScope() {
		System.out.println(lastName);	//可以获取到值
	}

	@Test
	public void testHelloService(){
		boolean b = applicationContext.containsBean("helloService");
		boolean b2 = applicationContext.containsBean("helloService02");
		System.out.println(b);
		System.out.println(b2);
	}

}
