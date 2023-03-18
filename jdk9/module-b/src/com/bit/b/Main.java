package com.bit.b;

import com.bit.a.animal.Animal;

//import com.bit.a.person.Person;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Animal animal = new Animal();
        animal.exec();
        //因为只exports到animal包 所以person包无法引用 反射也无法使用
//        Person person = new Person();
        //opens了相关包只可以通过反射调用，但是无法通过import导入
        Class<?> aClass = Class.forName("com.bit.a.person.Person");
        Object o = aClass.newInstance();
        System.out.println(o.hashCode());

    }
}
