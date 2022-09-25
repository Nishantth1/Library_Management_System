import java.util.*;
class Transactions{
    String  dateOfIssue;
    private int transId;
    private int memberId;
    public Transactions(int transId){
        this.transId = transId;
    }
    public Transactions(){};
    LinkedList<Transactions> transactionList;

    public Transactions(int transId, int memberId, int bookId,
                        String dateOfIssue) {
        this.transId = transId;
        this.memberId = memberId;
        this.dateOfIssue = dateOfIssue;
        transactionList = new LinkedList<>();
    }
    public void createTransaction(Transactions transRecord){

        if (!find(transRecord.getTransId())){
            transactionList.add(transRecord);
        }
        else {

            System.out.println(
                    "Record already exists in the Record list");
        }
    }
    public boolean find(int transId)
    {
        try {
            for (Transactions t : transactionList) {
                if (t.getTransId() == transId) {

                    System.out.println(t);
                    return true;
                }
            }
        }catch (RuntimeException r){
            System.out.println("NullPointerException thrown!");
        }
        return false;
    }
    public void deleteTransaction(int transId)
    {
        Transactions recordDel = null;
        try {
            for (Transactions ll : transactionList) {

                if (ll.getTransId() == transId) {
                    recordDel = ll;
                }
            }
        }catch (RuntimeException r){
            System.out.println("NullPointerException thrown!");
        }

        if (recordDel == null) {

            System.out.println("Invalid record Id");
        }
        else {

            transactionList.remove(recordDel);

            System.out.println(
                    "Successfully returned the Book.");
        }
    }

    public void updateTransaction(int transId, Scanner input)
    {
        if (find(transId)) {
            Transactions rec = new Transactions(transId);

            System.out.print("New Transaction Id : ");
            int bookId = input.nextInt();

            System.out.print("New Date of Transaction : ");
            String edition = input.nextLine();
            input.nextLine();

            System.out.print("New Member Id : ");
            int memberId = input.nextInt();

            rec.setTransId(transId);
            rec.setDateOfIssue(dateOfIssue);
            rec.setMemberId(memberId);
            System.out.println("Information Updated Successfully.");
        }
        else {
            System.out.println("Record Not Found in the Transaction list");
        }
    }

    public void setDateOfIssue(String dateOfIssue) {

        this.dateOfIssue = dateOfIssue;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }


    @Override
    public String toString() {
        return "Records: " + "Transaction Id =" + transId + "\tMember Id =" + memberId + "\tDate of Issue =" + dateOfIssue + '\t';
    }
}
