import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws IOException, ParseException {
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
        int choose,chon12;
        Scanner sc = new Scanner(System.in);
        do {
            int soTT;
            DsMC dsMC = new DsMC();
            DsNguoiHoc dsNH = new DsNguoiHoc();
            System.out.print("======MENU câu hỏi======\n");
            System.out.print("1.Hiển Thị danh sách câu hỏi Mutiple Choice\n2.Hiển thi danh sách câu Incomple\n3." +
                    "Hiển thị danh sách câu hỏi Conversation\n4.Tìm kiếm câu hỏi theo từ khóa Nội dung-Độ khó-Danh mục\n" +
                    "5.Random câu hỏi mutipleChoie\n6.Random câu hỏi InComplete\n7.Random câu hỏi Conservation\n" +
                    "======MENU người học======\n" +
                    "8.Hiển Thị danh sách Người Học\n9.Thêm 1 người học\n10.Xóa 1 người học\n11.Cập nhật thông tin 1 người học\n" +
                    "======MENU Luyện tập======\n" +
                    "12.Luyện tập người học\n13.Luyện tập\n14.Hiển thị kết quả học tập\n=>Bạn Chọn: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    dsMC.docFileMC("src/main/resources/mutichoice.txt");
                    System.out.println("===Danh sách câu hỏi MutiChoice====");
                    dsMC.hienThiDanhSach();
                    break;
                case 2:
                    dsMC.docFileInCom("src/main/resources/incomplete.txt");
                    System.out.println("===Danh sách câu hỏi Incomplete====");
                    dsMC.hienThiInComplete();
                    break;
                case 3:
                    dsMC.docFileConservation("src/main/resources/conservation.txt");
                    System.out.println("===Danh sách câu hỏi Conservation====");
                    dsMC.hienThiConServation();
                    break;
                case 4:
                    dsMC.docFileMC("src/main/resources/mutichoice.txt");
                    System.out.print("Nhập từ khóa muốn tìm kiếm trong danh sách câu hỏi Mutiple choice: ");
                    String tuKhoa = sc.nextLine();
                    dsMC.timKiemTheoNoiDungDanhMucMucDo(tuKhoa).forEach(h->h.hienThi());
                    break;
                case 5:
                    dsMC.docFileMC("src/main/resources/mutichoice.txt");
                    System.out.print("Nhập số lượng câu hỏi: ");
                    int index = sc.nextInt();
                    dsMC.RandomMutiChoie(index);
                    break;
                case 6:
                    dsMC.docFileInCom("src/main/resources/incomplete.txt");
                    System.out.print("Nhập mức độ câu hỏi: ");
                    String tu = sc.nextLine();
                    dsMC.RandomIncomplete(tu);
                    Incomplete.setDem();
                    break;
                case 7:
                    dsMC.docFileConservation("src/main/resources/conservation.txt");
                    System.out.print("Nhập mức độ câu hỏi: ");
                    String tu2 = sc.nextLine();
                    dsMC.RandomConservation(tu2);
                    Conversation.setDem();
                    break;
                case 8:
                    NguoiHoc.setDem();
                    dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");
                    System.out.println("===Danh sách người học====");
                    dsNH.hienThiDanhSach();
                    break;
                case 9:
                    NguoiHoc.setDem();
                    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.println("===Thêm một học viên====");
                    dsNH.hienThiDanhSach();
                    System.out.print("Nhập họ tên muốn thêm: "); String hoTen = sc.nextLine();
                    System.out.print("Nhập giới tính muốn thêm: "); String gioiTinh = sc.nextLine();
                    System.out.print("Nhập quê quán muốn thêm: "); String qq = sc.nextLine();
                    System.out.print("Nhập ngày sinh muốn thêm: "); String ns = sc.nextLine();
                    NguoiHoc newbie1 = new NguoiHoc(hoTen,gioiTinh,qq,ns, f.format(new Date()));
                    dsNH.themHV(newbie1);
                    List<NguoiHoc> kqThem = dsNH.docThongTinNguoiHoc();
                    dsNH.capNhat("src/main/resources/nguoihoctest.txt",kqThem);

                    dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");

                    dsNH.capNhatKetQuaThem(hoTen);


                    break;
                case 10:
                    NguoiHoc.setDem();
                    System.out.println("===Xóa một học viên====");
                    dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");
                    dsNH.hienThiDanhSach();
                    System.out.print("Nhập số thứ tự muốn xóa: ");
                    soTT = sc.nextInt();
                    dsNH.xoaHV(soTT-1);
                    List<NguoiHoc> kqXoa = dsNH.docThongTinNguoiHoc();
                    dsNH.capNhatXoa("src/main/resources/nguoihoctest.txt",kqXoa);

                    dsMC.docDsKetQuaNguoiHoc();
                    dsMC.xoaNguoiHocKetQua(soTT-1);
                    List<KetQuaHocTap> ketqua = dsMC.docThongTinKetQuaNguoiHoc();
                    dsMC.capNhatKetQua(ketqua);


                    break;
                case 11:
                    NguoiHoc.setDem();
                    System.out.println("===Cập nhật một học viên====");
                    dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");
                    dsNH.hienThiDanhSach();
                    System.out.print("Nhập số thứ tự muốn cập nhật thông tin: ");
                    soTT = sc.nextInt();
                    dsNH.capNhatThongTin(soTT);
                    List<NguoiHoc> kqCapNhat = dsNH.docThongTinNguoiHoc();
                    dsNH.capNhatXoa("src/main/resources/nguoihoctest.txt",kqCapNhat);

                    break;
                case 12:

                    System.out.print("Bạn đăng ký chưa\n1.Chưa\n2.Đã đăng ký\n=>Bạn chọn: ");
                    chon12 = sc.nextInt();
                    sc.nextLine();
                    if (chon12 == 1){
                        System.out.println("Chọn mục 9 để đăng ký");
                    }
                    else if(chon12 == 2){
                        System.out.print("Chọn mục muốn luyện tập\n1.MutipleChoice\n2.InComple\n3.Conservation\n=>Bạn chọn");
                        chon12 = sc.nextInt();
                        sc.nextLine();
                        if (chon12 == 1){
                            NguoiHoc.setDem();
                            MutiChoice.soCauDungMutipleChoice = 0;
                            dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");
                            System.out.println("===Danh sách người học====");
                            dsNH.hienThiDanhSach();
                            dsMC.docDsKetQuaNguoiHoc();
                            System.out.println("Nhập số thứ tự trên danh sách kia: ");
                            int m = sc.nextInt();
                            dsMC.LuyenTapEngMutiple(m);
                        }
                        else
                            return;
                    }
                    break;
                case 13:
                    NguoiHoc.setDem();
                    MutiChoice.soCauDungMutipleChoice = 0;
                    dsNH.docDsNguoiHoc("src/main/resources/nguoihoctest.txt");
                    System.out.println("===Danh sách người học====");
                    dsNH.hienThiDanhSach();
                    dsMC.docDsKetQuaNguoiHoc();
                    System.out.println("Nhập số thứ tự trên danh sách kia: ");
                    int m = sc.nextInt();
                    dsMC.LuyenTapEngMutiple(m);
                    break;
                case 14:
                    dsMC.docDsKetQuaNguoiHoc();
                    dsMC.hienThiKetQuaHocTap();
                    break;
            }//
        }while(choose >= 1 && choose <= 14);
    }
}
