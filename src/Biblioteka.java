import java.awt.print.Book;
import java.util.ArrayList;

public class Biblioteka {
    static ArrayList<Book> list1 = new ArrayList<>();

    static ArrayList<Employee> list2 = new ArrayList<>();

    static ArrayList<Customer> list3 = new ArrayList<>();

    static ArrayList<Order> list4 = new ArrayList<>();


    public static void main(String[] args) {
        //__
        list1.add(new Book(1, "Book1", "Author1", 10, BookGenre.Horror));
        list1.add(new Book(2, "Book2", "Author2", 20, BookGenre.Comedia));
        list1.add(new Book(3, "Book3", "Author3", 30, BookGenre.History));
        list1.add(new Book(4, "Book4", "Author4", 40, BookGenre.Horror));
        list1.add(new Book(5, "Book5", "Author5", 50, BookGenre.Horror));
        list1.add(new Book(6, "Book6", "Author6", 60, BookGenre.Comedia));
        //__
        list2.add(new Employee(1, "Max", 25));
        list2.add(new Employee(1, "Alex", 29));
        //__
        list3.add(new Customer(1, "Thomas", 30));
        list3.add(new Customer(1, "Jhoshua", 19));
        list3.add(new Customer(1, "Julia", 45));
        list3.add(new Customer(1, "Dima", 18));
        //__
        list4.add(new Order(1,2,5));
        list4.add(new Order(2,1,2));
        list4.add(new Order(3,3,1));
        list4.add(new Order(4,1,4));
        //__
    }
}

