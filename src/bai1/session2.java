package bai1;

import java.util.Scanner;

public class session2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb;
        System.out.println("moi ban nhap so can check");
        numb = scanner.nextInt();
        while (numb<1 || numb>9) {
            System.out.print("Vui lòng nhập lại một số  n: ");
            numb = scanner.nextInt();
        }
        switch (numb){
            case (1):
                System.out.println("mot");
                break;
            case (2):
                System.out.println("hai");
                break;
            case (3):
                System.out.println("ba");
                break;
            case (4):
                System.out.println("bon");
                break;
            case (5):
                System.out.println("nam");
                break;
            case (6):
                System.out.println("sau");
                break;
            case (7):
                System.out.println("bay");
                break;
            case (8):
                System.out.println("tam");
                break;
            case (9):
                System.out.println("chin");
                break;
            default:

        }
    }
}
