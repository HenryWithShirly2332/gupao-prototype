package com.ch.gupao.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {
        ConcreatePrototypeA concreatePrototype = new ConcreatePrototypeA();
        concreatePrototype.setAge(18);
        concreatePrototype.setName("Henry");
        List hobbies = new ArrayList<String>();
        concreatePrototype.setHobbies(hobbies);


        CLient cLient = new CLient();
        ConcreatePrototypeA copy = (ConcreatePrototypeA) cLient.StartClone(concreatePrototype);
        System.out.println(copy);

        System.out.println("克隆对象中引用类型的地址的值:" + copy.getHobbies());
        System.out.println("原对象中的引用类型的地址的值" + concreatePrototype.getHobbies());
        System.out.println("对象地址比较:" + (copy.getHobbies() == concreatePrototype.getHobbies()));
    }
}
