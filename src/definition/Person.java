package definition;

import java.util.Comparator;

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

    public static Comparator<Person> PersonNameComparator=new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            String s1=o1.getFname().toUpperCase();
            String s2=o2.getFname().toUpperCase();

            return s1.compareTo(s2);
        }
    };
    @Override
    public String toString() {
        return "First Name: " + this.fname + "\nLast Name: " + this.lname + "\n" + this.num + "\nE-mail: " + this.mail + "\n";
    }
}
