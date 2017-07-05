package com.ronyao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ronyao.bean.Department;
import com.ronyao.dao.DepartmentMapper;

/*
 * test dao
 * @author honor
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	DepartmentMapper departmentMapper;

	/*
	 * testDepartment
	 */
	@Test
	public void testMeeting() {
		// TODO Auto-generated method stub
//		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//		DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
		//System.out.println(departmentMapper);

//		departmentMapper.insertSelective(new Department(1, "kaifabu"));
//		departmentMapper.insertSelective(new Department(2, "ceshibu"));

		System.out.println(departmentMapper);

	}
}
