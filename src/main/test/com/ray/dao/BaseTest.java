package com.ray.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by rui on 2017/4/9.
 */
//ָ��beanע��������ļ�
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
//ʹ�ñ�׼��JUnit @RunWithע��������JUnitʹ��Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest extends AbstractJUnit4SpringContextTests {
}