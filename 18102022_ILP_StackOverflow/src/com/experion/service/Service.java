package com.experion.service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import com.experion.entity.Product;


public class Service {
    static Date dateOpen;
    static Date dateValid;
    static Date dateExpiry;



   public static Product createProduct() throws Exception {



       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Proudct Code - ");
        String productCode = scanner.nextLine();
        System.out.println("Enter Product Name - ");
        String productName = scanner.nextLine();
        System.out.println("Enter Product Description - ");
        String productDescription = scanner.nextLine();
        System.out.println("Enter Product Price - ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Product Open Date - ");
        String openDate = scanner.nextLine();



       System.out.println("Enter Product Valdity Date - ");
        String validityDate = scanner.nextLine();



       System.out.println("Enter Product Expiry Date - ");
        String expiryDate = scanner.nextLine();



       System.out.println("Active (true or false) - ");
        boolean active = scanner.nextBoolean();



       Product product = new Product(productCode, productName, productDescription, productPrice, openDate,
                validityDate, expiryDate, active);
        product.setSerielNo(product.getSerielNo() + 1);
        product.setSerielNoOriginal(product.getSerielNo());
        return product;
        /*
         * product.setProductCode(productCode); product.setProductName(productName);
         * product.setProductDescription(productDescription);
         * product.setProductPrice(productPrice); product.setOpenDate(openDate);
         * product.setExpiryDate(expiryDate); product.setValidityDate(validityDate);
         */



   }



   public static void displayProductDetails(ArrayList<Product> productList) {



       System.out.println("SI No:" + "\t" + "Product Name " +"\t\t" + "Product Code" + "\t\t"
                + "Product Description" + "\t\t" + "Product Price" + "\t\t" + "Open Date" + "\t\t"
                + "Validity Date" + "\t\t" + "Expiry Date");
        for (Product product : productList) {
            if (product != null)
                System.out.println(product.getSerielNoOriginal() + " \t" + product.getProductName() + "\t\t"
                        + product.getProductCode() + " \t\t" + product.getProductDescription() + "\t\t"
                        + product.getProductPrice() + "\t\t" + product.getOpenDate() + "\t\t"
                        + product.getValidityDate() + "\t\t" + product.getExpiryDate());
        }



   }



   public static void purchaseProduct(ArrayList<Product> productList) throws Exception {



       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product code - ");
        String enteredProductCode = scanner.nextLine();
        System.out.println("Enter Purchase Date(dd//mm/yyyy - ");
        String enteredProductDate = scanner.nextLine();



       Date dateEntered = new SimpleDateFormat("dd/MM/yyyy").parse(enteredProductDate);



       for (Product product : productList) {
            if (enteredProductCode.equalsIgnoreCase(product.getProductCode())) {
                dateOpen = new SimpleDateFormat("dd/MM/yyyy").parse(product.getOpenDate());
                dateValid = new SimpleDateFormat("dd/MM/yyyy").parse(product.getValidityDate());
                dateExpiry = new SimpleDateFormat("dd/MM/yyyy").parse(product.getExpiryDate());
            }
        }



       if (dateEntered.after(dateOpen) && dateEntered.before(dateValid))
            System.out.println("Purchase success!!");
         else if (dateEntered.before(dateOpen) || dateEntered.after(dateValid))
            System.out.println("Product not available ");



        else if (dateEntered.compareTo(dateOpen)==0 && dateEntered.compareTo(dateValid)==0)
             System.out.println("Product available  ");
             



   }



}
