// written by Myungsik Kim 01/29/2019.
// OOP - Constructor, Encapsulation, Information Hiding, Controlling Access to Members of a Class, and Inheritance.

//There are no package declared. So all down below classes are belong to "default" package.

public class JavaBasic01 { // you can call this "public" class in any java classes.
    public static void main(String[] args) {
        Bank citi = new Bank(2019001);
        System.out.println(citi.getId());
        citi.comment = "Mr. Kim's Account";
        System.out.println(citi.comment);

        Clerk kim = new Clerk();
        kim.clerkId(1101);
        System.out.println(kim.clerkId);

        kim.IsUserActive(true);
        System.out.println(kim.active_user);
    }
}

class Bank { // you can call this "default" class in only same package.
    private int id = 0; // Private: It can be accessed from only under "Bank" class and able to use this variable.
    public String comment = ""; // Public: It can be accessed from anywhere.
    int clerkId = 0; // Default: It can be accessed from in same Package.
    protected boolean active_user = false; //even if child class have different package, "protected" allows to use this variable.

    public Bank(){ // Default constructor

    }

    public Bank(int i) { // Parameterized Constructor
        setId(i);
    }

    public void setId(int i) {
        if (i < 0) {
            id = 0;
            return;
        }
        id = i;
    }

    public int getId() {
        return id;
    }
}

class Clerk extends Bank { //Clerk is a child class and inherits from the parent class Bank.
    public void clerkId(int i){
        clerkId = i; //In this case class Clerk and Bank are belong to default package. That's why class Clerk can use clerkId variable.
    }

    public void IsUserActive(boolean b){
        active_user = b; //If Clerk and Bank classes are belong to different package, protected (Line 26) allows to use it in child class.
    }
}

/* You can't use more than two "public" class in same java class.
public class JavaBasic02{

}
*/