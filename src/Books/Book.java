package Books;

import java.util.ArrayList;
import java.util.Scanner;
public class Book {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        //OVERLOADING ASSIGNMENT
        new Book("Game of Thrones", 200);

        while (true) {
            System.out.println("Enter the title of the book:");
            String titleInput = scanner.nextLine();
            if (titleInput.isBlank())
                break;
            System.out.println("Enter how many pages is it:");
            int pagesInput = scanner.nextInt();
            System.out.println("What year it was published?");
            int yearInput = scanner.nextInt();
            scanner.nextLine();

            list.add(new Book(titleInput, pagesInput, yearInput));
        }

        System.out.println("What information will be printed?");
        String infoInput = scanner.nextLine();
        if (infoInput.equals("everything")) {
            for (Book book : list) {
                System.out.println(book.title + ", " + book.numPages + " pages, " + book.pubYear);
            }
        } else if (infoInput.equals("name")) {
            for (Book book : list) {
                System.out.println("Title name: " + book.title);
            }

        }

    }

    String title;
    int numPages;
    int pubYear;

    public Book(String title, int numPages, int pubYear) {
        this.title = title;
        this.numPages = numPages;
        this.pubYear = pubYear;
    }
    //OVERLOADING ASSIGNMENT
    public Book(String title, int numPages) {
        this.title = title;
        this.numPages = 100;
    }
}

