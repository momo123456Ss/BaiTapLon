import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        //Câu hỏi -> tìm kiếm theo nội dung mức độ danh mục
//        DsMC dsMC = new DsMC();
//        dsMC.docFileMC("src/main/resources/mutichoice.txt");
//        System.out.println("===Danh sách câu hỏi MutiChoice====");
//        dsMC.hienThiDanhSach();
//        System.out.println("\n=========================");
//        System.out.println("\n=======Chọn đáp án đúng Mutiple Choice=========");
//        dsMC.chonDapAnMutipleChoice();
//        System.out.println("\n=========================");
//        dsMC.chonDapAnCauHoiRandomMutiChoice();
//        dsMC.RandomMutiChoie();
//        System.out.println("\n==========Tìm kiếm theo câu hỏi Mutiple Choice=============");
//        dsMC.timKiemTheoNoiDungDanhMucMucDo("best","Choose","Dễ").forEach(h->h.hienThi());
//        dsMC.timKiemTheoNoiDungDanhMucMucDo("It was","Choose the best","Khó").forEach(h->h.hienThi());
//        dsMC.timKiemTheoNoiDungDanhMucMucDo("Trung").forEach(h->h.hienThi());


        ///Quản lý học viên thêm sửa xóa cập nhật

//        DsNguoiHoc dsNH = new DsNguoiHoc();
//        dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");
//        System.out.println("===Danh sách người học====");
//        dsNH.hienThiDanhSach();
//        List<NguoiHoc> kq = dsNH.docThongTinNguoiHoc();
//        DsNguoiHoc.xuatKetQuaNguoiHoc("src/main/resources/nguoihocketqua.txt",kq);
//        System.out.println("===Thêm một học viên====");
//        NguoiHoc newbie1 = new NguoiHoc("Nguyễn Thành K","Nam","Vĩnh Long","06/09/2002","06/07/2022");
//        dsNH.themHV(newbie1);
//        dsNH.hienThiDanhSach();
//        List<NguoiHoc> kqThem = dsNH.docThongTinNguoiHoc();
//        dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqThem);
//        NguoiHoc newbie2 = new NguoiHoc("Nguyễn Thành AK47","Nam","Long An","06/09/2000","06/07/2023");
//        dsNH.themHV(newbie2);
//        List<NguoiHoc> kqThem1 = dsNH.docThongTinNguoiHoc();
//        dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqThem1);
//        dsNH.xoaHV(newbie1);
//        List<NguoiHoc> kqXoa = dsNH.docThongTinNguoiHoc();
//        dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqXoa);
//
//        dsNH.capNhatThongTin(1);
//        dsNH.hienThiDanhSach();
//        List<NguoiHoc> kqCapNhat = dsNH.docThongTinNguoiHoc();
//        dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqCapNhat);



        ////MENU
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("======MENU======\n");
            System.out.print("1.Hiển Thị danh sách câu hỏi Mutiple Choice\n2.Hiển thi danh sách câu Incomple\n3." +
                    "Hiển thị danh sách câu hỏi Conversation\n4.Tìm kiếm câu hỏi theo từ khóa Nội dung-Độ khó-Danh mục\n" +
                    "5.Random câu hỏi mutipleChoie\nBạn chọn: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    DsMC dsMCCase1 = new DsMC();
                    dsMCCase1.docFileMC("src/main/resources/mutichoice.txt");
                    System.out.println("===Danh sách câu hỏi MutiChoice====");
                    dsMCCase1.hienThiDanhSach();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    DsMC dsMCCase4 = new DsMC();
                    dsMCCase4.docFileMC("src/main/resources/mutichoice.txt");
                    System.out.print("Nhập từ khóa muốn tìm kiếm: ");
                    String tuKhoa = sc.nextLine();
                    dsMCCase4.timKiemTheoNoiDungDanhMucMucDo(tuKhoa).forEach(h->h.hienThi());
                    break;
                case 5:
                    DsMC dsMCCase5 = new DsMC();
                    dsMCCase5.docFileMC("src/main/resources/mutichoice.txt");
                    dsMCCase5.RandomMutiChoie();
                    break;

            }
        }while(choose >= 1 && choose <= 5);
    }
}
