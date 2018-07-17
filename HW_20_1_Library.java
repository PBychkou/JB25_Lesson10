public class HW_20_1_Library {

    public static void main(String[] args) {

        HW_20_1_Actions books = new HW_20_1_Actions();

        HW_20_1_Book book1 = new HW_20_1_Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1967, 150);
        books.add(book1);
        HW_20_1_Book book2 = new HW_20_1_Book("The Lord of the Rings", "J. R. R. Tolkien", 1949, 200);
        books.add(book2);
        HW_20_1_Book book3 = new HW_20_1_Book("Paradise Lost", "John Milton", 1674, 100);
        books.add(book3);

        System.out.println("Search by Author name ( = J. R. R. Tolkien)");
        books.findByAuthor("J. R. R. Tolkien");
        System.out.println(" ");
        books.printTable1("J. R. R. Tolkien");
        System.out.println(" ");

        System.out.println("Search by Title ( = Paradise Lost)");
        books.findByTitle("Paradise Lost");
        System.out.println(" ");
        books.printTable2("Paradise Lost");
        System.out.println(" ");

        System.out.println("Search by Year ( = 1967)");
        books.findByYear(1967);
        System.out.println(" ");
        books.printTable3(1967);
        System.out.println(" ");

        books.delete(book2);
        System.out.println("Results are:");
        books.printTable4();
    }
}