package bai1;

public class session3 {
    public static void main(String[] args) {
        System.out.println("cac so nho hon 100 chia het cho 15 la: ");
        for (int j = 2; j < 100 ; j++) {
            boolean check = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % 15 == 0) {
                    check = false;
                }
            }
            if (check){
                System.out.print(j +",");
            }
        }
    }
}
