package com.aquarius.featuresprofile.controller;

import com.aquarius.featuresprofile.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */
@RestController
public class HelloController {

    @Value("${persion.name:李四}")
    private String name;
    @Autowired
    Person person;

    @Value("${os.name}")
    private String osname;

    @GetMapping("/")
    public String hello() {
        return osname;
    }
}
