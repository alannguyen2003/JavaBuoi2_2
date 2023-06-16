/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MainApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter integer number: ");
//        int number = sc.nextInt();
//        System.out.println(number);
        //Nhập các giá trị cho từng phần tử của mảng array[0] = sc.  bla bla
//        int[] array = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Enter integer number at index " + i + ": ");
//            array[i] = sc.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        //Cũng là nhập vào các giá trị cho từng phần tử bên trong mảng,
        //Nhưng chỉ in ra các giá trị chia hết cho giá trị x được nhập vào từ bàn phím
        
        /**
         * 1. Viết chương trình tìm nghiệm của phương trình bậc nhất, với hệ số đầu vào là a và b.
         *  ax + b = 0
         * 2. Viết chương trình tìm nghiệm của phương trình bậc hai, với hệ số đầu vào là a, b và c.
         *  ax^2 + bx + c = 0
         * 3. Viết chương trình kiểm tra một số nguyên tố nhập vào từ bàn phím
         *  Kết quả: number = 17 => true, number = 16 => false
         * 4. Viết chương trình khai báo một mảng các số nguyên, in ra các số là số nguyên tố
         *  VD: a = {1, 3, 7, 10, 12}
         *  => 3, 7
         * DEADLINE: Thứ 3, 16/5/2023
         */
        //tạo một đối tượng, như tên, tuổi, địa chỉ, ...
        //OBJECT : đối tượng
//        Student student = new Student("Tran Tuan Kiet", 20, "Vinhomes");
//        System.out.println(student.age >= 20);
        //Bài tập: Tạo một lớp đối tượng Student, có 6 thuộc tính:
        /**
         * 1. Name
         * 2. Age
         * 3. Address
         * 4. Class
         * 5. School
         * 6. Hobby
         * 1.1 In ra và kiểm tra xem, tên học sinh có phải là Tran Tuan Kiet
         * 1.2 In ra và kiểm tra xem, học sinh có phải đang học lớp SE18xx (Class này có đầu chuỗi là SE18 và theo sau là 2 số nguyên)
         * VD: SE1845, SE1859..., nếu như sai format, thì in ra lớp không tồn tại
         * 1.3 In ra và kiểm tra trường của học sinh có phải FPT không
         * 1.4 Kiểm tra và in ra true nếu address của student là HCM
         * Bài sau sẽ học: Tính đóng gói và kế thừa trong OOP
         */
//        Student student = new Student("Tran Tuan Kiet", 20, "HCM", "FPTU", "SE1745", "hh");
//        if (student.name.equals("Tran Tuan Kiet")) {
//            System.out.println("Học sinh đúng!");
//        } else {
//            System.out.println("Sai tên học sinh!!");
//        }
//        //method (Phương thức): matches(pattern) : sẽ trả ra kết quả đúng nếu chuỗi này matches với pattern mà mình đã đề ra.
//        if (student.className.matches("^SE18\\d{2}$")) {
//            System.out.println("Lớp học đang hiện diện!");
//        } else {
//            System.out.println("Lớp học không có trên hệ thống!!");
//        }
        //pattern : một công thức để sinh ra một chuỗi
        //SE18xx 
        /**
         * Regular Expression
         * Công thức chung: 
         *  + Mã đầu: F, SE, FD,....
         *  + Mã cuối: bao gồm các số tự nhiên bất kì, có thể có bao nhiêu số cũng được
         * VD: SE1845 (SE18xx), SE1842 (SE18xx),...
         * Pattern mẫu: 
         * ^F\\d{3}$ => Fxxx
         * SE18xx => ^SE18\\d{2}$
         * FERxxxx => ^FER\\d{4}$
         */
        //meo meo
    }
    
}
