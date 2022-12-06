/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: DynamicProxy
 * Author:   Chris
 * Date:     2022/12/6 10:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.thinkjava.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Chris
 * @date 2022/12/6
 */
public class DynamicProxy {
    public static void main(String[] args) {
        Drive realCar = new Car();
        DriveProxy proxy = new DriveProxy(realCar);
        Drive proxyCar = (Drive) proxy.getProxy();
        proxyCar.speed();
    }
}

interface Drive {
    void speed();
}

class Car implements Drive {
    @Override
    public void speed() {
        System.out.println("run 120 yard");
    }
}

class DriveProxy implements InvocationHandler {

    private Object target;

    DriveProxy(Object target){
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pre handle before invoke real method()");
        Object result = method.invoke(target, args);
        System.out.println("post handle after invoke real method()");
        return result;
    }
}