
package Exersise16_DangKhaiVy_4459;
import java.util.*;
public class ReferenceBook extends Book{
    private double tax;

    public ReferenceBook(double tax, String ID, String publishier, Date entryDate, double unitPrice, double quantity) {
        super(ID, publishier, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public ReferenceBook() {
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    @Override
    public void addBook(){
        super.addBook();
        System.out.println("Hay nhap thue sach: ");
        this.tax=nhap.nextDouble();
    }
    @Override
    public void updateBook(String id){
        super.updateBook(id);
        System.out.println("Hay cap nhat thue sach: ");
        this.tax=nhap.nextDouble();
    }
    @Override
    public void displayBook(){
        super.displayBook();
        System.out.println("Tien thue: "+tax);
    }
}
