package com.assignmnet;

import java.util.Scanner;

public class AssignmentA {
    int x;
    public AssignmentA() {
        System.out.println("Hello");
    }

    public void assignX() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        x = sc.nextInt();
    }

    public void printXplus12() {
        System.out.println(x + 12);
    }

    public boolean isEvenX() {
        return x % 2 == 0;
    }
}


