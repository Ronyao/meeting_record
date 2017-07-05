package com.ronyao.test;

import org.aspectj.lang.annotation.Before;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ronyao.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {


	MockMvc mockMvc;

	@Autowired
	WebApplicationContext context;

	@org.junit.Before
	public void initMocMvc(){

		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testUser() throws Exception{
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/").param("userId", "101")).andReturn();
		MockHttpServletRequest request = result.getRequest();
		User user = (User) request.getAttribute("username");
		System.out.println(user.getUserName());
	}
}
