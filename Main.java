package com.assignmnet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        AssignmnetC c = new AssignmnetC();
//        c.assignVars();
//        System.out.println("Last num of a: " + c.lastNumOfA());
//        System.out.println("First num of b: " + c.firstNumOfB());
//        System.out.println("Sum of digits of c: " + c.sumOfDigits());
//        System.out.println("lastNumOfA * firstNumOfB: "+ c.method5());
//        System.out.println("firstNumOfB + method5: " + c.method6());

//        AssignmentB b = new AssignmentB();
//        b.assignX();
//        b.assignY();
//        System.out.print("X + Y = ");
//        b.printXplus12();
//        System.out.println(b.isEvenX());
//        System.out.println(b.getSum());

        Task3 t = new Task3(10,5);
        t.appendRandomNums();
        System.out.println(Arrays.toString(t.randomNums));
        System.out.println("Number of even: " + t.countEvens());
        System.out.println("Number of odds: " + t.countOdds());
        System.out.println("sum of evens: " + t.sumOfEvens());
        System.out.println("sum of odds: " + t.sumOfOdds());
        System.out.println("===== Random numbers between sums ======");
        t.randomsBetweenSums();

    }
}
