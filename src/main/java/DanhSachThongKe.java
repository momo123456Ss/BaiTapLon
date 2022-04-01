import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachThongKe {
    List<ThongKeKetQuaHocTap> thongKe = new ArrayList<>();
    public void docThongKe(String path){
        File f = new File(path);
        try(Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                String nd = scanner.nextLine();
                ThongKeKetQuaHocTap tk = new ThongKeKetQuaHocTap(nd);
                this.thongKe.add(tk);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void hienThiDanhSach(){
        for (ThongKeKetQuaHocTap h: this.thongKe){
            h.hienThiThongKe();
        }
    }
    public void thongKeThang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng muốn xem: ");
        String n = sc.nextLine();
        for (ThongKeKetQuaHocTap h: this.thongKe){
            if (h.getKetQua().contains(n) == true){
                h.hienThiThongKe();
            }
        }
    }
}
