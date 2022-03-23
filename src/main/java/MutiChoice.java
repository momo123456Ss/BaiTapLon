import java.util.Scanner;

public class MutiChoice {
    private static final int SO_DAP_AN_DUNG = 0;
    private static final Scanner sc = new Scanner(System.in);
    private String noiDung;
    private String dapAn1;
    private String dapAn2;
    private String dapAnDung;
    private String danhMuc;
    private String doKho;

    public MutiChoice(String nd,String dapAn1,String dapAn2,String dapAnDung,String danhMuc,String doKho){
        this.noiDung = nd;
        this.dapAn1 = dapAn1;
        this.dapAn2 = dapAn2;
        this.dapAnDung = dapAnDung;
        this.danhMuc = danhMuc;
        this.doKho = doKho;
    }

    public void hienThi(){
        System.out.printf("\n%s\n",this.noiDung);
        System.out.printf("A.%s\n",this.dapAn1);
        System.out.printf("B.%s\n",this.dapAn2);
        System.out.printf("Danh mục: %s\n",this.danhMuc);
        System.out.printf("Cấp độ: %s\n",this.doKho);
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
}
