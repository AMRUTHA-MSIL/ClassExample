package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter item name");

        String userName = myObj.nextLine();

        if(userName.equals("pen"))
        {
            System.out.println("pen for writing " );
        }
        else if(userName.equals("pencil")) {
            System.out.println("pencil for drawing " );
        }
        else if(userName.equals("scale")) {
            System.out.println("scale for measuring " );
        }
    }
}
