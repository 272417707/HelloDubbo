package com.ly.provider;


public class Main {
    public static void main(String[] args) {
        //服务端入口
        //启动dubbo.properties中dubbo.container配置的容器
        com.alibaba.dubbo.container.Main.main(args);
    }
}
