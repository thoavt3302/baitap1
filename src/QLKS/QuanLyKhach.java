/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLKS;

import DocGhiFile.DocGhiFile;
import QLTT.Khach;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author thoa
 */
public class QuanLyKhach {

    Scanner sc = new Scanner(System.in);
    ArrayList<Khach> dskh = new ArrayList<>();
    DocGhiFile kh = new DocGhiFile();
    private int x;

    public QuanLyKhach() {

    }

    public void chonchucnang() {
        DocGhiFile dg = null;
        dg.GhiFileKhachHang("Khach.txt", dskh);
        do {
            System.out.println("------------Quản lý Khách Hàng------------");
            System.out.println("1. Thêm Khách Hàng");
            System.out.println("2. Sửa Khách Hàng");
            System.out.println("3. Xóa Khách Hàng");
            System.out.println("4. Tìm kiếm Khách Hàng");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc file");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng : ");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    tim();
                    break;
                case 5:
                    sapxep();
                    break;
                case 6:
                    dg.docFile("khach.txt");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng chọn chức năng: ");
            }
        } while (x != 0);

    }

    void them() {
        boolean check = false;
        sc.nextLine();
        System.out.println("------------Thêm Khách Hàng------------");
        System.out.print("Nhập số Khách Hàng cần thêm: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập Khách Hàng thứ " + (dskh.size() + 1) + " : ");
            Khach s = new Khach();
            s.nhap();
            for (Khach khach : dskh) {
                if (khach.getMaKhach().compareToIgnoreCase(s.getMaKhach()) == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Mã Khách Hàng bị trùng");
            } else {
                dskh.add(s);
                System.out.println("Thêm Khách Hàng thành công");
            }
        }
        DocGhiFile.GhiFileKhachHang("Khach.txt", dskh);
    }

    void sua() {
        boolean check = false;
        boolean check2 = false;
        sc.nextLine();
        System.out.println("-------------Sửa Khách Hàng------------");
        if (dskh.isEmpty()) {
            System.out.println("Danh sách trống hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Khách Hàng cần sửa: ");
            String makhachhang = sc.nextLine();
            for (Khach s : dskh) {
                if (s.getMaKhach().compareToIgnoreCase(makhachhang) == 0) {
                    check = true;
                    Khach s1 = new Khach();
                    s1.nhap();
                    for (Khach khachhang : dskh) {
                        if (khachhang.getMaKhach().compareToIgnoreCase(makhachhang) != 0 && s1.getMaKhach().compareToIgnoreCase(khachhang.getMaKhach()) == 0) {
                            System.out.println("Mã Khách Hàng đã tồn tại!");
                            check2 = true;
                            break;
                        }
                    }
                    if (!check2) {
                        s.setMaKhach(s1.getMaKhach());
                        s.setHoTen(s1.getHoTen());
                        s.setGioiTinh(s1.getGioiTinh());
                        s.setSoCMT(s1.getSoCMT());
                        s.setNamSinh(s1.getNamSinh());
                        DocGhiFile.GhiFileKhachHang("Khach.txt", dskh);
                        System.out.println("Sửa thành công");
                    }
                }
            }
            if (!check) {
                System.out.println("Không tồn tại mã Khách Hàng");
            }
        }
    }

    void xoa() {
        boolean check = false;
        int index = 0;
        sc.nextLine();
        System.out.println("------------Xóa Khách Hàng------------");
        if (dskh.isEmpty()) {
            System.out.println("Danh sách trống hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Khách Hàng cần xóa: ");
            String makhachhang = sc.nextLine();
            for (int i = 0; i < dskh.size(); i++) {
                Khach s = dskh.get(i);
                if (s.getMaKhach().compareToIgnoreCase(makhachhang) == 0) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                dskh.remove(index);
                DocGhiFile.GhiFileKhachHang("Khach.txt", dskh);
                System.out.println("Xóa thành công!");
            } else {
                System.out.println("Không tồn tại mã Khách Hàng!");
            }
        }
    }

    void tim() {
        String keyword;
        boolean check = false;
        sc.nextLine();
        System.out.println("------------Tìm kiếm Khách Hàng------------");
        if (dskh.isEmpty()) {
            System.out.println("Danh sách trống hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Khách Hàng hoặc tên Khách Hàng cần tìm: ");
            keyword = sc.nextLine();
            for (Khach s : dskh) {
                if (s.getMaKhach().compareToIgnoreCase(keyword) == 0) {
                    check = true;
                    System.out.print(s);
                }
            }
            if (!check) {
                System.out.println("Không tìm thấy!");
            }
        }
    }

    void sapxep() {
        dskh.sort(Comparator.comparing(Khach::getMaKhach));
        DocGhiFile.GhiFileKhachHang("Khach.txt", dskh);
        System.out.println("Sắp xếp thành công!");
    }

    void show() {
        System.out.println("----------Đọc file Khách Hàng----------");
        DocGhiFile.docFile("Khach.txt");
    }
}
