package com.singhcse.systemdesign.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Avii",25);
        Student s2 = s1.clone();
        s2.setAge(26);
        s2.setName("Bikash");
        System.out.println(s1);
        System.out.println(s2);
    }
}
