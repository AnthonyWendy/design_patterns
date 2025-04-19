package solid.single_responsibility_principle.correct;

public class BookCService {

    public void printBook(BookC book) {

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Number of pages: " + book.getNumberPages());

    }

}
