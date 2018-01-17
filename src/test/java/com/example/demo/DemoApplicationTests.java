package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired

	private
	 GirlRepository girlRepository;
	@Test
	public void contextLoads() {
	}
	@Rollback(false)
	@Test public void  add (){
		Girl g=Girl.builder()
				.age(12)
				.cupSize("dd")
				.build();
		girlRepository.save(g);
	}

}
