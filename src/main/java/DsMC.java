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
                String danhSanhDapAn = scanner.nextLine();
                String dapAnDung = scanner.nextLine();
                String danhMuc = scanner.nextLine();
                String doKho = scanner.nextLine();
                MutiChoice mC = new MutiChoice(noiDung,danhSanhDapAn,dapAnDung,danhMuc,doKho);
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

    public void RandomMutiChoie(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i< this.dsMC.size();i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0 ; i< dsMC.size();i++)
        {
            MutiChoice randomElemen = dsMC.get(list.get(i));
            randomElemen.chonDapAn();
        }
        for (int i = 0;i< list.size();i++){
            MutiChoice randomElemen = dsMC.get(list.get(i));
            randomElemen.hienThiKetQua();
        }
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
