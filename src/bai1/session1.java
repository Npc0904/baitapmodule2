package bai1;

import java.util.Scanner;

public class session1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap so can check :");
        float number = scanner.nextFloat();
        if (number % 3.0F == 0.0F) {
            if (number % 5.0F == 0.0F) {
                System.out.println("day la so can tim");
            }
        } else {
            System.out.println("day ko phai la so do");
        }
    }
}
