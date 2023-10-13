package com.pluralsight;

import java.util.Scanner;
public class book {
    static Scanner myScanner = new Scanner(System.in);
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public book(){
        id = 0;

        isbn = "";

        title = "";

        isCheckedOut = false;

        checkedOutTo = "";

    }
    public int getId() {
        return this.getId();
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIsbn() {
        return this.getIsbn();
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return this.getTitle();
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean getIsCheckedOut() {
        return this.getIsCheckedOut();
    }
    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }
    public String getCheckedOutTo() {
        return this.getCheckedOutTo();
    }
    public void setCheckedOutTo(String checkedOutTo){
        this.checkedOutTo = checkedOutTo;
    }
    public void checkOut(String name) {
          this.checkedOutTo = name;
          this.isCheckedOut = true;


    }
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;

    }
}
