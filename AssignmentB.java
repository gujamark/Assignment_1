package com.assignmnet;

import java.util.Scanner;

public class AssignmentB extends AssignmentA{
    int y;

    public void assignY() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Y: ");
        y = sc.nextInt();
    }

    public int getSum() {
        return x + y;
    }
}
