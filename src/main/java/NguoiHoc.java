import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NguoiHoc {
    private static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem = 0;
    private int maHVDeCapNhat = ++dem;
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Date ngayGiaNhap;


    public NguoiHoc(String ht,String gioiTinh,String qq,Date ns, Date ntg){
        this.hoTen = ht;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ns;
        this.ngayGiaNhap = ntg;
        this.queQuan =  qq;

    }

    public NguoiHoc(String ht,String gioiTinh,String qq,String ns, String ntg) throws ParseException {
        this.hoTen = ht;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = f.parse(ns);
        this.ngayGiaNhap = f.parse(ntg);
        this.queQuan =  qq;

    }
    public static int maHV = 1;
    public void hienThiDsNguoiHoc(){
        System.out.printf("Số thứ tự: %d\n", maHV++);
        System.out.printf("Họ tên : %s\n",this.hoTen);
        System.out.printf("Giới tính: %s\n",this.gioiTinh);
        System.out.printf("Quê quán : %s\n",this.queQuan);
        System.out.printf("Ngày sinh : %s\n",f.format(this.getNgaySinh()));
        System.out.printf("Ngày tham gia : %s\n",f.format(this.getNgayGiaNhap()));
    }


    public void hienThiDsNguoiHocDeCapNhat(){
        System.out.printf("Số thứ tự: %d\n", this.getMaHVDeCapNhat());
        System.out.printf("Họ tên : %s\n",this.hoTen);
        System.out.printf("Giới tính: %s\n",this.gioiTinh);
        System.out.printf("Quê quán : %s\n",this.queQuan);
        System.out.printf("Ngày sinh : %s\n",f.format(this.getNgaySinh()));
        System.out.printf("Ngày tham gia : %s\n",f.format(this.getNgayGiaNhap()));
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

//    public String getNgayGiaNhap() {
//        return ngayGiaNhap;
//    }
//
//    public void setNgayGiaNhap(String ngayGiaNhap) {
//        this.ngayGiaNhap = ngayGiaNhap;
//    }
//
//    public String getNgaySinh() {
//        return ngaySinh;
//    }
//
//    public void setNgaySinh(String ngaySinh) {
//        this.ngaySinh = ngaySinh;
//    }

    public Date getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    public void setNgayGiaNhap(Date ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    public int getMaHVDeCapNhat() {
        return maHVDeCapNhat;
    }

    public void setMaHVDeCapNhat(int maHVDeCapNhat) {
        this.maHVDeCapNhat = maHVDeCapNhat;
    }
}
