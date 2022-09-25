import java.util.*;
class Librarian{
    static String[] Librarians = {"Jack"};
    Scanner sc = new Scanner(System.in);
    Librarian(){

    }
    public static void addLibrarian(String x){
        System.out.println("Initial Array: " + Arrays.toString(Librarians));
        int length_Var = Librarians.length;
        String[] addLibrarian = new String[ length_Var + 1 ];
        for (int i=0; i <Librarians.length; i++)
        {
            addLibrarian[i] = Librarians [i];
        }
        addLibrarian[addLibrarian.length- 1] = x;
        Librarians = addLibrarian;
        System.out.println("updated Member List: " + Arrays.toString(Librarians));
    }
    public void removeLibrarian(String item){
        System.out.println("Initial Array: " + Arrays.toString(Librarians));
        int length_Var = Librarians.length;
        String[] removeLibrarian = new String[ length_Var - 1 ];
        removeLibrarian = Arrays.stream(Librarians)
                .filter(s -> !s.equals(item))
                .toArray(String[]::new);
        Librarians = removeLibrarian;
        System.out.println("Updated Member List: " + Arrays.toString(Librarians));
    }
    public void login(){
        System.out.println("Enter  Librarian Username: ");
        String uname = sc.nextLine();
        System.out.println("Enter Librarian Password: ");
        int pass = sc.nextInt();

    }
}
