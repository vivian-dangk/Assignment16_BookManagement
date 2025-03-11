
package Exersise16_DangKhaiVy_4459;
import java.util.*;
public class BookList {
    ArrayList<Book> danhsach=new ArrayList<>();
    Scanner nhap=new Scanner(System.in);
    public void addBook(){
        System.out.println("Hay nhap so sach hien co: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Hay chon de phan loai(1.Text Book/2. Reference Book): ");
            int loai=nhap.nextInt();
            nhap.nextLine();
            if(loai==1){
                TextBook mytb=new TextBook();
                mytb.addBook();
                danhsach.add(mytb);
            }else if(loai==2){
                ReferenceBook myrb=new ReferenceBook();
                myrb.addBook();
                danhsach.add(myrb);
            }
        }
    }
    public void updateBook(String id){
        for(Book b:danhsach){
            if(b.getID().equalsIgnoreCase(id)){
                b.updateBook(id);
            }
        }
    }
    public void deleteBook(String id){
        for(int i=danhsach.size()-1;i>=0;i--){
            if(danhsach.get(i).getID().equalsIgnoreCase(id)){
                danhsach.remove(i);
            }
        }
    }
    public Book findID(String id){
        for(Book b:danhsach){
            if(b.getID().equalsIgnoreCase(id)){
                return b;
            }
        }
        return null;
    }
    public void displayall(){
        for(Book b:danhsach){
            b.displayBook();
        }
    }
}
