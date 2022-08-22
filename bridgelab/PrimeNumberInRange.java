package bridgelab;

import java.util.ArrayList;

public class PrimeNumberInRange {

    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        final int START = 0;
        final int END = 1000;
        printPrime(START, END);

    }

    private static void printPrime(int startRange, int endRange) {
        System.out.println("Prime numbers are in between " + startRange + " and " + endRange + " are :");
        for (int i = startRange; i <= endRange; i++) {
            if (isPrime(i)) {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }

    public static boolean isPrime(int num) {
        int flag = 0;
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;


    }
}