package definition;

public class Person {
    private String fname;
    private String lname;
    private String mail;
    private String num;

    public Person(String fname, String lname, String num, String mail) {
        this.fname = fname;
        this.lname = lname;
        this.num = num;
        this.mail = mail;


    }
    public String getLname(){
        return lname;
    }


    public String getFname() {
        return fname;
    }

    @Override
    public String toString() {
        return "First Name: " + this.fname + "\nLast Name: " + this.lname + "\n" + this.num + "\nE-mail: " + this.mail + "\n";
    }
}
