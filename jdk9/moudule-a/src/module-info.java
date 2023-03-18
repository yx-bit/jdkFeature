module moudule.a {
    //import和反射都可以
    exports com.bit.a.animal;
    //只允许通过反射调用
    opens com.bit.a.person;
}