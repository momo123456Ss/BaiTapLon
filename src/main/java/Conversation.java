import java.util.ArrayList;
import java.util.Scanner;

public class Conversation {
    private static final int SO_CAU = 5;
    private static final int SO_DONG_NOI_DUNG  = 3;
    private static final Scanner sc = new Scanner(System.in);
    private String noiDungConSer;
    private ArrayList<String> cauHoi = new ArrayList<>();
    private ArrayList<String> khoiCauHoi = new ArrayList<>();
    private ArrayList<String> dapAn = new ArrayList<>();
    private ArrayList<Boolean> check =  new ArrayList<>();
    private String doKhoConser;

    private static int dem = 0;
    private int soTT = ++dem;
    public static void setDem(){
        dem = 0;
    }

    public Conversation(String noiDung,ArrayList<String> cauHoi,ArrayList<String> dapAn
    ,String doKho){
        this.noiDungConSer = noiDung;
        this.cauHoi = cauHoi;
        this.dapAn = dapAn;
        this.doKhoConser = doKho;
    }

    public void hienThiMotCauConservation(){
            System.out.printf("%d.%s\n",this.soTT,this.noiDungConSer);
        for (int i = 0; i < 5; i++){
            System.out.printf("%s\n",this.cauHoi.get(i));
        }
        System.out.printf("%s\n",this.doKhoConser);
    }

    public void chonDapAnConservation(){
            System.out.printf("%s\n",this.noiDungConSer);
        for (int i = 0;i<SO_CAU;i++){
            System.out.printf("%s\n",this.cauHoi.get(i));
            System.out.print("Chọn đáp án: ");
            String chon = sc.nextLine();
            if(chon.equalsIgnoreCase(this.dapAn.get(i))){
                this.check.add(true);
            }
            else {
                this.check.add(false);
            }
        }
    }

    public void hienThiKetQuaConservation(){
        System.out.println("==========Danh sách kết quả=======");
        for (int i = 0;i<SO_CAU;i++){
            if(check.get(i) == true) {
                System.out.printf("%s |=> Bạn chọn đúng\n", this.cauHoi.get(i));
            }
            else {
                System.out.printf("%s |=> Bạn chọn sai\n", this.cauHoi.get(i));
            }
        }
    }

//    public ArrayList<String> getNoiDung() {
//        return noiDung;
//    }
//
//    public void setNoiDung(ArrayList<String> noiDung) {
//        this.noiDung = noiDung;
//    }

    public ArrayList<String> getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(ArrayList<String> cauHoi) {
        this.cauHoi = cauHoi;
    }

    public ArrayList<String> getKhoiCauHoi() {
        return khoiCauHoi;
    }

    public void setKhoiCauHoi(ArrayList<String> khoiCauHoi) {
        this.khoiCauHoi = khoiCauHoi;
    }

    public ArrayList<String> getDapAn() {
        return dapAn;
    }

    public void setDapAn(ArrayList<String> dapAn) {
        this.dapAn = dapAn;
    }

//    public String getDoKho() {
//        return doKho;
//    }
//
//    public void setDoKho(String doKho) {
//        this.doKho = doKho;
//    }

    public String getDoKhoConser() {
        return doKhoConser;
    }

    public void setDoKhoConser(String doKhoConser) {
        this.doKhoConser = doKhoConser;
    }

    public String getNoiDungConSer() {
        return noiDungConSer;
    }

    public void setNoiDungConSer(String noiDungConSer) {
        this.noiDungConSer = noiDungConSer;
    }
}
