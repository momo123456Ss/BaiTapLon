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
    private List<Conversation> dsConSer = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    public void hienThiDanhSach(){
        for (MutiChoice h : this.getDsMC()){
            h.hienThi();
        }
        MutiChoice.setDem();
    }

    //Hiển thị Inconplete
    public void hienThiInComplete(){
        for (Incomplete h: this.dsInC){
//            h.hienThiIncomplete();
            h.hienThiINC();
        }
        Incomplete.setDem();
    }
    public void hienThiDanhSachKetQuaINC(){
        for (Incomplete h : this.dsInC){
            h.hienThiKetQuaInCom();
        }
    }
    //Hiển Thị ConserVation
    public void hienThiConServation(){
        for (Conversation h : this.dsConSer){
            h.hienThiMotCauConservation();
        }
        Conversation.setDem();
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
                for (int i = 0;i<15;i++){
                   dong.add(scanner.nextLine());
                }
                for (int i = 0;i<15;i++){
                    dapAn.add(scanner.nextLine());
                }
                String doKho = scanner.nextLine();
                Incomplete dsINC = new Incomplete(noiDung,dong,dapAn,doKho);
                this.dsInC.add(dsINC);
            }
        }
    }
//Đọc conservation
public void docFileConservation(String path) throws FileNotFoundException {
    File f = new File(path);
    ArrayList<String> cauHoi = new ArrayList<>();
    ArrayList<String> dapAn = new ArrayList<>();
    try(Scanner scanner = new Scanner(f)) {
        while (scanner.hasNext()){
            String noiDung = scanner.nextLine();
            for (int i = 0;i<5;i++){
                cauHoi.add(scanner.nextLine());
            }
            for (int i = 0;i<5;i++){
                dapAn.add(scanner.nextLine());
            }
            String doKho = scanner.nextLine();
            Conversation dsConSer = new Conversation(noiDung,cauHoi,dapAn,doKho);
            this.dsConSer.add(dsConSer);
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
    public void RandomMutiChoie(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i< this.dsMC.size();i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0 ; i < n;i++)
        {
            MutiChoice randomElemen = dsMC.get(list.get(i));
            randomElemen.chonDapAn();
        }
        for (int i = 0;i< n;i++){
            MutiChoice randomElemen = dsMC.get(list.get(i));
            randomElemen.hienThiKetQua();
        }
        MutiChoice.setDem();
    }
    public void RandomIncomplete(String tuKhoa){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i< this.dsInC.size();i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0 ; i < this.dsInC.size();i++)
        {
            Incomplete randomElemen = dsInC.get(list.get(i));
            if(randomElemen.getDoKho().equalsIgnoreCase(tuKhoa)){
                randomElemen.chonDapAnINC();
                randomElemen.hienThiKetQuaInCom();
                return;
            }
        }
    }

    public void RandomConservation(String tuKhoa){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i< this.dsConSer.size();i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0 ; i < this.dsConSer.size();i++)
        {
            Conversation randomElemen = dsConSer.get(list.get(i));
            if(randomElemen.getDoKhoConser().equalsIgnoreCase(tuKhoa)){
                randomElemen.chonDapAnConservation();
                randomElemen.hienThiKetQuaConservation();
                return;
            }
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
