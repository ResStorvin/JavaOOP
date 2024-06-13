package Day2;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        SumOfNaturalNumbers sum = new SumOfNaturalNumbers();
        System.out.println(sum.sumUsingForLoop(5));
        System.out.println(sum.sumUsingWhileLoop(5));
    }
    public int sumUsingForLoop(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += i;
        }
        return sum;
    }
    public int sumUsingWhileLoop(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        return sum;
    }
}
