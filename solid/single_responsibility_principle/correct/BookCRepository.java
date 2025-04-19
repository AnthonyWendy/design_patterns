package solid.single_responsibility_principle.correct;

public class BookCRepository {

    public void saveBook(BookC book) {
        System.out.println("Save the book " + book.getTitle() + "in database...");
    }
}
