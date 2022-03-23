import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
    private List<NguoiHoc> ds = new ArrayList<>();
    public void themHV(NguoiHoc h){
        ds.add(h);
    }
    public void xoaHV(NguoiHoc h){
        ds.remove(h);
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
    }

    public List<NguoiHoc> docThongTinNguoiHoc(){
        return this.ds.stream().collect(Collectors.toList());
    }

    public static void xuatKetQuaNguoiHoc(String path,List<NguoiHoc> kqhoctap) throws FileNotFoundException {
        File f = new File(path);
        try (PrintWriter w = new PrintWriter(f)){
            for (NguoiHoc h : kqhoctap){
                w.printf("%d - %s\n",h.getMaHV(),h.getHoTen());
            }
        }

    }

    public static void capNhat(String path,List<NguoiHoc> capnhat) throws FileNotFoundException {
        File f = new File(path);
        try (PrintWriter w = new PrintWriter(f)){
            for (NguoiHoc h : capnhat){
                w.printf("%s\n%s\n%s\n%s\n%s\n",h.getHoTen(),h.getGioiTinh(),h.getQueQuan(),new SimpleDateFormat("dd/MM/yyyy").format(h.getNgaySinh()),new SimpleDateFormat("dd/MM/yyyy").format(h.getNgayGiaNhap()));
            }
        }

    }
}
