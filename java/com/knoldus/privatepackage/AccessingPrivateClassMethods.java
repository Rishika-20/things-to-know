package com.knoldus.privatepackage;
import com.knoldus.privatepackage.AccessingPrivateClassMethods;

public class AccessingPrivateClassMethods {
    public static void main(String[] args) {

        AccessingPrivateClass accessingPrivateClass = new AccessingPrivateClass();
        String newName = accessingPrivateClass.name;
        System.out.println(newName);
    }
}
