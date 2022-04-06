import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class parse {
    public static void main(String[] args) throws FileNotFoundException {
       DanhSachDiemGiuaKi dsDiemGiuKi = new DanhSachDiemGiuaKi();
       dsDiemGiuKi.docFileDiem();
       dsDiemGiuKi.timKiem();
    }
}
