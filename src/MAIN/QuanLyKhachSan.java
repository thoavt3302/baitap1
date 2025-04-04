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
