package com.knoldus.protectedexample;
public class ProtectedExample {
        protected void printDetails() {
            System.out.println("Hello, I am superclass protected method.");
        }
    }
    class subprotectedclass extends ProtectedExample {
        protected void printDetails() {
            System.out.println("Hello, I am subclass protected method.");
        }
   }
   class ProtectedExampleImplementations{
        public static void main(String args[]) {
            subprotectedclass subclass = new subprotectedclass();
            subclass.printDetails();
        }
    }

