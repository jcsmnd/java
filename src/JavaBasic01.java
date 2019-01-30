// written by Myungsik Kim 01/29/2019
// OOP - Encapsulation

public class JavaBasic01 {
    public static void main(String[] args) {
        Bank citi = new Bank(2019001);
        System.out.println(citi.getId());
    }
}

class Bank {
    private int id = 0;

    public Bank(int i) {
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