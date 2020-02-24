package Main;

import Function.functions;
import definition.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        int response = 0;
        System.out.println("Welcome to Yash's Contact List App\n" +
                "        Press 1 to add a new contact\n" +
                "        Press 2 to view all contacts\n" +
                "        Press 3 to search for a contact\n" +
                "        Press 4 to delete a contact\n" +
                "        Press 5 to exit program");
        functions ob = new functions();
        Scanner sc = new Scanner(System.in);
        while(response!=5){
        response = sc.nextInt();
        switch (response) {
            case 1:
                ob.addnewcontact(list);
                break;
            case 2:
                ob.viewall(list);
                break;
            case 3:
                ob.search(list);
                break;
            case 4:
                break;
            case 5:
                System.out.println("Thank you!!");
                break;
        }


        }


    }
}
