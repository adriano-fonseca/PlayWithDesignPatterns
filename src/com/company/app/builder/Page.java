package com.company.app.builder;

public class Page {
  private final int pageNumber;
  private final String content;
  
  public int getPageNumber() {
    return pageNumber;
  }
  
  public String getContent(){
    return content;
  }
 
  @Override
  public String toString() {
    return "Page [pageNumber=" + pageNumber + ", content=" + content + "]";
  }

  public Page(Builder builder){
    this.pageNumber=builder.pageNumber;
    this.content=builder.content;
  }
  
  public static class Builder{
    
    private int pageNumber;
    private String content;
    
    public Builder pageNumber(int nr){
      this.pageNumber=nr;
      return this;
    }
    
    public Builder content(String content){
      this.content=content;
      return this;
    }
    
    public Page build(){
      return new Page(this);
    }
    
  }
  
    
}
