package com.example.testgit.testCondition;

/**
 * @author QiangQin
 * * @date 2022/7/24
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

//        @Bean(name = "notebookPC")
    public Computer computer1() {
        return new Computer("笔记本电脑");
    }

    //    @ConditionalOnBean(Computer.class)
    @ConditionalOnMissingBean(Computer.class)
    @Bean("notebookPC")
    public Computer computer2() {
        return new Computer("备用电脑");
    }
}
