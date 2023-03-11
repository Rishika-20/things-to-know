package com.knoldus.numberofconnectionsindatabase;

public class Database {
    private static int numOfConnections = 0;
    public static int establishConnection() {
       return numOfConnections++;
    }
    public static int closeConnection() {
        return numOfConnections--;
    }
    public static int getNumOfConnections() {
        return numOfConnections;
    }
    public static void main(String[] args){

        Database.establishConnection();
        Database.establishConnection();
        Database.establishConnection();
        System.out.println("Number of active database connections: " + Database.getNumOfConnections());

        Database.closeConnection();
    }
}
