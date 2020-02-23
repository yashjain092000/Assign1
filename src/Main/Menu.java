package Main;

import Function.functions;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int response;
        System.out.println("Welcome to Yash's Contact List App\n" +
                "        Press 1 to add a new contact\n" +
                "        Press 2 to view all contacts\n" +
                "        Press 3 to search for a contact\n" +
                "        Press 4 to delete a contact\n" +
                "        Press 5 to exit program");
        functions ob=new functions();
        Scanner sc = new Scanner(System.in);
        response = sc.nextInt();
        switch (response) {
            case 1:
                ob.addnewcontact();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;


        }


    }
}
