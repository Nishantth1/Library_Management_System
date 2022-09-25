import java.util.*;
public class Library {
    static protected String aID="Admin", pass="Admin123";
    public static void main(String[] args) {
        adminLogin();
        Member st = new Member();

        Student record = new Student();
        record.setIdNumber(46);
        record.setContactNumber(8767);
        record.setName("Nishant");

        st.addMember(record);

        Scanner obj = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Enter 1- for Librarian \t Enter 2- for Member \n Enter 3- for Books \t Enter 4- for Transactions \t Enter 5- for Exit");
            choice = obj.nextInt();
            if(choice==1){
                Librarian l1 = new Librarian();
                l1.login();
            }
            switch (choice) {
                case 1:
                    int choiceLibrarian = 0;
                    do {
                        Librarian lib1 = new Librarian();
                        System.out.println("Enter Choices:  \n 1- Add Librarian \n 2- Remove Librarian \n 3- Back");
                        choiceLibrarian = obj.nextInt();
                        switch (choiceLibrarian) {
                            case 1:
                                String add = obj.nextLine();
                                System.out.println("Enter Librarian Details : Name \t Id \t Contact No.");
                                String libDetails = obj.nextLine();
                                lib1.addLibrarian(libDetails);
                                break;
                            case 2:
                                System.out.println("Enter the same Details Of Librarian to Remove.");
                                String item = obj.next();
                                lib1.removeLibrarian(item);
                                break;
                            case 3:
                                System.out.println(
                                        "\nThank you for using the program. Goodbye!\n");
                                break;
                            default:
                                System.out.println("\nInvalid input\n");
                                break;
                        }
                        if(choiceLibrarian==3){
                            break;
                        }
                    } while (choiceLibrarian != 3);
                    break;
                case 2:
                    int memberChoices = 0;
                    do {
                        System.out.println("Enter Choices : \n 1- Add Member \n 2- Remove Member \n 3- Update \n 4- Authentication \n 5- Back");
                        memberChoices = obj.nextInt();
                        switch (memberChoices) {
                            case 1:
                                System.out.print("Student ID : ");
                                int idNumber = obj.nextInt();

                                System.out.print("Student ContactNo.: ");
                                int contactNumber = obj.nextInt();
                                obj.nextLine();

                                System.out.print("Student Name : ");
                                String name = obj.nextLine();
                                //name
                                record = new Student(name, idNumber,
                                        contactNumber);
                                st.addMember(record);
                                System.out.println(record.toString());
                                break;
                            case 2:
                                System.out.print("What is the Student id number ? ");
                                int rId = obj.nextInt();
                                st.removeMember(rId);
                                break;
                            case 3:
                                System.out.print(
                                        "What is the Student id number? ");
                                int rIdNo = obj.nextInt();
                                st.update(rIdNo, obj);
                                break;
                            case 4:
                                System.out.print(
                                        "What is the Student id ? ");
                                int sId = obj.nextInt();
                                if (!st.find(sId)) {
                                    System.out.println(
                                            "Student id does not exist\n");
                                }
                                break;
                            case 5:
                                System.out.println(
                                        "\nThank you for using the program. Goodbye!\n");
                                break;
                            default:
                                System.out.println("\nInvalid input\n");
                                break;
                        }
                        if(memberChoices==5){
                            break;
                        }
                    } while (memberChoices != 5);
                    break;
                case 3:
                    int bookChoices = 0;
                    do {
                        System.out.println("Enter Choices : \n 1- Issue Book \n 2- Return Book \n 3- UpdateBookData \n 4- BrowseBooks \n 5- Back");
                        bookChoices = obj.nextInt();
                        Book recordBook = new Book();
                        recordBook.setBookId(12);
                        recordBook.setAuthorName("William");
                        recordBook.setName("Java");
                        recordBook.setIdNumber(46);
                        switch (bookChoices) {
                            case 1:
                                System.out.print("Book ID : ");
                                int bookId = obj.nextInt();

                                System.out.print("Student Id.: ");
                                int idNumber = obj.nextInt();
                                obj.nextLine();

                                System.out.print("Book Name : ");
                                String bName = obj.nextLine();
                                System.out.println("Author Name : ");
                                String authorName = obj.nextLine();

                                //name
                                recordBook = new Book(bName, bookId,
                                        idNumber, authorName);
                                recordBook.issueBook(recordBook);
                                System.out.println(recordBook.toString());
                                break;
                            case 2:
                                System.out.print("Book Id");
                                int bookID = obj.nextInt();
                                System.out.println("Enter the number of days Book returned Late: ");
                                int noOfDaysLate = obj.nextInt();
                                Book b = new Book(noOfDaysLate);
                                recordBook.fineBook(b);
                                recordBook.returnBook(bookID);
                                break;
                            case 3:
                                System.out.print(
                                        "Book Id");
                                int rIdNo = obj.nextInt();
                                recordBook.update(rIdNo, obj);
                                break;
                            case 4:
                                System.out.print("Book Id");
                                int sId = obj.nextInt();
                                if (!recordBook.find(sId)) {
                                    System.out.println("Book id does not exist\n");
                                }
                            case 5:
                                System.out.println(
                                        "\nThank you for using the program.\n");
                                break;
                            default:
                                System.out.println("\nInvalid input\n");
                                break;
                        }
                        if(bookChoices==5){
                            break;
                        }
                    } while (bookChoices != 5);
                    break;
                case 4 :
                    int transactionChoices =0;
                    do{
                        System.out.println("Enter Choices : \n 1- Create Transaction \n 2- Delete Transaction \n 3- UpdateTransactionData \n  5- Back");
                        transactionChoices = obj.nextInt();
                        Transactions recordTransaction = new Transactions();
                        recordTransaction.setTransId(12);
                        recordTransaction.setDateOfIssue("12 Jun");
                        recordTransaction.setMemberId(1);
                        switch (transactionChoices){
                            case 1:
                                System.out.print("Transaction ID : ");
                                int transId = obj.nextInt();

                                System.out.print("Member Id.: ");
                                int memberId = obj.nextInt();
                                System.out.print("Book Id : ");
                                int bookId = obj.nextInt();
                                obj.nextLine();
                                Book b = new Book(memberId);
                                b.fineBook(b);
                                System.out.println("Date of Transaction : ");
                                String dateOfTransaction = obj.nextLine();
                                recordTransaction = new Transactions(transId, memberId,
                                        bookId, dateOfTransaction);
                                recordTransaction.createTransaction(recordTransaction);
                                System.out.println(recordTransaction.toString());
                                break;
                            case 2:
                                System.out.print("Transaction ID: ");
                                int transID = obj.nextInt();
                                recordTransaction.deleteTransaction(transID);
                                break;
                            case 3:
                                System.out.print("Transaction Id");
                                int tID = obj.nextInt();
                                recordTransaction.updateTransaction(tID, obj);
                            case 4:
                                System.out.println("\nThank you for using the program.\n");
                                break;
                            default:
                                System.out.println("\nInvalid input\n");
                                break;
                        }
                        if(transactionChoices == 4){
                            break;
                        }
                    }while(transactionChoices != 5);
            }
        }while (choice != 5) ;
    }
    public static void adminLogin(){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Admin ID: ");
            aID = sc.nextLine();
            System.out.println("Enter Admin password: ");
            pass = sc.nextLine();
            if (aID.equals("Admin") && pass.equals("Admin123")) {
                System.out.println("Welcome Admin");
                break;
            } else {
                System.out.println("Invalid Admin Id or Password");
            }
        }
    }
}

