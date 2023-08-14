package com.xja.domain;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private Integer bookId;
    private String bookName;
    private Double bookPrice;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(this.bookId, book.bookId);
    }
    public Book() {
    }

    public Book(Integer bookId, String bookName, Double bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }
    
    @Override
    public int compareTo(Book o) {
        return -((int) (bookPrice-o.bookPrice));
    }
}
