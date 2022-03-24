public class Incomplete {
    private String noiDung;
    private String dapAnDong1;
    private String dapAnDong2;
    private String dapAnDong3;
    private String dapAnDong4;
    private String dapAnDong5;
    private String dapAnDong6;
    private String dapAnDong7;
    private String dapAnDong8;
    private String dapAnDong9;
    private String dapAnDong10;
    private String dapAnDong11;
    private String dapAnDong12;
    private String dapAnDong13;
    private String dapAnDong14;
    private String dapAnDong15;

    private String dapAnDung1;
    private String dapAnDung2;
    private String dapAnDung3;
    private String dapAnDung4;
    private String dapAnDung5;
    private String dapAnDung6;
    private String dapAnDung7;
    private String dapAnDung8;
    private String dapAnDung9;
    private String dapAnDung10;
    private String dapAnDung11;
    private String dapAnDung12;
    private String dapAnDung13;
    private String dapAnDung14;
    private String dapAnDung15;

    private String doKho;

    public Incomplete(String nd,String dapan1,String dapan2,String dapan3,String dapan4,String dapan5,String dapan6,String dapan7,String dapan8,String dapan9,String dapan10,String dapan11,String dapan12,String dapan13,String dapan14,String dapan15,
                      String chonDapAn1,String chonDapAn2,String chonDapAn3,
                      String chonDapAn4,String chonDapAn5,String chonDapAn6,
                      String chonDapAn7,String chonDapAn8,String chonDapAn9,
                      String chonDapAn10,String chonDapAn11,String chonDapAn12,
                      String chonDapAn13,String chonDapAn14,String chonDapAn15,String doKhoh){
        this.noiDung = nd;
        this.dapAnDong1 = dapan1;
        this.dapAnDong2 = dapan2;
        this.dapAnDong3 = dapan3;
        this.dapAnDong4 = dapan4;
        this.dapAnDong5 = dapan5;
        this.dapAnDong6 = dapan6;
        this.dapAnDong7 = dapan7;
        this.dapAnDong8 = dapan8;
        this.dapAnDong9 = dapan9;
        this.dapAnDong10 = dapan10;
        this.dapAnDong11 = dapan11;
        this.dapAnDong12 = dapan12;
        this.dapAnDong13 = dapan13;
        this.dapAnDong14 = dapan14;
        this.dapAnDong15 = dapan15;

        this.dapAnDung1 = chonDapAn1;
        this.dapAnDung2 = chonDapAn2;
        this.dapAnDung3 = chonDapAn3;
        this.dapAnDung4 = chonDapAn4;
        this.dapAnDung5 = chonDapAn5;
        this.dapAnDung6 = chonDapAn6;
        this.dapAnDung7 = chonDapAn7;
        this.dapAnDung8 = chonDapAn8;
        this.dapAnDung9 = chonDapAn9;
        this.dapAnDung10 = chonDapAn10;
        this.dapAnDung11 = chonDapAn11;
        this.dapAnDung12 = chonDapAn12;
        this.dapAnDung13 = chonDapAn13;
        this.dapAnDung14 = chonDapAn14;
        this.dapAnDung15 = chonDapAn15;

        this.setDoKho(doKhoh);
    }

    public void hienThiIncomplete(){
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n"
        ,this.noiDung,this.dapAnDong1,this.dapAnDong2,this.dapAnDong3,this.dapAnDong4,this.dapAnDong5
        ,this.dapAnDong6,this.dapAnDong7,this.dapAnDong8,this.dapAnDong9,this.dapAnDong10,this.dapAnDong11
        ,this.dapAnDong12,this.dapAnDong13,this.dapAnDong14,this.dapAnDong15);
        System.out.printf("Cấp độ: %s\n",this.doKho);
    }


    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getDapAnDong1() {
        return dapAnDong1;
    }

    public void setDapAnDong1(String dapAnDong1) {
        this.dapAnDong1 = dapAnDong1;
    }

    public String getDapAnDong2() {
        return dapAnDong2;
    }

    public void setDapAnDong2(String dapAnDong2) {
        this.dapAnDong2 = dapAnDong2;
    }

    public String getDapAnDong3() {
        return dapAnDong3;
    }

    public void setDapAnDong3(String dapAnDong3) {
        this.dapAnDong3 = dapAnDong3;
    }

    public String getDapAnDong4() {
        return dapAnDong4;
    }

    public void setDapAnDong4(String dapAnDong4) {
        this.dapAnDong4 = dapAnDong4;
    }

    public String getDapAnDong5() {
        return dapAnDong5;
    }

    public void setDapAnDong5(String dapAnDong5) {
        this.dapAnDong5 = dapAnDong5;
    }

    public String getDapAnDong6() {
        return dapAnDong6;
    }

    public void setDapAnDong6(String dapAnDong6) {
        this.dapAnDong6 = dapAnDong6;
    }

    public String getDapAnDong7() {
        return dapAnDong7;
    }

    public void setDapAnDong7(String dapAnDong7) {
        this.dapAnDong7 = dapAnDong7;
    }

    public String getDapAnDong8() {
        return dapAnDong8;
    }

    public void setDapAnDong8(String dapAnDong8) {
        this.dapAnDong8 = dapAnDong8;
    }

    public String getDapAnDong9() {
        return dapAnDong9;
    }

    public void setDapAnDong9(String dapAnDong9) {
        this.dapAnDong9 = dapAnDong9;
    }

    public String getDapAnDong10() {
        return dapAnDong10;
    }

    public void setDapAnDong10(String dapAnDong10) {
        this.dapAnDong10 = dapAnDong10;
    }

    public String getDapAnDong11() {
        return dapAnDong11;
    }

    public void setDapAnDong11(String dapAnDong11) {
        this.dapAnDong11 = dapAnDong11;
    }

    public String getDapAnDong12() {
        return dapAnDong12;
    }

    public void setDapAnDong12(String dapAnDong12) {
        this.dapAnDong12 = dapAnDong12;
    }

    public String getDapAnDong13() {
        return dapAnDong13;
    }

    public void setDapAnDong13(String dapAnDong13) {
        this.dapAnDong13 = dapAnDong13;
    }

    public String getDapAnDong14() {
        return dapAnDong14;
    }

    public void setDapAnDong14(String dapAnDong14) {
        this.dapAnDong14 = dapAnDong14;
    }

    public String getDapAnDong15() {
        return dapAnDong15;
    }

    public void setDapAnDong15(String dapAnDong15) {
        this.dapAnDong15 = dapAnDong15;
    }



    public String getDapAnDung1() {
        return dapAnDung1;
    }

    public void setDapAnDung1(String dapAnDung1) {
        this.dapAnDung1 = dapAnDung1;
    }

    public String getDapAnDung2() {
        return dapAnDung2;
    }

    public void setDapAnDung2(String dapAnDung2) {
        this.dapAnDung2 = dapAnDung2;
    }

    public String getDapAnDung3() {
        return dapAnDung3;
    }

    public void setDapAnDung3(String dapAnDung3) {
        this.dapAnDung3 = dapAnDung3;
    }

    public String getDapAnDung4() {
        return dapAnDung4;
    }

    public void setDapAnDung4(String dapAnDung4) {
        this.dapAnDung4 = dapAnDung4;
    }

    public String getDapAnDung5() {
        return dapAnDung5;
    }

    public void setDapAnDung5(String dapAnDung5) {
        this.dapAnDung5 = dapAnDung5;
    }

    public String getDapAnDung6() {
        return dapAnDung6;
    }

    public void setDapAnDung6(String dapAnDung6) {
        this.dapAnDung6 = dapAnDung6;
    }

    public String getDapAnDung7() {
        return dapAnDung7;
    }

    public void setDapAnDung7(String dapAnDung7) {
        this.dapAnDung7 = dapAnDung7;
    }

    public String getDapAnDung8() {
        return dapAnDung8;
    }

    public void setDapAnDung8(String dapAnDung8) {
        this.dapAnDung8 = dapAnDung8;
    }

    public String getDapAnDung9() {
        return dapAnDung9;
    }

    public void setDapAnDung9(String dapAnDung9) {
        this.dapAnDung9 = dapAnDung9;
    }

    public String getDapAnDung10() {
        return dapAnDung10;
    }

    public void setDapAnDung10(String dapAnDung10) {
        this.dapAnDung10 = dapAnDung10;
    }

    public String getDapAnDung11() {
        return dapAnDung11;
    }

    public void setDapAnDung11(String dapAnDung11) {
        this.dapAnDung11 = dapAnDung11;
    }

    public String getDapAnDung12() {
        return dapAnDung12;
    }

    public void setDapAnDung12(String dapAnDung12) {
        this.dapAnDung12 = dapAnDung12;
    }

    public String getDapAnDung13() {
        return dapAnDung13;
    }

    public void setDapAnDung13(String dapAnDung13) {
        this.dapAnDung13 = dapAnDung13;
    }

    public String getDapAnDung14() {
        return dapAnDung14;
    }

    public void setDapAnDung14(String dapAnDung14) {
        this.dapAnDung14 = dapAnDung14;
    }

    public String getDapAnDung15() {
        return dapAnDung15;
    }

    public void setDapAnDung15(String dapAnDung15) {
        this.dapAnDung15 = dapAnDung15;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }
}
