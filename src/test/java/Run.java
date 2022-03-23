import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        DsMC dsMC = new DsMC();
//        dsMC.docFileMC("src/main/resources/mutichoice.txt");
//        System.out.println("===Danh sách câu hỏi MutiChoice====");
//        dsMC.hienThiDanhSach();
//        System.out.println("\n=========================");
//        System.out.println("\n=======Chọn đáp án đúng Mutiple Choice=========");
//        dsMC.chonDapAnMutipleChoice();
//        System.out.println("\n=========================");
//        dsMC.chonDapAnCauHoiRandom();
//        System.out.println("\n==========Tìm kiếm theo câu hỏi Mutiple Choice=============");
//        dsMC.timKiemTheoNoiDungDanhMucMucDo("best","Choose","Dễ").forEach(h->h.hienThi());
//        dsMC.timKiemTheoNoiDungDanhMucMucDo("It was","Choose the best","Khó").forEach(h->h.hienThi());
//        dsMC.timKiemTheoNoiDungDanhMucMucDo("Trung").forEach(h->h.hienThi());

        DsNguoiHoc dsNH = new DsNguoiHoc();
        dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");
        System.out.println("===Danh sách người học====");
        dsNH.hienThiDanhSach();
        List<NguoiHoc> kq = dsNH.docThongTinNguoiHoc();
        DsNguoiHoc.xuatKetQuaNguoiHoc("src/main/resources/nguoihocketqua.txt",kq);
        System.out.println("===Thêm một học viên====");
        NguoiHoc newbie1 = new NguoiHoc("Nguyễn Thành K","Nam","Vĩnh Long","06/09/2002","06/07/2022");
        dsNH.themHV(newbie1);
        dsNH.hienThiDanhSach();
        List<NguoiHoc> kqThem = dsNH.docThongTinNguoiHoc();
        dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqThem);
        NguoiHoc newbie2 = new NguoiHoc("Nguyễn Thành AK47","Nam","Long An","06/09/2000","06/07/2023");
        dsNH.themHV(newbie2);
        List<NguoiHoc> kqThem1 = dsNH.docThongTinNguoiHoc();
        dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqThem1);
        dsNH.xoaHV(newbie1);
        List<NguoiHoc> kqXoa = dsNH.docThongTinNguoiHoc();
        dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqXoa);
//
////        dsNH.hienThiDanhSach();
////        dsNH.xoaHV(newbie1);
////        DsNguoiHoc.capNhat("src/main/resources/nguoihoctest.txt",kq);
////        NguoiHoc newbie2 = new NguoiHoc("Nguyễn Thành AK47","Nam","Long An","06/09/2000","06/07/2023");
////        dsNH.themHV(newbie2);
////        dsNH.hienThiDanhSach();
////        DsNguoiHoc.capNhat("src/main/resources/nguoihoctest.txt",kq);
    }
}
