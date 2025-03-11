
package Exersise16_DangKhaiVy_4459;
import java.util.*;
public class Proccessor {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        BookList danhsach=new BookList();
        while(true){
            System.out.println("Hay chon cac tac vu sau: ");
            System.out.println("1. Nhap thong tin.");
            System.out.println("2. Cap nhat thong tin theo ID: ");
            System.out.println("3. Xoa sach theo ID: ");
            System.out.println("4. Tim sach theo ID: ");
            System.out.println("5. In danh sach: ");
            System.out.println("6. Thoat.");
            int chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1: 
                    danhsach.addBook();
                    System.out.println("--------------------");
                    break;
                case 2:
                    System.out.println("Hay nhap ID muon cap nhat: ");
                    String id=nhap.nextLine();
                    danhsach.updateBook(id);
                    System.out.println("--------------------");
                    break;
                case 3:
                    System.out.println("Hay nhap ID muon xoa: ");
                    String Id=nhap.nextLine();
                    danhsach.deleteBook(Id);
                    System.out.println("--------------------");
                    break;
                case 4:
                    System.out.println("Hay nhap ID sach muon tim: ");
                    String ID=nhap.nextLine();
                    Book o=danhsach.findID(ID);
                    if(o!=null){
                        o.displayBook();
                    }else{
                        System.out.println("Khong tim thay sach nao.");
                    }
                    System.out.println("--------------------");
                    break;
                case 5:
                    System.out.println("Danh sach la: ");
                    danhsach.displayall();
                    System.out.println("--------------------");
                    break;
                case 6:
                    System.out.println("Dang thoat.");
                    System.out.println("--------------Bye------------");
                    break;
                default:
                    System.out.println("Khong howp le nhap lai.");
            }
            if(chon==6){
                break;
            }
        }
    }
}
