
package Exersise16_DangKhaiVy_4459;
import java.util.*;
import java.text.*;
public abstract class Book implements IBook{
    private String ID;
    private String publishier;
    private Date entryDate;
    private double unitPrice;
    private double quantity;
    private SimpleDateFormat bd=new SimpleDateFormat("dd/MM/yyyy");
    Scanner nhap=new Scanner(System.in);
    public Book(String ID, String publishier, Date entryDate, double unitPrice, double quantity) {
        this.ID = ID;
        this.publishier = publishier;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Book() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPublishier(String publishier) {
        this.publishier = publishier;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    @Override
    public void addBook(){
        System.out.println("Hay nhap ID sach: ");
        this.ID=nhap.nextLine();
        System.out.println("Hay nhap NXB: ");
        this.publishier=nhap.nextLine();
        while(true){
        try{
            System.out.println("Hay nhap ngay phat hanh: ");
            this.entryDate=bd.parse(nhap.nextLine());
            break;
            }catch(ParseException e){
            System.out.println("Nhap sai hayx nhap lai.");
            }
        }
        System.out.println("Hay nhap gia niem yet: ");
        this.unitPrice=nhap.nextDouble();
        System.out.println("Hay nhap so luong: ");
        this.quantity=nhap.nextDouble();
        nhap.nextLine();
    }
    @Override
    public void updateBook(String id){
        System.out.println("Hay cap nhat NXB: ");
        this.publishier=nhap.nextLine();
        while(true){
        try{
            System.out.println("Hay cap nhat ngay phat hanh: ");
            this.entryDate=bd.parse(nhap.nextLine());
            break;
            }catch(ParseException e){
            System.out.println("Nhap sai hay nhap lai.");
            }
        }
        System.out.println("Hay cap nhat gia niem yet: ");
        this.unitPrice=nhap.nextDouble();
        System.out.println("Hay cap nhat so luong: ");
        this.quantity=nhap.nextDouble();
        nhap.nextLine();
    }
    @Override
    public void displayBook(){
        System.out.println("ID: "+ID+", NXB: "+publishier+", Ngay XB: "+bd.format(entryDate));
        System.out.println("Gia: "+unitPrice+", So luong: "+quantity);
    }
}
