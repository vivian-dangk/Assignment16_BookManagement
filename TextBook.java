
package Exersise16_DangKhaiVy_4459;
import java.util.*;
public class TextBook extends Book {
    private String status;

    public TextBook(String status, String ID, String publishier, Date entryDate, double unitPrice, double quantity) {
        super(ID, publishier, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public void addBook(){
        super.addBook();
        System.out.println("Hay nhap tinh trang sach: ");
        this.status=nhap.nextLine();
    }
    @Override
    public void updateBook(String id){
        super.updateBook(id);
        System.out.println("Hay cap nhat tinh trang sach: ");
        this.status=nhap.nextLine();
    }
    @Override
    public void displayBook(){
        super.displayBook();
        System.out.println("Tinh trang: "+status);
    }
}
