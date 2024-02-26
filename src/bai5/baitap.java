package bai5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class baitap {
    public static void main(String[] args) {
//        viet chuiong trinh quan kly thong tin cua sinh vien
//        1.ma sinh vien
//        2.ho ten
//        3.sodienthoai
//        ngay thang nam sinh
//        5 in thong tin sinh vien
//        validate duwx lieeu cho
//        phone dung dinh dang dong lao
//        email
//        ma sinh vien phai bat dau bang chu B va co 3 so ow sau
//        ho ten ko chua ky tu dac biet tru khoang trang
//        nam sinh

                Scanner scanner=new Scanner(System.in);
                System.out.println("Moi ban nhap thong tin");
                String id,fullName,phone,birthDate;
                do {
                    System.out.println("Moi ban nhap ma sinh vien");
                    id= scanner.nextLine();
                    Pattern patternid=Pattern.compile("B[0-9]{3}");
                    Matcher check= patternid.matcher(id);
                    if (check.matches()) {
                        System.out.println("checked");
                        break;
                    }else {
                        System.err.println("hay nhap lai ma so sinh vien");
                    }

                }while (true);

                do {
                    System.out.println("Moi ban nhap ho va ten");
                    fullName=scanner.nextLine();
                    Pattern patternfullName=Pattern.compile("[a-z A-Z]+\\s?[a-z A-Z]{10,}");
                    Matcher check=patternfullName.matcher(fullName);
                    if (check.matches()){
                        System.out.println("checked");
                        break;

                    }else {
                        System.err.println("Moi ban nhap lai ho va ten");
                    }
                }while (true);
                do {
                    System.out.println("Moi ban nhap so dien thoai");
                    phone=scanner.nextLine();
                    Pattern patternphone=Pattern.compile("84|0[3|5|7|8|9]+[0-9]{8}");
                    Matcher check=patternphone.matcher(phone);
                    if (check.matches()){
                        System.out.println("checked");
                        break;
                    }else {
                        System.err.println("Moi ban nhap lai so dien thoai");
                    }
                }while(true);
                do {
                    System.out.println("Moi ban nhap ngay thang nam sinh");
                    birthDate=scanner.nextLine();
                    Pattern patternbirthDate=Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
                    Matcher check= patternbirthDate.matcher(birthDate);
                    if (check.matches()) {
                        System.out.println("checked");
                        break;
                    }else {
                        System.err.println("Moi ban nhap lai ngay thang nam sinh");
                    }
                }while(true);
//        in thong tin
                System.out.println("Thong tin sinh vien");
                System.out.println("Ma so : "+id);
                System.out.println("Ho va Ten : "+fullName);
                System.out.println("Phone : "+phone);
                System.out.println("Ngay thang nam sinh : "+birthDate);
            }
        }
