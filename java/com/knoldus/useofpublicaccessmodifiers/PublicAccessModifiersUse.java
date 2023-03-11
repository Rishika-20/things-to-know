package com.knoldus.useofpublicaccessmodifiers;

public class PublicAccessModifiersUse {

    public void printPublicDetails() {
        System.out.println("This is a public method.");
    }
     public void printPackageDetails() {
         printPublicDetails(); {

         }
     }
    public static void main(String[] args) {
        PublicAccessModifiersUse publicAccess = new PublicAccessModifiersUse();
        publicAccess.printPackageDetails();

    }
}
