public class Student extends Member {
    private String name;
    private int idNumber;
    private int contactNumber;
    String Name;

    public Student() {
    };

    Student(String mName, int mId, int contactNumber) {
        this.Name = mName;
        this.idNumber = mId;
        this.contactNumber = contactNumber;
    }

    public void setContactNumber(int contactNumber) {

        this.contactNumber = contactNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "Records: " + "Name=" + name + "\tIdNumber=" + idNumber + "\tContactNumber=" + contactNumber + '\t';
    }

}
