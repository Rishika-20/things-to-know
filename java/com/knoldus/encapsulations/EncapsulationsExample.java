package com.knoldus.encapsulations;

public class EncapsulationsExample {

    private String name;
    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public static void main(String[] args) {
        EncapsulationsExample encapsulates = new EncapsulationsExample();
        encapsulates.setName("Rishika");
        System.out.println(encapsulates.getName());
    }
}

