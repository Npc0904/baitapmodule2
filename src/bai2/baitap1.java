package bai2;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] number = new int[5];
            System.out.println("Moi ban nhap nam so nguyen :");
            number[0] = scanner.nextInt();
            number[1] = scanner.nextInt();
            number[2] = scanner.nextInt();
            number[3] = scanner.nextInt();
            number[4] = scanner.nextInt();
            for (int i = 0; i < 5; i++) {
                System.out.println("gia tri thu " + (i + 1) + " cua mang la : " + number[i]);
            }
        }
    }
