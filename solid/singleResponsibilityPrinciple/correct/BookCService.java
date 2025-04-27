package solid.singleResponsibilityPrinciple.correct;

public class BookCService {

    public void printBook(Book book) {

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Number of pages: " + book.getNumberPages());

    }

}
