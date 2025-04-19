package solid.single_responsibility_principle.correct;

public class BookC {

    private String title;
    private String author;
    private Integer numberPages;

    public BookC(String title, String author, Integer numberPages) {
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
