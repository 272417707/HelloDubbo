package com.ly.provider;
//这里import的是api中的class，也就是provider和consumer都要实现的公共接口
import com.ly.api.SayHiService;


public class SayHiServiceImpl implements SayHiService {
    //公共接口中的方法，consumer会调用这个方法
    public String sayHi(String s) {
        System.out.println("WOW, I was called!");
        System.out.println(s);
        return "hello " + s + "!";
    }
}
