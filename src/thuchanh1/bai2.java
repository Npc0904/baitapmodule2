package thuchanh1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
            double chieuCao, canNang, chiSoBMI;
            String ketQua;


            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập cân nặng: ");
            canNang = scanner.nextDouble();
            System.out.println("Nhập chiều cao: ");
            chieuCao = scanner.nextDouble();

            // tính chỉ số BMI
         chiSoBMI = canNang / (chieuCao * chieuCao);
            System.out.println("Chỉ số BMI = " + chiSoBMI);

            // phân loại dựa vào chỉ số BMI
            if (chiSoBMI < 18) {
                ketQua = "Bạn là người gầy!";
            } else if (chiSoBMI <= 24.9) {
                ketQua = "Bạn là người bình thường";
            } else if (chiSoBMI <= 29.9) {
                ketQua = "Bạn bị béo phì độ I";
            } else if (chiSoBMI <= 34.9) {
                ketQua = "Bạn bị béo phì độ II";
            } else {
                ketQua = "Bạn bị béo phì độ III";
            }

            System.out.println(ketQua);
        }
    }
