package com.singhcse.systemdesign.designpatterns.prototype;

import lombok.Data;

@Data
public class Student implements ProtoType<Student> {
    private int id;
    private String name;
    private int age;

    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public Student clone() {
        return new Student(id,name,age);
    }

     public String toString(){
         return "Studnets's name is : "+this.name+" with id : "+this.id+" with age : "+this.age;
     }
}
