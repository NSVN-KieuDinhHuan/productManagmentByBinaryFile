package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int choice = -1; //Để nhập lựa chọn của người dùng
        ProductManagement productManagement = new ProductManagement();
        productManagement.readFile("product.txt");
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("---Danh sách sản phẩm---");
                    productManagement.displayAllProduct();
                    break;
                }
                case 2: {
                    System.out.println("---Thêm mới sản phẩm---");
                    System.out.println("Nhập vị tí muốn thêm sản phẩm");
                    int index = scanner.nextInt();
                    Product product = inputProduct();
                    productManagement.addNewProduct(index, product);
                    break;
                }
                case 3: {
                    System.out.println("---Cập nhật thông tin sản phẩm---");
                    System.out.println("Nhập vị tí muốn thêm sản phẩm");
                    int index = scanner.nextInt();
                    Product product = inputProduct();
                    productManagement.updateProduct(index, product);
                    break;
                }
                case 4: {
                    System.out.println("---Xóa sản phẩm---");
                    System.out.println("Nhập vị tí muốn xóa sản phẩm");
                    int index = scanner.nextInt();
                    productManagement.removeProduct(index);
                    break;
                }

                case 5: {
                    System.out.println("---Tìm sản phẩm theo tên---");
                    System.out.println("Nhập tên sản phẩm");
                    scanner.nextLine();
                    String name=scanner.nextLine();
                    productManagement.findProductByName(name);
                    break;
                }
            }
            productManagement.writeFile("product.txt");
        } while (choice != 0);


    }

    public static Product inputProduct() {//Nhập thông tin sản phẩm
        System.out.println("Nhập thông tin của sản phẩm");
        System.out.println("Nhập mã sản phẩm:");
        scanner.nextLine();
        String code = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập nhãn hiệu:");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        String price = scanner.nextLine();;

        System.out.println("Nhập mô tả sản phẩm");
        String description = scanner.nextLine();
        return new Product( code,name,brand,price,description);
    }
    public static void menu() {
        System.out.println("---MENU QUẢN LÝ SẢN PHẨM---");
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("3. Cập nhật sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Tìm sản phẩm theo tên");
        System.out.println("0. Thoát chương trình");
    }
}
