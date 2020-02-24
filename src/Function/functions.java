package Function;

import definition.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class functions {

    public void addnewcontact(ArrayList<Person> list) {
        char response = 'y';
        int count = 0;
        String fname;
        String lname;
        String mail = null;
        String num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of the Person\n+First Name:");
        fname = scan.nextLine();
        System.out.println("Last Name:");
        lname = scan.nextLine();
        System.out.println("Contact Number:");
        num = scan.nextLine();
        while (response == 'y') {
            System.out.println("Would you like to add another contact number? (y/n)");
            response = scan.next().charAt(0);
            if (response == 'y') {
                count++;
                scan.nextLine();
                System.out.println("Contact Number:");
                String n1 = scan.nextLine();
                num = num + ", " + n1;
            }
        }
        if (count != 0)
            num = "Contact Number(s): " + num;
        else if (count == 0)
            num = "Contact Number: " + num;

        System.out.println("Would you like to add email address? (y/n)");
        response = scan.next().charAt(0);

        if (response == 'y') {
            System.out.println("E-mail: ");
            scan.next();
            mail = scan.nextLine();
        }
        list.add(new Person(fname, lname, num, mail));


    }

    public void viewall(ArrayList<Person> list) {
        System.out.println("---Here are all your contacts---");
        System.out.println("--------*---------*--------*--------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("--------*---------*--------*--------");
            System.out.println("--------*---------*--------*--------");
        }
    }

    public void search(ArrayList<Person> list) {
        int check=-1;
        Scanner scan = new Scanner(System.in);
        System.out.println("You can search for first names: ");
        String name = scan.nextLine();
        for (int index = 0; index < list.size(); index++) {
            if (name.equals(list.get(index).getFname())) {
                check++;
                System.out.print(index + 1+". ");
                System.out.println(list.get(index));

            }
        }if(check==-1){
                System.out.println("Contact not found!!");
            }

    }
    public void delete(ArrayList<Person> list){
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<list.size();i++){
            System.out.print(i+1+". ");
            System.out.println(list.get(i).getFname() +" "+list.get(i).getLname());
        }
        System.out.println("Enter the no. of the contact you want to delete.");
        int choice = scan.nextInt();
        list.remove( choice -1 );
    }


}
