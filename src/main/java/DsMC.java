import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DsMC {
    private List<MutiChoice> dsMC = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private static final int SO_DAP_AN_DUNG = 6;
    private int soCauDungMutipleChoice = 0;
    public void hienThiDanhSach(){
        for (MutiChoice h : this.getDsMC()){
            h.hienThi();
        }
    }

    public void docFileMC(String path) throws FileNotFoundException {
        File f = new File(path);
        try(Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                String noiDung = scanner.nextLine();
                String dapAn1 = scanner.nextLine();
                String dapAn2 = scanner.nextLine();
                String dapAnDung = scanner.nextLine();
                String danhMuc = scanner.nextLine();
                String doKho = scanner.nextLine();
                MutiChoice mC = new MutiChoice(noiDung,dapAn1,dapAn2,dapAnDung,danhMuc,doKho);
                this.dsMC.add(mC);
            }
        }
    }

    public void chonDapAnMutipleChoice(){
        int i = 1;
        for (MutiChoice h : this.dsMC){
            System.out.printf("Câu thứ %d: %s\n",i++,h.getNoiDung());
            System.out.printf("A.%s\tB.%s\n",h.getDapAn1(),h.getDapAn2());
            System.out.print("Nhập đáp án A hoặc B : ");
            String dapAnDung = sc.nextLine();
            if(dapAnDung.equalsIgnoreCase(h.getDapAnDung())){
                soCauDungMutipleChoice++;
            }
        }
        System.out.printf("Số câu đúng của phần Muti Choice : %d/%d\n",soCauDungMutipleChoice,this.dsMC.size());
    }

    public void chonDapAnCauHoiRandom(){
        Random rand = new Random();
        int i = 1;
        int soCauDung = 0;
        for (MutiChoice h : this.dsMC) {
            String randomElement = String.valueOf(dsMC.get(rand.nextInt(dsMC.size())));
            System.out.printf("Câu thứ %d: %s\n",i++,h.getNoiDung());
            System.out.printf("A.%s\tB.%s\n",h.getDapAn1(),h.getDapAn2());
            System.out.print("Nhập đáp án A hoặc B : ");
            String dapAnDung = sc.nextLine();
            if(dapAnDung.equalsIgnoreCase(h.getDapAnDung())){
                soCauDung++;
            }
        }
        System.out.printf("Số câu đúng của phần Muti Choice : %d/%d\n",soCauDung,this.dsMC.size());
    }

    public List<MutiChoice> timKiemTheoNoiDungDanhMucMucDo(String tuKhoa,String dm,String mucDo) {
        return this.dsMC.stream().filter(h -> h.getNoiDung().contains(tuKhoa) == true && h.getDanhMuc().contains(dm) == true && h.getDoKho().contains(mucDo) == true).collect(Collectors.toList());
    }

    public List<MutiChoice> timKiemTheoNoiDungDanhMucMucDo(String tuKhoa) {
        return this.dsMC.stream().filter(h -> h.getNoiDung().contains(tuKhoa) == true || h.getDanhMuc().contains(tuKhoa) == true || h.getDoKho().contains(tuKhoa) == true).collect(Collectors.toList());
    }
    public List<MutiChoice> getDsMC() {
        return dsMC;
    }

    public void setDsMC(List<MutiChoice> dsMC) {
        this.dsMC = dsMC;
    }
}
