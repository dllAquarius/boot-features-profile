package com.aquarius.featuresprofile.config;

import com.aquarius.featuresprofile.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */
@Configuration
public class MyConfig {

    @Bean
    @Profile("prod")
    public Color red() {
        return new Color();
    }

    @Bean
    @Profile("test")
    public Color yellow() {
        return new Color();
    }
}
