// written by Myungsik Kim 02/09/2019.
// Foreach for array & Inheritance and initialize

public class JavaBasic02 {
    public static void main(String[] args) {
        char[] a = {'a','b','c','d'};
        String[] c = {"yo","wadup","It's kim"};

        for(char b : a){
            System.out.println(b);
        }

        for(String d : c){
            System.out.println(d);
        }
    }

    class parent{ //Super or parent class
        String name;

        parent(){ //
            System.out.println("default constructor");
        }

        parent(String name){
            this.name = name;
        }

        void callname(){
            System.out.println("I am your parent");
        }
    }

    class child extends parent{ //sub or child class
        String parent_name;

        child(){
            System.out.println("default constructor");
        }

        child(String name, String parent_name){
            super(name); //call super or parent constructor
            this.parent_name = parent_name;
        }

        void tellname(){
            callname();
        }

        @Override //parent class method override
        void callname() {
            super.callname();
        }
    }
}