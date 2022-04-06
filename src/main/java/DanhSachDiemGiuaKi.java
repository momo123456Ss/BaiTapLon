import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachDiemGiuaKi {
    private List<DiemThiGiuaKi> dsDiem = new ArrayList<>();

    public void docFileDiem() throws FileNotFoundException {
        File f = new File("src/main/resources/testfile.txt");
        try(Scanner scanner = new Scanner(f)){
            while (scanner.hasNext()) {
                String nd = scanner.nextLine();
                String diem = scanner.nextLine();
                DiemThiGiuaKi hocvien = new DiemThiGiuaKi(nd,diem);
                this.dsDiem.add(hocvien);
            }
        }
    }

    public void timKiem(){
        double tong = 0;
        Scanner sc = new Scanner(System.in);
        String soThang,hoTen;
        System.out.print("Nhập số tháng: ");
        soThang = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        double dem = 0;
        for (DiemThiGiuaKi h : this.dsDiem){
            if(h.getNoiDung().contains(soThang)&&h.getNoiDung().contains(hoTen)){
                tong+= Double.parseDouble(h.getDiem());
                dem = dem + 1;
            }
        }
        double diemTrungBinh = tong / dem;
        System.out.printf("Tháng %s --- %s có điểm trung bình là : %.3f\n",soThang,hoTen,diemTrungBinh);
    }
}
