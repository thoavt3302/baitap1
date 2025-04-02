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
import QLTT.Phong;

import java.util.Comparator;

public class QuanLyPhong {

    Scanner sc = new Scanner(System.in);
    ArrayList<Phong> dsp = new ArrayList<>();
    DocGhiFile dg = new DocGhiFile();
    private int x;

    public QuanLyPhong() {

    }

    public void chonchucnang() {
        dg.GhiFilePhong("Phong.txt", dsp);
        do {
            System.out.println("-------------Quản lý Phòng------------");
            System.out.println("1. Thêm Phòng");
            System.out.println("2. Sửa Phòng");
            System.out.println("3. Xóa Phòng");
            System.out.println("4. Tìm kiếm Phòng");
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
                    dg.docFile("Phong.txt");
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
        System.out.println("-------------Thêm Phòng------------");
        System.out.print("Nhập số Phòng cần thêm : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Phong s = new Phong();
            check = false;
            System.out.println("Nhập Phòng thứ " + (dsp.size() + 1) + " : ");
            s.nhap();
            for (Phong phong : dsp) {
                if (phong.getSoPhong().compareToIgnoreCase(s.getSoPhong()) == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Mã Phòng bị trùng");
            } else {
                dsp.add(s);
                System.out.println("Thêm Phòng thành công");
            }
        }
        dg.GhiFilePhong("Phong.txt", dsp);
    }

    void sua() {
        boolean check = false;
        boolean check2 = false;
        System.out.println("-------------Sửa Phòng------------");

        if (dsp.size() == 0) {
            System.out.println("**Danh sách rỗng hãy thêm Phòng để thực hiện chức năng!**");
        } else {
            sc.nextLine();
            System.out.print("Nhập số Phòng cần sửa : ");
            String sophong = sc.nextLine();
            for (Phong s : dsp) {
                if (s.getSoPhong().compareToIgnoreCase(sophong) == 0) {
                    check = true;
                    Phong s1 = new Phong();
                    s1.nhap();
                    for (Phong phong : dsp) {
                        if (phong.getSoPhong().compareToIgnoreCase(sophong) != 0 && s1.getSoPhong().compareToIgnoreCase(phong.getSoPhong()) == 0) {
                            System.out.println("Mã phòng bị trùng");
                            check2 = true;
                            break;
                        }
                    }
                    if (!check2) {
                        s.setSoPhong(s1.getSoPhong());
                        s.setLoaiPhong(s1.getLoaiPhong());
                        s.setGiaTien(s1.getGiaTien());
                        s.setSoluong(s1.getSoluong());
                        dg.GhiFilePhong("Phong.txt", dsp);
                        System.out.println("Sửa thành công!");
                    }
                }
            }
            if (!check) {
                System.out.println("Không tồn tại mã phòng!");
            }
        }
    }

    void xoa() {
        boolean check = false;
        int index = 0;
        sc.nextLine();
        System.out.println("------------Xóa Phòng------------");
        if (dsp.size() == 0) {
            System.out.println("Danh sách rỗng hãy nhập thêm Phòng để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Phòng cần xóa: ");
            String sophong = sc.nextLine();
            for (int i = 0; i < dsp.size(); i++) {
                Phong s = dsp.get(i);
                if (s.getSoPhong().compareToIgnoreCase(sophong) == 0) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                dsp.remove(index);
                dg.GhiFilePhong("Phong.txt", dsp);
                System.out.println("Xóa thành công!");
            } else {
                System.out.println("Không tồn tại mã Phòng!");
            }
        }
    }

    void tim() {
        String keyword;
        boolean check = false;
        sc.nextLine();
        System.out.println("----------Tìm kiếm Phòng----------");
        if (dsp.size() == 0) {
            System.out.println("Danh sách rỗng hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Phòng hoặc loại Phòng cần tìm: ");
            keyword = sc.nextLine();
            for (Phong s : dsp) {
                if (s.getSoPhong().compareToIgnoreCase(keyword) == 0 || s.getLoaiPhong().compareToIgnoreCase(keyword) == 0) {
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
        dsp.sort(Comparator.comparing(Phong::getGiaTien));
        dg.GhiFilePhong("Phong.txt", dsp);
        System.out.println("Sắp xếp thành công!");
    }

    void show() {
        System.out.println("----------Đọc file Phòng----------");
        dg.docFile("Phong.txt");
    }

}
