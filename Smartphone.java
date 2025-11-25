package com.mycompany.exam_question;

public class Smartphone {

    private String brand;
    private int storage;

    public Smartphone() {
        setBrand("Generic");
        setStorage(64);
    }

    public Smartphone(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isBlank()) {
            this.brand = brand;
        } else {
            System.out.println("null");
        }
    }

    public int getStorage() {

        return storage;
    }

    public void setStorage(int storage) {
        if (storage >= 32 && storage <= 1024) {
            this.storage = storage;
        } else {
            System.out.println("null");
        }

    }

    public double getBrandCost() {
        int cost = 0;
        switch (this.brand) {
            case "Apple":
                cost = 1000;
                break;
            case "Samsung":
                cost = 800;
                break;
            case "Generic":
                cost = 500;
                break;
            default:
                throw new AssertionError();
        }
        return cost;
    }

    public double getStorageCost() {
        int cost = 0;
        if (this.storage >= 32 && this.storage <= 128) {
            cost = this.storage * 4;
        } else if (this.storage >= 129 && this.storage <= 512) {
            cost = this.storage * 3;
        } else if (this.storage >= 513 && this.storage <= 1024) {
            cost = this.storage * 2;
        }
        return cost;
    }

    public double getTotalCost() {
        double total = getBrandCost() + getStorageCost();
        return total;
    }

    public void UpgradeStorage(int newStorage) {
        int upgraded = this.storage + newStorage;
        if (upgraded >= 32 && upgraded <= 1024) {
            this.storage = upgraded;
        } else {
            System.out.println("Upgrade out of range!");
        }
    }

    @Override
    public String toString() {
        return "Smartphone { " + "brand= " + brand + ", storage= " + storage + ", Total Cost= " + getTotalCost() + " }";
    }

}
