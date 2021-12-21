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
@Profile("prod")
@Component
public class Woker implements Person {

    private String  name;
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
