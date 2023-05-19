/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author acer
 * Quy tắc đặt tên class: Các chữ cái đầu luôn luôn viết in hoa, 
 * và bắt đầu mỗi từ mới thì viết in hoa chữ cái đầu
 * VD: Student, StudentList
 */
public class Student {
    String name;
    int age;
    String address;
    
    //Constructor : (construct: khối cấu trúc) hàm khởi tạo, 
    //Constructor rỗng
    public Student() {
    }
    //Constructor
    public Student(String name, int age, String address) {
        //This là đại diện cho lớp đối tượng
        //This.name => attribute name của lớp đối tượng
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }
}
