public class KetQuaHocTap {
    public int soLanLamBai;
    private String tenNguoiHoc;

    public KetQuaHocTap(String tenNguoiHoc, int soLanLamBai){
        this.setTenNguoiHoc(tenNguoiHoc);
        this.soLanLamBai = soLanLamBai;
    }

    public void hienThiKetQuaNguoiHoc()
    {
        System.out.printf("%s - số lần làm bài %d\n", this.getTenNguoiHoc(),this.soLanLamBai);
    }

    public int getSoLanLamBai() {
        return soLanLamBai;
    }

    public void setSoLanLamBai() {
        soLanLamBai = soLanLamBai+1;
    }

    public String getTenNguoiHoc() {
        return tenNguoiHoc;
    }

    public void setTenNguoiHoc(String tenNguoiHoc) {
        this.tenNguoiHoc = tenNguoiHoc;
    }
}
