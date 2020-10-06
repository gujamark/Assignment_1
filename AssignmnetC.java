package com.assignmnet;

import java.util.Scanner;

public class AssignmnetC {
    int a,b,c;

    public void assignVars() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scan.nextInt();
        System.out.print("Enter b: ");
        b = scan.nextInt();
        System.out.print("Enter c: ");
        c = scan.nextInt();
    }

    public int lastNumOfA() {
        return a % 10;
    }

    public int firstNumOfB() {
        int copyOfB = b;

        while(copyOfB >= 10){
            copyOfB /= 10;
        }

        return copyOfB;
    }

    public int sumOfDigits() {
        int copyOfC = c;
        int sum = 0;

        while(copyOfC > 0){
            sum += copyOfC % 10;
            copyOfC /= 10;
        }
        return sum;
    }

    public int method5() {
        return lastNumOfA() * firstNumOfB();
    }

    public int method6() {
        return firstNumOfB() + method5();
    }


}
