package definition;

public class Person {
    private String fname;
    private String lname;
    private String mail;

    private String num;

    public Person(String fname, String lname, String mail, String num) {
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
        this.num = num;


    }


    @Override
    public String toString() {
        return "First Name: " + this.fname + "\nLast Name: " + this.lname + "\n" + this.num + "\nE-mail: " + this.mail;
    }
}
