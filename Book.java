import java.util.LinkedList;
import java.util.Scanner;

public class Book {

    LinkedList<Book> bookList;
    private String bName;
    private int bookId;
    private int idNumber;
    private String authorName;
    private int noOfDaysLate;

    public Book(int noOfDaysLate){
        this.noOfDaysLate = noOfDaysLate;
    }

    public Book(String bName, int bookId, int idNumber,
                String authorName) {
        this.bName = bName;
        this.bookId = bookId;
        this.authorName = authorName;
        this.idNumber = idNumber;
        bookList = new LinkedList<Book>();
    }
    public Book(){

    }
    public void issueBook(Book bookRecord){

        if (!find(bookRecord.getIdNumber())){
            bookList.add(bookRecord);
        }
        else {

            System.out.println(
                    "Record already exists in the Record list");
        }
    }
    public boolean find(int bookID)
    {
        Book book = new Book(bookId);
        book.setBookList(book);
        try {
            for (Book b : bookList) {
                if (b.getBookId() == bookID) {

                    System.out.println(b);
                    return true;
                }
            }
        }catch (RuntimeException r){
            System.out.println("NullPointerException thrown!");
        }
        return false;
    }

    public void returnBook(int bookIdNumber)
    {
        Book recordDel = null;
        Book book = new Book(bookId);
        book.setBookList(book);
        try {
            for (Book ll : bookList) {

                if (ll.getBookId() == bookIdNumber) {
                    recordDel = ll;
                }
            }
        }catch(RuntimeException r){
            System.out.println("NullPointerException thrown!");
        }

        if (recordDel == null) {

            System.out.println("Invalid record Id");
        }
        else {

            bookList.remove(recordDel);

            System.out.println(
                    "Successfully returned the Book.");
        }
    }

    public void update(int bookId, Scanner input)
    {
        Book rec = new Book(bookId);
        if (rec.find(bookId)) {

            System.out.print("New Book Id : ");
            bookId = input.nextInt();

            System.out.print("New Edition Name : ");
            String edition = input.nextLine();
            input.nextLine();

            System.out.print("New Book Name : ");
            String bName = input.nextLine();

            rec.setBookId(idNumber);
            rec.setName(bName);
            rec.setAuthorName(edition);
            System.out.println("Information Updated Successfully.");
        }
        else {
            System.out.println("Record Not Found in the Student list");
        }
    }

    public void setBookList(Book record){
        this.bookId = bookId;
        this.idNumber = idNumber;
        this.bName = bName;
        this.authorName = authorName;
    }
    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }
    public int getIdNumber() {
        return bookId;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setName(String bName) {
        this.bName = bName;
    }

    @Override
    public String toString() {
        return "Records: " + "Name=" + bName + "\tIdNumber=" + bookId + "\tContactNumber=" + authorName + '\t';
    }

    public void fineBook(Book b) {
        {
            int f, total1=0, total2 = 0;
            if(b.noOfDaysLate==0){
                return;
            }
            if (b.noOfDaysLate <= 15) {
                f = b.noOfDaysLate;
                total1 += f;
                System.out.println("Amount of Fine = " + f + "Rs");
            }
            if(b.noOfDaysLate <= 30 && b.noOfDaysLate>15) {
                f = total1 + 2 * b.noOfDaysLate;
                total2 += f;
                System.out.println("Amount of Fine = " + f + "Rs");
            }
            if(b.noOfDaysLate>30){
                f = total2 + 4 * b.noOfDaysLate;
                System.out.println("Amount of Fine = " + f + "Rs");
            }
        }
    }
}
