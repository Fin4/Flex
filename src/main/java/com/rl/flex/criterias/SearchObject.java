package com.rl.flex.criterias;

public class SearchObject {

    private final String search;

    private final int price;

    private final Category category;

    private final String brand;

    public String getSearch() {
        return search;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public SearchObject(String search, int price, Category category, String brand) {

        if (price < 0) throw new RuntimeException("Price can't be negative");

        this.search = search;
        this.price = price;
        this.category = category;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SearchObject{" +
                "search='" + search + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", brand='" + brand + '\'' +
                '}';
    }
}
