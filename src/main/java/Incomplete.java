import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Incomplete {
    private static final Scanner sc = new Scanner(System.in);
    private static final int SO_CAU = 15;
    private List<Incomplete> dsInC = new ArrayList<>();
    private String noiDung;
    private String doKho;
    private ArrayList<String> dong = new ArrayList<>();
    private ArrayList<String> dapAn = new ArrayList<>();
    private ArrayList<String> chondapAn = new ArrayList<>();
    private  boolean[] check = new boolean[15];
    private ArrayList<Boolean> checkn = new ArrayList<>();

    public Incomplete(String nd, ArrayList<String> dong, ArrayList<String> dapAn, String doKho){
        this.noiDung = nd;
        this.setDong(dong);
        this.setDapAn(dapAn);
        this.setDoKho(doKho);
    }

    public void hienThiINC(){
        System.out.printf("%s\n",this.noiDung);
        for (int i = 0; i < SO_CAU; i++) {
            System.out.println(this.dong.get(i));
        }
        System.out.printf("Cấp độ: %s\n", this.getDoKho());
    }

    //Chọn đáp án INC


    public void chonDapAnINC(){
        System.out.printf("%s\n",this.noiDung);
        for (int i = 0;i<SO_CAU;i++){
            System.out.printf("%s\n",this.dong.get(i));
            System.out.print("Chọn đáp án: ");
            String chon = sc.nextLine();
            if(chon.equalsIgnoreCase(this.dapAn.get(i))){
                this.checkn.add(true);
            }
            else {
                this.checkn.add(false);
            }
        }
    }

    public void hienThiKetQuaInCom(){
        System.out.println("==========Danh sách kết quả=======");
        for (int i = 0;i<SO_CAU;i++){
            if(checkn.get(i) == true) {
                System.out.printf("%s |=> Bạn chọn đúng\n", this.dong.get(i));
            }
            else {
                System.out.printf("%s |=> Bạn chọn sai\n", this.dong.get(i));
            }
        }
    }


    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }


    public boolean[] getCheck() {
        return check;
    }

    public void setCheck(boolean[] check) {
        this.check = check;
    }

    public ArrayList<String> getDong() {
        return dong;
    }

    public void setDong(ArrayList<String> dong) {
        this.dong = dong;
    }

    public ArrayList<String> getDapAn() {
        return dapAn;
    }

    public void setDapAn(ArrayList<String> dapAn) {
        this.dapAn = dapAn;
    }

    public ArrayList<String> getChondapAn() {
        return chondapAn;
    }

    public void setChondapAn(ArrayList<String> chondapAn) {
        this.chondapAn = chondapAn;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }
}
