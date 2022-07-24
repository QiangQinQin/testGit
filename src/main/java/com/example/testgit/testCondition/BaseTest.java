package com.example.testgit.testCondition;

import com.alibaba.fastjson.JSON;
import com.example.testgit.TestgitApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * @author QiangQin
 * * @date 2022/7/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestgitApplication.class)
public class BaseTest implements ApplicationContextAware {
    @Autowired
    public ApplicationContext ApplicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ApplicationContext = applicationContext;
    }


    @Test
    public void testCondition() {
        System.out.println("hello  world");

        Map<String, Computer> beansOfType = ApplicationContext.getBeansOfType(Computer.class);

        System.out.println(JSON.toJSONString(beansOfType));

    }


}

