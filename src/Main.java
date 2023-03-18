import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Book> Books = new ArrayList<>();
    static List<Employee> Employees = new ArrayList<>();
    static List<Customer> Customers = new ArrayList<>();
    static List<Order> Orders = new ArrayList<>();

    public static void main(String[] args) {

    }
    public static void initData() {
        Books.add(new Book(1, "Book1", "Author1", 349, BookGenre.Horror));
        Books.add(new Book(2, "Book2", "Author2", 79, BookGenre.Comedia));
        Books.add(new Book(3, "Book3", "Author3", 549, BookGenre.Horror));
        Books.add(new Book(4, "Book4", "Author4", 179, BookGenre.Horror));
        Books.add(new Book(5, "Book5", "Author5", 299, BookGenre.History));
        //__
        Employees.add(new Employee(1, "Max", 25));
        Employees.add(new Employee(1, "Alex", 29));
        //__
        Customers.add(new Customer(1, "Thomas", 30));
        Customers.add(new Customer(1, "Jhoshua", 19));
        Customers.add(new Customer(1, "Julia", 45));
        Customers.add(new Customer(1, "Dima", 18));
        //__
        Orders.add(new Order(1,2,5, new long[]{4}));
        Orders.add(new Order(2,1,2, new long[]{2}));
        Orders.add(new Order(3,3,1, new long[]{7}));
        Orders.add(new Order(4,1,4, new long[]{8}));
    }
    public static Book getBookById(long id){
        Book current = null;

        for(Book book : Books){
            if(book.getId() == id){
                current = book;
                break;
            }
        }
        return current;
    }

}