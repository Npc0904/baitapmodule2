package bai6;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Product product = new Product();
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println(" =============MEnu===========\n" +
                        "    \n" +
                        "1.Nhập vào thông tin sản phâm\n" +
                        "2.Hiển thị thông tin \n" +
                        "3.Hiển thị lãi xuất \n" +
                        "4.Thoát");
                System.out.println("\n Nhap lua chon cya ban");
                int number = sc.nextInt();
                switch (number){
                    case 1:
                        product.enterInfo();
                        break;
                    case 2:
                        product.showInfo();
                        break;
                    case 3:
                        System.out.println("lai suat la: "+product.interestRate()+"$");
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Moi ban nhap lai lua chon");
                        break;
                }
            } while (true);
        }
    }
