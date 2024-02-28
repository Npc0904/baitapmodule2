package bai6;

import java.util.Scanner;

public class Product {
        private String Id;
        private String Name;
        private Float Price;
        private Float Import;

        public Product() {
        }
        public Product(String Id, String Name, Float Price, Float Import) {
            this.Id = Product.this.Id;
            this.Name = Product.this.Name;
            this.Price = Price;
            this.Import = Product.this.Import;
        }
         public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public Float getImport() {
        return Import;
    }

    public void setImport(Float Import) {
            this.Import = Product.this.Import;
        }
        public void enterInfo(){
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Nhap thong tin san pham ");
                System.out.println("Ten san pham");
                Name = sc.nextLine();
                System.out.println("Ma san pham");
                Id = sc.nextLine();
                System.out.println("Gia nhap");
                Import = new Scanner(System.in).nextFloat();
                System.out.println("Gia ban");
                Price = new Scanner(System.in).nextFloat();
                System.out.println("Ban co muon nhap tiep tuc? (c/k)");
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("k"))
                    break;
            } while (true);
        }
        public void showInfo(){
            System.out.println("San pham: "+Name+" Ma : "+Id+" Gia ban: "+Price +" $"+" Gia nhap: "+Import+" $");
        }
        public Float interestRate(){
            return Price -Import;
        }
    }
