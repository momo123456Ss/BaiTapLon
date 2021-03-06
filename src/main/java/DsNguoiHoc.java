import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DsNguoiHoc {
    public static int SO_LUONG_HOC_VIEN = 11;
    public  static void setSoLuongHocVienXoa(){
        SO_LUONG_HOC_VIEN = SO_LUONG_HOC_VIEN - 1;
    }
    public  static void setSoLuongHocVienThem(){
        SO_LUONG_HOC_VIEN = SO_LUONG_HOC_VIEN + 1;
    }
    private List<KetQuaHocTap> dsKetQua = new ArrayList<>();
    private List<NguoiHoc> ds = new ArrayList<>();
    private static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private static final Scanner sc = new Scanner(System.in);
    public void themHV(NguoiHoc h){
        ds.add(h);
        NguoiHoc.setDem();
    }
    public void xoaHV(int n){
        ds.remove(n);
        NguoiHoc.setDem();
    }
    public void docDsNguoiHoc(String path) throws FileNotFoundException {
        File f = new File(path);
        try(Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                String hoTen = scanner.nextLine();
                String gioiTinh = scanner.nextLine();
                String queQuan = scanner.nextLine();
                String ngaySinh = scanner.nextLine();
                String ngayThamGia = scanner.nextLine();
                NguoiHoc Hv = new NguoiHoc(hoTen,gioiTinh,queQuan,ngaySinh,ngayThamGia);
                this.ds.add(Hv);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public void hienThiDanhSach(){
        for (NguoiHoc h : this.ds){
            h.hienThiDsNguoiHoc();
        }
        NguoiHoc.setDem();
    }

//    public void hienThiDanhSachCapNhat(){
//        for (NguoiHoc h : this.ds){
//            h.hienThiDsNguoiHocDeCapNhat();
//        }
//        NguoiHoc.setDem();
//    }

    public List<NguoiHoc> docThongTinNguoiHoc(){
        return this.ds.stream().collect(Collectors.toList());
    }
    public List<KetQuaHocTap> docThongTinKetQuaHocTap(){
        return this.dsKetQua.stream().collect(Collectors.toList());
    }

    public static void xuatKetQuaNguoiHoc(String path,List<NguoiHoc> kqhoctap) throws FileNotFoundException {
        File f = new File(path);
        try (PrintWriter w = new PrintWriter(f)){
            for (NguoiHoc h : kqhoctap){
                w.printf("%d - %s\n",h.getMaHV(),h.getHoTen());
            }
        }

    }

    public static void capNhat(String path,List<NguoiHoc> capnhat) throws IOException {
        File f = new File(path);
        FileWriter w2 = new FileWriter(f,true);
        try (PrintWriter w = new PrintWriter(w2)){
            for (NguoiHoc h : capnhat){
                w.printf("%s\n%s\n%s\n%s\n%s\n",h.getHoTen(),h.getGioiTinh(),h.getQueQuan(),new SimpleDateFormat("dd/MM/yyyy").format(h.getNgaySinh()),new SimpleDateFormat("dd/MM/yyyy").format(h.getNgayGiaNhap()));
            }
        }

    }
    public static void capNhatXoa(String path,List<NguoiHoc> capnhat) throws IOException {
        File f = new File(path);
        try (PrintWriter w = new PrintWriter(f)){
            for (NguoiHoc h : capnhat){
                w.printf("%s\n%s\n%s\n%s\n%s\n",h.getHoTen(),h.getGioiTinh(),h.getQueQuan(),new SimpleDateFormat("dd/MM/yyyy").format(h.getNgaySinh()),new SimpleDateFormat("dd/MM/yyyy").format(h.getNgayGiaNhap()));
            }
        }
        NguoiHoc.setDem();
    }

    public void capNhatThongTin(int mahv) throws ParseException, IOException {
        int choose;
        String upDateHoTen;
        for (NguoiHoc h : this.ds){
            if(h.getMaHV() == mahv){
                do {
                    System.out.print("====MENU c???p nh???t====\n1.H??? t??n\n2.Gi???i t??nh\n3.Ng??y sinh\n4.Ng??y tham gia\n0.Ket Thuc\n");
                    System.out.print("=>B???n ch???n : ");
                    choose = sc.nextInt();
                    sc.nextLine();
                    switch (choose) {
                        case 1:
                            System.out.print("Nh???p t??n mu???n ?????i: ");
                            String tmp = h.getHoTen();
                            upDateHoTen = sc.nextLine();
                            h.setHoTen(upDateHoTen);
                            docDsKetQuaNguoiHocCapNhat();
                            for (KetQuaHocTap q : this.dsKetQua){
                                if (q.getTenNguoiHoc().equals(tmp)){
                                    q.setTenNguoiHoc(upDateHoTen);
                                }
                            }
                            System.out.println(tmp);
                            List<KetQuaHocTap> kqNguoiHoc =  docThongTinKetQuaHocTap();
                            capNhatKetQuaSoLanLamBai(kqNguoiHoc);
                            break;
                        case 2:
                            System.out.print("Nh???p gi???i t??nh mu???n ?????i : ");
                            String upDateGioiTinh = sc.nextLine();
                            h.setGioiTinh(upDateGioiTinh);
                            break;
                        case 3:
                            System.out.print("Nh???p ng??y sinh mu???n ?????i : ");
                            String upNgaySinh = sc.nextLine();
                            Date ns = f.parse(upNgaySinh);
                            h.setNgaySinh(ns);
                            break;
                        case 4:
                            System.out.print("Nh???p ng??y tham gia mu???n ?????i : ");
                            String upNgayThamGia = sc.nextLine();
                            Date ntg = f.parse(upNgayThamGia);
                            h.setNgaySinh(ntg);
                            break;

                    }
                }while (choose >= 1 && choose <= 4);
            }
        }
    }
    public void capNhatKetQuaThem(String hoten) throws IOException {
        File f = new File("src/main/resources/ketquahoctap.txt");
        FileWriter w2 = new FileWriter(f,true);
        try (PrintWriter w = new PrintWriter(w2)){
                w.printf("%s\n%d\n",hoten,0);
        }
    }
    public void capNhatKetQuaXoa(List<NguoiHoc> capnhat) throws IOException {
        File f = new File("src/main/resources/ketquahoctap.txt");
        try (PrintWriter w = new PrintWriter(f)){
            for (NguoiHoc h : capnhat){
                w.printf("%s\n%d\n",h.getHoTen(),0);
            }
        }
    }
    public void capNhatKetQua(List<NguoiHoc> capnhat) throws IOException {
        File f = new File("src/main/resources/ketquahoctap.txt");
        try (PrintWriter w = new PrintWriter(f)){
            for (NguoiHoc h : capnhat){
                w.printf("%s\n%d\n",h.getHoTen(),0);
            }
        }
    }

    public void capNhatKetQuaSoLanLamBai(List<KetQuaHocTap> capnhat) throws IOException {
        File f = new File("src/main/resources/ketquahoctap.txt");
        try (PrintWriter w = new PrintWriter(f)){
            for (KetQuaHocTap h : capnhat){
                w.printf("%s\n%d\n",h.getTenNguoiHoc(),h.getSoLanLamBai());
            }
        }
    }
    public void docDsKetQuaNguoiHocCapNhat() throws FileNotFoundException {
        File f = new File("src/main/resources/ketquahoctap.txt");
        try(Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                String hoTen = scanner.nextLine();
                int soLan = scanner.nextInt();
                scanner.nextLine();
                KetQuaHocTap kq = new KetQuaHocTap(hoTen,soLan);
                this.dsKetQua.add(kq);
            }
        }
    }
}
