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
    private List<Incomplete> dsInC = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    public void hienThiDanhSach(){
        for (MutiChoice h : this.getDsMC()){
            h.hienThi();
        }
        MutiChoice.dem =1;
    }

    //Hiển thị Inconplete
    public void hienThiInComplete(){
        for (Incomplete h: this.dsInC){
//            h.hienThiIncomplete();
            h.hienThiINC();
        }
    }
    public void hienThiDanhSachKetQuaINC(){
        for (Incomplete h : this.dsInC){
            h.hienThiKetQuaInCom();
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
//Đọc Incomplete

    public void docFileInCom(String path) throws FileNotFoundException {
        File f = new File(path);
        ArrayList<String> dong = new ArrayList<>();
        ArrayList<String> dapAn = new ArrayList<>();
        try(Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                String noiDung = scanner.nextLine();
//                String dong1 = scanner.nextLine();
//                String dong2 = scanner.nextLine();
//                String dong3 = scanner.nextLine();
//                String dong4 = scanner.nextLine();
//                String dong5 = scanner.nextLine();
//                String dong6 = scanner.nextLine();
//                String dong7 = scanner.nextLine();
//                String dong8 = scanner.nextLine();
//                String dong9 = scanner.nextLine();
//                String dong10 = scanner.nextLine();
//                String dong11 = scanner.nextLine();
//                String dong12 = scanner.nextLine();
//                String dong13 = scanner.nextLine();
//                String dong14 = scanner.nextLine();
//                String dong15 = scanner.nextLine();
//                String dapan1 = scanner.nextLine();
//                String dapan2 = scanner.nextLine();
//                String dapan3 = scanner.nextLine();
//                String dapan4 = scanner.nextLine();
//                String dapan5 = scanner.nextLine();
//                String dapan6 = scanner.nextLine();
//                String dapan7 = scanner.nextLine();
//                String dapan8 = scanner.nextLine();
//                String dapan9 = scanner.nextLine();
//                String dapan10 = scanner.nextLine();
//                String dapan11 = scanner.nextLine();
//                String dapan12 = scanner.nextLine();
//                String dapan13 = scanner.nextLine();
//                String dapan14 = scanner.nextLine();
//                String dapan15 = scanner.nextLine();
                for (int i = 0;i<15;i++){
                   dong.add(scanner.nextLine());
                }
                for (int i = 0;i<15;i++){
                    dapAn.add(scanner.nextLine());
                }
                String doKho = scanner.nextLine();
//                Incomplete dsInC = new Incomplete(noiDung,dong1,dong2,dong3,dong4,dong5
//                ,dong6,dong7,dong8,dong9,dong10,dong11,dong12,dong13,dong14,dong15
//                ,dapan1,dapan2,dapan3,dapan4,dapan5,dapan6,dapan7,dapan8,dapan9,dapan10
//                        ,dapan11,dapan12,dapan13,dapan14,dapan15,doKho);
                Incomplete dsINC = new Incomplete(noiDung,dong,dapAn,doKho);
                this.dsInC.add(dsINC);
            }
        }
    }

    public void chonDapAnChoCauHoiMC(){
        for (MutiChoice h: this.dsMC){
            h.chonDapAn();
        }
        System.out.printf("Số câu đúng của phần Muti Choice : %d/%d\n", MutiChoice.soCauDungMutipleChoice, MutiChoice.SO_CAU);
    }
//INC
    public void chonDapAnIncomplete(){
        for (Incomplete h: this.dsInC){
            h.chonDapAnINC();
        }
    }
    public void RandomMutiChoie(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i< this.dsMC.size();i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0 ; i < this.dsMC.size();i++)
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
