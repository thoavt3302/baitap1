/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocGhiFile;

/**
 *
 * @author thoa
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import QLTT.Khach;
import QLTT.LeTan;
import QLTT.Phong;
import QLTT.ThuePhong;
import java.io.IOException;

public class DocGhiFile {

    //Hàm ghi danh sách Sách vào 1 file
//     ghi va doc tung doi tương doc lap trong file
    public void GhiFilePhong(String path, ArrayList<Phong> ds) {
//        khoi tao 1 file moi dung try catch de su li thong tin
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            ghi du lieu vao file
            BufferedWriter bw = new BufferedWriter(osw);
//            duyet tu dau den cuoi cai danh sach
            for (Phong phong : ds) {
//                dung cai bw de ghi file phong vao file path

                bw.write(phong.toString());
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            System.out.println("Ghi file thành công");
        } catch (Exception e) {
            System.err.println(" Lỗi ");
        }
    }

    public static void GhiFileKhachHang(String path, ArrayList<Khach> ds) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            for (Khach khach : ds) {
                bw.write(khach.toString());
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            System.out.println("Ghi file thành công");
        } //        IOException: Ngoại lệ liên quan đến file input / output
        catch (IOException e) {
            System.err.println(" Lỗi ");
        }
    }

    public void GhiFileLeTan(String path, ArrayList<LeTan> ds) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            for (LeTan leTan : ds) {
                bw.write(leTan.toString());
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            System.out.println("Ghi file thành công");
        } catch (Exception e) {
            System.err.println(" Lỗi ");
        }
    }

    public void GhiFileThuePhong(String path, ArrayList<ThuePhong> ds) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            for (ThuePhong thuePhong : ds) {
                bw.write(thuePhong.toString());
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            System.out.println("Ghi file thành công");
        } catch (Exception e) {
            System.err.println(" Lỗi  ");
        }
    }

    public static void docFile(String filename) {

        try {
            File f = new File(filename);
            if (f.exists()) {
                FileInputStream fis = new FileInputStream(filename);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    System.out.println();
                }
            } else {
                System.out.println("Không tồn tại file để đọc");
            }

        } catch (Exception e) {
            System.err.println(" Lỗi ");
        }

    }
}
