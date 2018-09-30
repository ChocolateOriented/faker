package com.lijx;

import com.github.javafaker.Faker;
import com.lijx.cat.repository.UserRepository;
import java.util.Locale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class FakerApplicationTests {
	@Autowired
	UserRepository userRepository ;

	@Test
	public void contextLoads() {
		System.out.println( userRepository.findAll());
	}

}
