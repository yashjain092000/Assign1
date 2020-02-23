package definition;

public class Person {
    private String fname;
    private String lname;
    private String mail;
    private long[] num;

    public Person(String fname, String lname, String mail, long... num) {
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
        this.num=num;



    }


}
