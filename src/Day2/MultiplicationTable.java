package Day2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        MultiplicationTable table = new MultiplicationTable();
        table.printMultiplicationTable(5);
    }

    public void printMultiplicationTable(int n){
        for(int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print(" " + i + " x "+ j + " = " + i*j );
            }
        }
    }
}

