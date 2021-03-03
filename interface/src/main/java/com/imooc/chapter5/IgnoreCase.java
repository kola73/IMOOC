package com.imooc.chapter5;

import org.testng.annotations.Test;

// 是否执行
public class IgnoreCase {
    @Test(enabled = false)
    public void ignore1(){
        System.out.println("ignore1不执行");
    }
    @Test(enabled = true)
    public void ignore2(){
        System.out.println("ignore2执行了");
    }
}
