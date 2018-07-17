import java.util.ArrayList;
import java.util.List;

public class HW_20_1_Actions {

    private HW_20_1_Book book;
    private List<HW_20_1_Book> books = new ArrayList<HW_20_1_Book>();

    public List<HW_20_1_Book> getBooks() {
        return books;
    }

    public void add(HW_20_1_Book book) {
        books.add(book);
    }

    public boolean delete(HW_20_1_Book book) {
        return books.remove(book);
    }

    public void findByAuthor(String author) {
        for (HW_20_1_Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    public void findByTitle(String title) {
        for (HW_20_1_Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
            }
        }
    }

    public void findByYear(int year) {
        for (HW_20_1_Book book : books) {
            if (book.getYear() == year) {
                System.out.println(book);
            }
        }
    }

    public void printTable1(String author) {
        for (HW_20_1_Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " $" + book.getPrice());
            }
        }
    }

    public void printTable2(String title) {
        for (HW_20_1_Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " $" + book.getPrice());
            }
        }
    }

    public void printTable3(int year) {
        for (HW_20_1_Book book : books) {
            if (book.getYear() == year) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " $" + book.getPrice());
            }
        }
    }

    public void printTable4() {
        for (HW_20_1_Book book : books) {
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " $" + book.getPrice());
        }
    }
}