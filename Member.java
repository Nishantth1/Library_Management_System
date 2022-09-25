import java.util.LinkedList;
import java.util.Scanner;

public class Member{
    public int type;
    LinkedList<Student> studentsList;
    Scanner sc = new Scanner(System.in);
    Member(){
        studentsList = new LinkedList<>();
    }
    public void addMember(Student record){

        if (!find(record.getIdNumber())){
            studentsList.add(record);
        }
        else {

            System.out.println(
                    "Record already exists in the Record list");
        }
    }
    public boolean find(int idNumber)
    {

        for (Student l : studentsList) {
            if (l.getIdNumber() == idNumber){

                System.out.println(l);
                return true;
            }
        }
        return false;
    }
    public void removeMember(int recIdNumber)
    {
        Student recordDel = null;

        for (Student ll : studentsList) {

            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
            }
        }

        if (recordDel == null) {

            System.out.println("Invalid record Id");
        }
        else {

            studentsList.remove(recordDel);

            System.out.println(
                    "Successfully returned the Book.");
        }
    }

    public Student authentication(int idNumber)
    {

        for (Student l : studentsList){

            if (l.getIdNumber() == idNumber){
                return l;
            }
        }

        return null;
    }

    public void update(int id, Scanner input)
    {
        if (find(id)) {
            Student rec = authentication(id);

            System.out.print("New Student Id : ");
            int idNumber = input.nextInt();

            System.out.print("New Student Contact No. : ");
            int contactNumber = input.nextInt();
            input.nextLine();

            System.out.print("New Student Name : ");
            String name = input.nextLine();

            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Information Updated Successfully.");
        }
        else {
            System.out.println("Record Not Found in the Student list");
        }
    }
}
