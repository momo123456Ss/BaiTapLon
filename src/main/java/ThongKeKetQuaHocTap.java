public class ThongKeKetQuaHocTap {
    private String ketQua;

    public ThongKeKetQuaHocTap(String nd){
        this.ketQua = nd;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public void hienThiThongKe(){
        System.out.printf("%s\n",this.ketQua);
    }
}
