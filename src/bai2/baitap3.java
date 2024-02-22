package bai2;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
            System.out.println("**CACULATOR**");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("Mời bạn nhập lựa chọn của mình :");
            int choice = scanner.nextInt();
        while (choice<1 || choice>8) {
            System.out.print("Vui lòng nhập lại lựa chọn : ");
            choice = scanner.nextInt();
        }
        System.out.println("Mời bạn nhập 2 số nguyên bất kỳ");
        System.out.println("Số thứ nhất:");
        a = scanner.nextInt();
        System.out.println("Số thứ hai:");
        b = scanner.nextInt();
            switch ( choice ){
                case 1:
                    System.out.println("Tổng 2 số là : "+(a+b));
                    break;
                case 2:
                    if (a > b){
                        System.out.println("Hiệu 2 số là : "+(a-b));
                    }else {
                        System.out.println("Hiệu 2 số là : "+(b-a));
                    }
                    break;
                case 3:
                    System.out.println("Tích 2 số là : "+(a*b));
                    break;
                case 4:
                    if (a >= b && b !=0){
                        System.out.println("Thương 2 số là : "+(a/b));
                    }else if(b > a && a !=0){
                        System.out.println("Thương 2 số là : "+(b/a));
                    }
                    break;
                case 5:
                    if (a >= b && b !=0){
                        System.out.println("Số dư trong phép chia 2 số là : "+(a%b));
                    }else if(b > a && a !=0){
                        System.out.println("Số dư trong phép chia 2 số là : "+(b%a));
                    }
                    break;
                case 6:
                    if (a ==0 || b ==0){
                        System.out.println("Ước chung lớn Nhất là : "+(a+b));
                    }else {
                        int minNumber ;
                        minNumber = a < b ? a : b ;
                        for (int i = minNumber; i >= 1 ; i--) {
                            if (a % i ==0 && b % i ==0){
                                System.out.println("Ước chung lớn Nhất là : "+i);
                                break;
                            }
                        }
                    }
                    break;
                case 7:
                    if (a ==0 || b ==0){
                        System.out.println("bội chung nhỏ Nhất là : "+0);
                    }else {
                        int MaxNumber = a <= b ? a : b ;
                        while (true){
                            if (MaxNumber % a ==0 && MaxNumber % b ==0){
                                System.out.println("bội chung nhỏ Nhất là : "+MaxNumber);
                                break;
                            }
                            ++MaxNumber;
                        }
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
            }
    }
}
