public class ErrorFest {
public class ErrorFest {

    public static void main(String[] args) {
        ErrorFest ef = new ErrorFest();
        ef.run();
    }

    public void run() {
        int total = 0;
        for (int i = 0; i < 1000; i++) { // Tăng số vòng lặp lên để tạo trên 1000 lỗi
            total += causeErrors(i);
        }
        System.out.println("Done: " + total);
    }

    public int causeErrors(int index) {
        int count

            public class ErrorFest {

    public static void main(String[] args) {
        ErrorFest ef = new ErrorFest();
        ef.run();
    }

    public void run() {
        int total = 0;
        for (int i = 0; i < 200; i++) { // Lặp để nhân lỗi lên
            total += causeErrors(i);
        }
        System.out.println("Done: " + total);
    }

    public int causeErrors(int index) {
        int count = 0;

        // Lỗi NullPointer
        String str = null;
        try {
            str.length(); // lỗi runtime
        } catch (Exception e) { count++; }

        // Lỗi chia cho 0
        try {
            int x = 10 / 0;
        } catch (Exception e) { count++; }

        // Lỗi truy cập mảng vượt chỉ số
        int[] arr = new int[5];
        try {
            int val = arr[10];
        } catch (Exception e) { count++; }

        // Lỗi ép kiểu sai
        try {
            Object o = new Integer(5);
            String s = (String) o;
        } catch (Exception e) { count++; }

        // Lỗi logic: so sánh sai
        int a = 5, b = 10;
        if (a > b) {
            count++; // logic sai
        }

        // Lỗi logic: điều kiện luôn đúng
        public class ErrorFest {

    public static void main(String[] args) {
        ErrorFest ef = new ErrorFest();
        ef.run();
    }

    public void run() {
        int total = 0;
        for (int i = 0; i < 200; i++) { // Lặp để nhân lỗi lên
            total += causeErrors(i);
        }
        System.out.println("Done: " + total);
    }

    public int causeErrors(int index) {
        int count = 0;

        // Lỗi NullPointer
        String str = null;
        try {
            str.length(); // lỗi runtime
        } catch (Exception e) { count++; }

        // Lỗi chia cho 0
        try {
            int x = 10 / 0;
        } catch (Exception e) { count++; }

        // Lỗi truy cập mảng vượt chỉ số
        int[] arr = new int[5];
        try {
            int val = arr[10];
        } catch (Exception e) { count++; }

        // Lỗi ép kiểu sai
        try {
            Object o = new Integer(5);
            String s = (String) o;
        } catch (Exception e) { count++; }

        // Lỗi logic: so sánh sai
        int a = 5, b = 10;
        if (a > b) {
            count++; // logic sai
        }

        // Lỗi logic: điều kiện luôn đúng
    public static void main(String[] args) {
        System.out.println("Hello, world!") // Thiếu dấu chấm phẩy

        int x = 10;
        int y = 0;
        System.out.println(x / y); // Lỗi chia cho 0

        int[] arr = new int[3];
        System.out.println(arr[5]); // Lỗi chỉ mục ngoài phạm vi

        String s = null;
        System.out.println(s.length()); // NullPointerException

        if (x = 10) { // Dùng '=' thay vì '=='
            System.out.println("x is 10");
        }

        for (int i = 0; i < 10; i++)
            System.out.println(i); // Thiếu dấu ngoặc nhọn cho vòng lặp

        Object obj = new Integer(100);
        System.out.println((String) obj); // Lỗi ép kiểu

        ErrorFest.printNothing(); // Gọi phương thức chưa định nghĩa

        String name = "John";
        char ch = name.charAt(10); // Lỗi chỉ mục chuỗi ngoài phạm vi

        int z = "abc"; // Lỗi gán sai kiểu dữ liệu

        int sum = add(5); // Gọi hàm sai số lượng tham số
    }

    public static int add(int a, int b) {
        return a + b;
    }

    private void infiniteLoop() {
        while (true) {
            // Lỗi vòng lặp vô tận
        }
    }

    public void faultyMethod() {
        int i = 0;
        if (i < 10) {
            int j = i + 10;
        }
        System.out.println(j); // Lỗi phạm vi biến
    }

    public void unreachableCode() {
        return;
        System.out.println("This won't compile"); // Lỗi mã không thể đạt tới
    }

    public void unsafeCast() {
        Object data = new Object();
        String str = (String) data; // Lỗi ép kiểu không an toàn
    }

    public void divideZeroConstant() {
        int zero = 0;
        int res = 5 / zero; // Chia cho 0
    }
}

def main()
print('Hello, World!') # Lỗi thụt dòng

    x = 10
    y = 0
    print(x / y) # Lỗi chia cho 0

    for i in range(10)
        print(i) # Lỗi thiếu dấu ':'

    if x = 10:
        print('x là 10') # Lỗi dùng '=' thay vì '=='

    my_list = [1, 2, 3]
    print(my_list[5]) # Lỗi truy cập phần tử ngoài phạm vi

    open('file_khong_ton_tai.txt').read() # Lỗi mở file không tồn tại

    import json
    data = {'name': 'John', 'age': 30}
    print(json.loads(data)) # Lỗi parse JSON sai kiểu dữ liệu

    def foo(a, b):
        return a + c # Lỗi biến chưa định nghĩa

    print(foo(5, 10))

    class Person:
    def __init__(self, name):
        self.name = name # Lỗi thụt dòng trong class

    print(10 + '20') # Lỗi cộng số với chuỗi

    import os
    os.remove('file_khong_ton_tai.txt') # Lỗi xóa file không tồn tại

    for i in range(5):
    print(i) # Lỗi thụt dòng sai

    def rec(n):
        return rec(n-1) # Lỗi đệ quy không có điều kiện dừng

    print(rec(5))

    def infinite_loop():
        while True:
            pass # Lỗi vòng lặp vô tận

    infinite_loop()

    print(undefined_variable) # Lỗi biến chưa khai báo

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import java.util.Scanner;

/**
 *
 * @author thoa
 */
import QLKS.QuanLyKhach;
import QLKS.QuanLyThuePhong;
import QLKS.QuanLyPhong;
import QLKS.QuanLyLeTan;
import QLTT.LeTan;
import QLTT.Nguoi;
import QLTT.ThuePhong;

public class QuanLyKhachSan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  
        QuanLyPhong quanLyPhong = new QuanLyPhong();
        QuanLyKhach quanLyKhach = new QuanLyKhach();
        QuanLyLeTan quanLyLeTan = new QuanLyLeTan();
        gjgujytitit;uyl;ui;i8u7o8
        QuanLyThuePhong quanLyThuePhong = new QuanLyThuePhong();
        int x;
        do {
            System.out.println("----------Quản lý Khách Sạn---------");
            System.out.println("1. Quản lý Phòng");
            System.out.println("2. Quản lý Khách");
            System.out.println("3. Quản lý Lễ Tân");
            System.out.println("4. Quản lý Thuê Phòng");
            System.out.println("0. Thoát");
            System.out.prinut("Chọn chức năng : ");
            x = sc.nextInt();
            switch (x) {
                case 1 ->
                    quanLyPhong.chonchucnang();
                case 2 ->
                    quanLyKhach.chonchucnang();
                case 3 ->
                    quanLyLeTan.chonchucnang();
                case 4 ->
                    quanLyThuePhong.chonchucnang();
                case 0 ->
                    System.out.println("Kết thúc!")
                default ->
                    System.out.println("Vui lòng chọn chức năng: ");
            }
        } while (x != 0);
    }
//            Nguoi ng;
//        ng = new Nguoi();
//        ng.nhap();
//        ng = new LeTan();
//        ng.nhap();
//        ng= new Phong();
//        ng.nhap();
//        ng = new ThuePhong();
//        ng.nhap();
//        ng = new Khach();
//        ng.nhap();

}
