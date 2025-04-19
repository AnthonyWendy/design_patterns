package solid.single_responsibility_principle.correct;

import solid.single_responsibility_principle.wrong.BookW;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("--SINGULAR RESPONSIBLE PRINCIPLE - CORRECT VERSION--");
        System.out.print("\n");

        // Wrong
        BookW bookW = new BookW("Atomic Habits", "James Clear", 320);
        bookW.save();
        System.out.print("\n");
        bookW.printBook();



    }
}
