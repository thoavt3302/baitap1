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

import QLTT.ThuePhong;
import java.util.Comparator;

public class QuanLyThuePhong {

    Scanner sc = new Scanner(System.in);
    ArrayList<ThuePhong> dstp = new ArrayList<>();
    DocGhiFile dg = new DocGhiFile();
    private int x;

    public QuanLyThuePhong() {

    }

    public void chonchucnang() {
        dg.GhiFileThuePhong("ThuePhong.txt", dstp);
        do {
            System.out.println("------------Quản lý Thuê Phòng------------");
            System.out.println("1. Thêm Mã Thuê Phòng");
            System.out.println("2. Sửa Mã Thuê Phòng");
            System.out.println("3. Xóa Mã Thuê Phòng");
            System.out.println("4. Tìm kiếm Mã Thuê Phòng");
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
                    dg.docFile("ThuePhong.txt");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng chọn chức năng :");
            }
        } while (x != 0);
    }

    void them() {
        boolean check = false;
        sc.nextLine();
        System.out.print("Nhập số mã Thuê Phòng cần thêm : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập mã Thuê Phòng thứ " + (dstp.size() + 1) + " : ");
            ThuePhong s = new ThuePhong();
            s.nhap();
            for (ThuePhong thuePhong : dstp) {
                if (thuePhong.getSoPhong().compareToIgnoreCase(s.getSoPhong()) == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Mã Thuê Phòng bị trùng");
            } else {
                dstp.add(s);
                System.out.println("Thêm mã Thuê Phòng thành công");
            }
        }
        dg.GhiFileThuePhong("ThuePhong.txt", dstp);
    }

    void sua() {
        boolean check = false;
        boolean check2 = false;
        sc.nextLine();
        System.out.println("-------------Sửa Mã Thuê Phòng------------");
        if (dstp.size() == 0) {
            System.out.println("Danh sách trống hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập số  Phòng cần sửa: ");
            String mathuephong = sc.nextLine();
            for (ThuePhong s : dstp) {
                if (s.getSoPhong().compareToIgnoreCase(mathuephong) == 0) {
                    check = true;
                    ThuePhong s1 = new ThuePhong();
                    s1.nhap();
                    for (ThuePhong muonthuephong : dstp) {
                        if (muonthuephong.getSoPhong().compareToIgnoreCase(mathuephong) != 0 && s1.getSoPhong().compareToIgnoreCase(muonthuephong.getSoPhong()) == 0) {
                            System.out.println("Mã Thuê Phòng bị trùng!");
                            check2 = true;
                            break;
                        }
                    }
                    if (!check2) {
                        s.setLoaiPhong(s1.getLoaiPhong());
                        s.setSoPhong(s1.getSoPhong());
                        s.setNgayThue(s1.getNgayThue());
                        s.setNgayDi(s1.getNgayDi());
                        s.setGiaTien(s1.getGiaTien());
                        dg.GhiFileThuePhong("ThuePhong.txt", dstp);
                        System.out.println("Sửa thành công");
                    }
                }
            }
            if (!check) {
                System.out.println("Không tồn tại mã Thuê Phòng");
            }
        }

    }

    void xoa() {
        boolean check = false;
        int index = 0;
        sc.nextLine();
        System.out.println("------------Xóa mã Thuê Phòng------------");
        if (dstp.size() == 0) {
            System.out.println("Danh sách rỗng hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Thuê Phòng cần xóa: ");
            String mathuephong = sc.nextLine();
            for (int i = 0; i < dstp.size(); i++) {
                ThuePhong s = dstp.get(i);
                if (s.getSoPhong().compareToIgnoreCase(mathuephong) == 0) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                dstp.remove(index);
                dg.GhiFileThuePhong("ThuePhong.txt", dstp);
                System.out.println("Xóa thành công!");
            } else {
                System.out.println("Không tồn tại mã Thuê Phòng!");
            }
        }

    }

    void tim() {
        String keyword;
        boolean check = false;
        sc.nextLine();
        System.out.println("------------Tìm mã Thuê Phòng------------");
        if (dstp.size() == 0) {
            System.out.println("Danh sách rỗng hãy nhập thêm để thực hiện chức năng!");
        } else {
            System.out.print("Nhập mã Thuê Phòng cần tìm: ");
            keyword = sc.nextLine();
            for (ThuePhong s : dstp) {
                if (s.getSoPhong().compareToIgnoreCase(keyword) == 0) {
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
        dstp.sort(Comparator.comparing(ThuePhong::getGiaTien));
        dg.GhiFileThuePhong("ThuePhong.txt", dstp);
        System.out.println("Sắp xếp thành công");
    }

    void show() {
        System.out.println("----------Đọc file Thuê Phòng----------");
        dg.docFile("ThuePhong.txt");
    }

}
