package com.libraries.BTL.dto.book;

public class BookDto {
    private String name;
    private String author;
    private String publishingCompany;
    private String publishingYear;
    private int quantity;
    private Integer category_id;

    public BookDto(String name, String author, String publishingCompany, String publishingYear, int quantity, Integer category_id) {
        this.name = name;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
        this.quantity = quantity;
        this.category_id = category_id;
    }

    public BookDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
}
