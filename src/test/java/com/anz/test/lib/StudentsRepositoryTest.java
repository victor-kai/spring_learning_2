package com.anz.test.lib;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anz.core.repository.StudentsRepository;
import com.anz.domain.Students;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = com.anz.spring.SPRApplication.class)
public class StudentsRepositoryTest {

	@Autowired
	StudentsRepository studentsRepository;

	Logger log = LoggerFactory.getLogger(StudentsRepositoryTest.class);

	@Test
	public void stuRepoTest1() {

		Students stu = null;

		stu = studentsRepository.findByName("Victor, Huang");

		log.info(stu.getName());
		log.info(stu.getAge() + "");
		log.info(stu.getSex());

		Assert.assertNotNull(stu);
	}
	
	@Test
	public void stuRepoTest2() {

		Students stu = null;

		stu = studentsRepository.findByNameAndAge("Victor, Huang", 30);

		log.info(stu.getName());
		log.info(stu.getAge() + "");
		log.info(stu.getSex());

		Assert.assertNotNull(stu);
	}

	@Test
	public void testTest() {

		int i = studentsRepository.findAll().size();

		Assert.assertNotEquals(0, i);
		Assert.assertEquals(2, i);
	}

}
