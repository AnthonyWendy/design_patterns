package solid.single_responsibility_principle.wrong;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("--SINGULAR RESPONSIBLE PRINCIPLE - WRONG VERSION--");
        System.out.print("\n");

        // Wrong
        BookW bookW = new BookW("Atomic Habits", "James Clear", 320);
        bookW.save();
        System.out.print("\n");
        bookW.printBook();

    }
}
