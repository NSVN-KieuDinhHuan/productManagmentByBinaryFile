package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements ReadFile,WriteFile{
    private List<Product> products=new ArrayList<>();
    public int size(){
        return products.size();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addNewProduct(int index, Product product){
            this.products.add(index, product);

    }

    public void displayAllProduct(){

        for (int i = 0; i < products.size(); i++) {
            System.out.println((i ) + "\t" + products.get(i));
        }
    }

    public void updateProduct(int index, Product newProduct) {
        if (index<0||index>products.size()){
            System.out.println("Vị trí nhập vào không hợp lệ!");
        }else {
            this.products.set(index, newProduct);
        }

    }
    public void removeProduct(int index)  {
        this.products.remove(index);
    }
    public void findProductByName(String nameProduct) {
        boolean checkProduct = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(nameProduct)) {
                checkProduct = true;
                System.out.println(i + "\t" + products.get(i));
                break;
            }
        }
        if (checkProduct == false) {
            System.out.println("không có sản phẩm mà bạn đang tìm kiếm");
        }
    }
    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        this.products = (List<Product>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(this.products);
    }
}
