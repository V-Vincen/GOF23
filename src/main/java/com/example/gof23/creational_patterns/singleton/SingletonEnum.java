package com.example.gof23.creational_patterns.singleton;

/**
 * @ProjectName:
 * @Package:        com.example.gof23.creational_patterns.singleton
 * @ClassName:      SingletonEnum
 * @Description:    枚举类单例模式（Enum）
 * @Author:         Mr.Vincent
 * @CreateDate:     2019/8/5 0:40
 * @Version:        1.0.0
 */
public enum SingletonEnum {

    //这个枚举元素，本身就是单例对象（没有延时加载）
    INSTANCE;

    //添加自己需要的操作
    public void singletonOperation() {

    }
}
