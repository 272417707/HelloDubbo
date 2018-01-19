package com.ly.consumer;

import com.ly.api.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiControl {
    @Autowired
    private SayHiService sayHiService;

    @RequestMapping("/sayHi.html")
    @ResponseBody
    public String noNeedTONamedSayHi(String name) {
        System.out.println("I'm Here!!!!!!!");
        System.out.println(name);
        String welcome = sayHiService.sayHi(name);
        return welcome;
    }
}
