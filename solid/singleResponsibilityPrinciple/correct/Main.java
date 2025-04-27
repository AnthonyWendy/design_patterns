package solid.singleResponsibilityPrinciple.correct;

import solid.singleResponsibilityPrinciple.wrong.Book;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("--SINGULAR RESPONSIBLE PRINCIPLE - CORRECT VERSION--");
        System.out.print("\n");

        // Wrong
        Book book = new Book("Atomic Habits", "James Clear", 320);
        book.save();
        System.out.print("\n");
        book.printBook();



    }
}
