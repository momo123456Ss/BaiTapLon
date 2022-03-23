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

    public void chonDapAnChoCauHoiMC(){
        for (MutiChoice h: this.dsMC){
            h.chonDapAn();
        }
        System.out.printf("Số câu đúng của phần Muti Choice : %d/%d\n", MutiChoice.soCauDungMutipleChoice, MutiChoice.SO_CAU);
    }

    public void chonDapAnCauHoiRandomMutiChoice(){
        int index,oldIndex;
        Random rand = new Random();
        for (int i = 0 ; i< dsMC.size();i++){
            index = rand.nextInt(dsMC.size());
            MutiChoice randomElemen = dsMC.get(index);
            randomElemen.chonDapAn();
        }
        System.out.printf("Số câu đúng của phần Muti Choice : %d/%d\n", MutiChoice.soCauDungMutipleChoice, MutiChoice.SO_CAU);
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
