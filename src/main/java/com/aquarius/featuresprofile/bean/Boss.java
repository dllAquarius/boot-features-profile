package com.aquarius.featuresprofile.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */
@ConfigurationProperties("person")
@Profile("test")
@Component
public class Boss implements Person {

    private String name;

    private Integer age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
