package tasks;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int sum = 0;
        int quantity = 0;
        while(true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            sum += num;
            quantity++;
        }
        average = sum/quantity;
        System.out.println(average);
    }
}