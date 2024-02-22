package bai2;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap gia tri cua n");
        int num;
        num = scanner.nextInt();
        float[] number = new float[num];
        float sum = 0;
        System.out.println("hay nhap gia tri cua mang:");
        for (int i = 0; i < num; i++) {
            System.out.println("gia tri thu "+(i+1)+" la:");
            number[i] = scanner.nextFloat();
            sum += number[i];
        }
        System.out.println("trung bing cong cua mang la : "+sum/num);
    }
}
