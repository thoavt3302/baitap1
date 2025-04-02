/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLKS;

/**
 *
 * @author thoa
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import DocGhiFile.DocGhiFile;

import QLTT.LeTan;
import java.util.Comparator;

public class QuanLyLeTan {

    Scanner sc = new Scanner(System.in);
    ArrayList<LeTan> dslt = new ArrayList<>();
    DocGhiFile dg = new DocGhiFile();
    private int x;

    public QuanLyLeTan() {

    }

    public void chonchucnang() {
        dg.GhiFileLeTan("LeTan.txt", dslt);
        do {
            System.out.println("-------------Quản lý Lễ Tân------------");
            System.out.println("1. Thêm Lễ Tân");
            System.out.println("2. Sửa Lễ Tân");
            System.out.println("3. Xóa Lễ Tân");
            System.out.println("4. Tìm kiếm Lễ Tân");
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
                    dg.docFile("LeTan.txt");
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
        System.out.println("-------------Thêm Lễ Tân------------");
        System.out.print("Nhập số Lễ Tân cần thêm : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập Lễ Tân thứ " + (dslt.size() + 1) + " : ");
            LeTan s = new LeTan();
            s.nhap();
            dslt.add(s);
            for (LeTan letan : dslt) {
                if (letan.getMaLeTan().compareToIgnoreCase(s.getMaLeTan()) == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Thêm Lễ Tân thành công");
            } else {
                dslt.add(s);
                System.out.println("Thêm Lễ Tân thành công");
            }
        }
        dg.GhiFileLeTan("LeTan.txt", dslt);
    }

    void sua() {
        boolean check = false;
        sc.nextLine();
        System.out.println("-------------Sửa Lễ Tân------------");
        if (dslt.size() == 0) {
            System.out.println("Danh sách rỗng hãy nhập lại để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Lễ Tân cần sửa : ");
            String maletan = sc.nextLine();
            for (LeTan s : dslt) {
                if (s.getMaLeTan().compareToIgnoreCase(maletan) == 0) {
                    check = true;
                    boolean check2 = false;
                    LeTan s1 = new LeTan();
                    s1.nhap();
                    for (LeTan letan : dslt) {
                        if (letan.getMaLeTan().compareToIgnoreCase(maletan) != 0 && s1.getMaLeTan().compareToIgnoreCase(letan.getMaLeTan()) == 0) {
                            System.out.println("Mã Lễ Tân bị trùng!");
                            check2 = true;
                            break;
                        }
                    }
                    if (!check2) {
                        s.setMaLeTan(s1.getMaLeTan());
                        s.setHoTen(s1.getHoTen());
                        s.setGioiTinh(s1.getGioiTinh());
                        s.setNamSinh(s1.getNamSinh());
                        dg.GhiFileLeTan("LeTan.txt", dslt);
                        System.out.println("Sửa thành công!");
                    }
                }
            }
            if (!check) {
                System.out.println("Không tồn tại Lễ Tân!");
            }
        }

    }

    void xoa() {
        boolean check = false;
        int index = 0;
        sc.nextLine();
        System.out.println("------------Xóa Lễ Tân------------");
        if (dslt.size() == 0) {
            System.out.println("Danh sách rỗng hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Lễ Tân cần xóa: ");
            String maletan = sc.nextLine();
            for (int i = 0; i < dslt.size(); i++) {
                LeTan s = dslt.get(i);
                if (s.getMaLeTan().compareToIgnoreCase(maletan) == 0) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                dslt.remove(index);
                dg.GhiFileLeTan("LeTan.txt", dslt);
                System.out.println("Xóa thành công!");
            } else {
                System.out.println("Không tồn tại mã Lễ Tân!");
            }
        }

    }

    void tim() {
        String keyword;
        boolean check = false;
        sc.nextLine();
        System.out.println("------------Tìm kiếm Lễ Tân------------");
        if (dslt.size() == 0) {
            System.out.println("Danh sách trống hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Lễ Tân hoặc tên Lễ Tân cần tìm: ");
            keyword = sc.nextLine();
            for (LeTan s : dslt) {
                if (s.getMaLeTan().compareToIgnoreCase(keyword) == 0) {
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
        dslt.sort(Comparator.comparing(LeTan::getMaLeTan));
        dg.GhiFileLeTan("LeTan.txt", dslt);
        System.out.println("Sắp xếp thành công!");
    }

    void show() {
        System.out.println("----------Đọc file Lễ Tân----------");
        dg.docFile("LeTan.txt");
    }
}
