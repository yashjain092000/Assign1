package Function;

import definition.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class functions {
    ArrayList<Person> list=new ArrayList<>();

    public void addnewcontact(){
        char response='y';
        int i=0;
        String fname;
        String lname;
        String mail = null;
        long[] num=new long[5];
        int count=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the name of the Person\n+First Name:");
        fname=scan.nextLine();
        System.out.println("Last Name:");
        lname=scan.nextLine();
        System.out.println("Contact Number:");
        num[i++] = scan.nextLong();
        while(response=='y') {
            System.out.println("Would you like to add another contact number? (y/n)");
            response=scan.next().charAt(0);
            if(response=='y') {
                System.out.println("Contact Number:");
                num[i++] = scan.nextLong();
                count++;
            }


        }
        System.out.println("Would you like to add email address? (y/n)");
        response=scan.next().charAt(0);
        if(response=='y')
            mail=scan.nextLine();
        if(count==1){
            list.add(new Person(fname,lname,mail,num[0]));

        }
        else if(count==2) {
            list.add(new Person(fname,lname,mail,num[0],num[1]));
        }
        else if(count==3){
            list.add(new Person(fname,lname,mail,num[0],num[1],num[2]));

        }
        else{
            list.add(new Person(fname,lname,mail,num[0],num[1],num[2],num[3]));

        }



    }
}
