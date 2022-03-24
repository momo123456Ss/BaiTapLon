import java.util.Scanner;

public class MutiChoice {
    public static int SO_CAU = 9;
    private static final Scanner sc = new Scanner(System.in);
    public static int soCauDungMutipleChoice = 0;
    private String noiDung;
    private String dapAn1;
    private String dapAn2;
    private String dapAnDung;
    private String danhMuc;
    private String doKho;
    private String danhSachDapAn;
    private boolean check;


    public MutiChoice(String nd,String danhSachDapAn,String dapAnDung,String danhMuc,String doKho){
        this.noiDung = nd;
        this.danhSachDapAn = danhSachDapAn;
        this.dapAnDung = dapAnDung;
        this.danhMuc = danhMuc;
        this.doKho = doKho;
    }

    public void hienThi(){
        System.out.printf("\n%s\n",this.noiDung);
        System.out.printf("%s\n",this.danhSachDapAn);
        System.out.printf("Danh mục: %s\n",this.danhMuc);
        System.out.printf("Cấp độ: %s\n",this.doKho);
    }
    public static int demKetQua = 1;
    public void hienThiKetQua(){
        if (this.check == false) {
            System.out.printf("\n%d.%s |=> đáp án là %s\n",demKetQua++,this.noiDung, this.dapAnDung);
        }
        else
            System.out.printf("\n%d.%s |=> bạn trả lời đúng\n",demKetQua++,this.noiDung);
    }
    public static int dem = 1;
    public void chonDapAn(){
        System.out.printf("Câu thứ %d: %s\n",dem++,this.noiDung);
        System.out.printf("%s\n",this.danhSachDapAn);
        System.out.print("Nhập đáp án A hoặc B : ");
        String dapAnDung = sc.nextLine();
            if(dapAnDung.equalsIgnoreCase(this.dapAnDung)){
                soCauDungMutipleChoice++;
                this.check = true;
            }
            else {
                this.check = false;
            }
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getDapAn1() {
        return dapAn1;
    }

    public void setDapAn1(String dapAn1) {
        this.dapAn1 = dapAn1;
    }

    public String getDapAn2() {
        return dapAn2;
    }

    public void setDapAn2(String dapAn2) {
        this.dapAn2 = dapAn2;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }

    public String getDanhSachDapAn() {
        return danhSachDapAn;
    }

    public void setDanhSachDapAn(String danhSachDapAn) {
        this.danhSachDapAn = danhSachDapAn;
    }
}
