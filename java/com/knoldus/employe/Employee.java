package com.knoldus.employe;

public class Employee {
        private static int nextId = 1852;
        private int id;

        public Employee() {
            id = nextId;
            nextId++;
        }
        public int getId() {
            return id;
        }
        public static void main(String[] args) {
            Employee empOne = new Employee();
            Employee empTwo = new Employee();
            System.out.println("First employee Id: "+empOne.getId());
            System.out.println("Second employee Id: "+empTwo.getId());
        }
}


