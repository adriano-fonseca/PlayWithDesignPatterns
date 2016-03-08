package com.company.app.builder;

import java.util.ArrayList;

public class Book {
  
  private final Long id;
  private final String title;
  private final String author;
  private final int nrPages;
  private ArrayList<Page> pages = new ArrayList<Page>();
  
  public ArrayList<Page> getPages() {
    return pages;
  }

  public void setPages(ArrayList<Page> pages) {
    this.pages = pages;
  }

  public static class Builder{
    private String title;
    private Long id;
    private String author;
    private int nrPages;
    
    public Builder(String title){
      this.title=title;
    }
    
    public Builder id(Long id){
      this.id=id;
      return this;
    }
    
    public Builder author(String author){
      this.author=author;
      return this;
    }
    
    public Builder nrPages(int nr){
      this.nrPages=nr;
      return this;
    }
    
    public Book build() {
      return new Book(this);
    }
    
  }
  
  public Book(Builder builder){
    this.title = builder.title;
    this.id = builder.id;
    this.author=builder.author;
    this.nrPages=builder.nrPages;
  }
  
  @Override
  public String toString() {
    return "Book [id=" + id + ", title=" + title + ", author=" + author + ", nrPages=" + nrPages + ", pages=" + pages + "]";
  }

  
  public static void main(String[] args){
    Book b1 = new Book.Builder("O despertar").author("Marlon Banedict").id(1L).nrPages(150).build();
    writePage(b1);
    printBook(b1);
  }
  
  private static void writePage(Book b1) {
    b1.getPages().add(new Page.Builder().pageNumber(1).content("Text from page 1.").build());
  }
  
  private static void readPage(Book b1, int pg){
    System.out.println(b1.getPages().get(pg-1).getContent());
  }

  private static void printBook(Book b1) {
    System.out.println(b1);
  }
 
  
}


