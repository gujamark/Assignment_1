package com.assignmnet;

public class Task3 {
    int a,b;
    int[] randomNums = new int[40];

    public int sumOfEvens, sumOfOdds;

    public Task3(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public int[] appendRandomNums() {
        if(a > b) {
            b = a + b;
            a = b - a;
            b = b - a;
        }

        for(int i = 0; i < 40; i++) {
            randomNums[i] = a + (int) (Math.random() * (b - a + 1));
        }

        return randomNums;

    }

    public int countEvens() {
        int count = 0;
        for(int i = 0; i < randomNums.length;i++) {
            if (randomNums[i] % 2 == 0)
                count += 1;
        }

        return count;
    }

    public int countOdds() {
        return randomNums.length - countEvens();
    }

    public int sumOfEvens() {
        int sum = 0;
        for(int i = 0; i < randomNums.length;i++) {
            if (randomNums[i] % 2 == 0)
                sum += randomNums[i];
        }

        sumOfEvens = sum;
        return sum;
    }

    public int sumOfOdds() {
        int sum = 0;
        for(int i = 0; i < randomNums.length;i++) {
            if (randomNums[i] % 2 != 0)
                sum += randomNums[i];
        }

        sumOfOdds = sum;
        return sum;
    }

    public void randomsBetweenSums() {
        int min,max;

        if(sumOfOdds > sumOfEvens) {
            min = sumOfEvens;
            max = sumOfOdds;
        } else {
            min = sumOfOdds;
            max = sumOfEvens;
        }

        for(int i = 0; i < 5;i++) {
            int random = min + (int)(Math.random() * (max - min + 1));
            System.out.println(random);
        }
    }


}
