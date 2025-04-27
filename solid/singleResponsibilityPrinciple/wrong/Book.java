package solid.singleResponsibilityPrinciple.wrong;

public class Book {

    private String title;
    private String author;
    private Integer numberPages;

    public Book(String title, String author, Integer numberPages) {
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
    }


    public void save() {
        System.out.println("--Save--");
        System.out.println("Save the book " + this.title + "in database...");
    }

    public void printBook(){
        System.out.println("--Show--");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number pages: " + numberPages);
    }
}
