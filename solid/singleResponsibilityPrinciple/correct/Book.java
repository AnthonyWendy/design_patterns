package solid.singleResponsibilityPrinciple.correct;

public class Book {

    private String title;
    private String author;
    private Integer numberPages;

    public Book(String title, String author, Integer numberPages) {
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getNumberPages() {
        return numberPages;
    }
}
