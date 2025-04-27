package solid.singleResponsibilityPrinciple.correct;

public class BookRepository {

    public void saveBook(Book book) {
        System.out.println("Save the book " + book.getTitle() + "in database...");
    }
}
