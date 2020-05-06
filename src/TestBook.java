import Book.Book;
import Book.FictionBook;
import Book.ProgrammingBook;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {

        ProgrammingBook pb1 = new ProgrammingBook("bc01", "Code Complete 2", 250000.0, "Steve McConnell", "Java", "Spring MVC");
        ProgrammingBook pb2 = new ProgrammingBook("bc02", "Yellow book", 110000.0, "Rob Miles", "C#", ".Net");
        ProgrammingBook pb3 = new ProgrammingBook("bc03", "Peopleware ", 350000.0, "Tom DeMarco ", "Java", "Spring MVC");
        ProgrammingBook pb4 = new ProgrammingBook("bc04", "Programming Pearls", 260000.0, "Jon Bentley", "Java", "Spring MVC");
        ProgrammingBook pb5 = new ProgrammingBook("bc05", "Core HTML5 Canvas", 180000.0, "Steve McConnell", "HTML", "Browser");
//        System.out.println(pb1);

        FictionBook fb1 = new FictionBook("The Selfish Gene", 250000.0, "Science book");
        FictionBook fb2 = new FictionBook("Origin of species", 350000.0, "Natural science books");
        FictionBook fb3 = new FictionBook("Guns germs and steel", 280000.0, "Human history book");
        FictionBook fb4 = new FictionBook("The grand design", 360000.0, "Cosmic science book");
        FictionBook fb5 = new FictionBook("Cosmos", 1890000.0, "cosmic book");
//        System.out.println(fb1);

        Book[] books = {pb1, pb2, pb3, pb4, pb5, fb1, fb2, fb3, fb4, fb5};
        //Tổng tiền
        totalPrice(books);

        //Đếm sách ProgrammingBook
        ProgrammingBook[] programmingBooks = {pb1, pb2, pb3, pb4, pb5};
        countBooks(programmingBooks);

        //gọi hàm tìm kiếm tuần tự
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of book: ");
        String nameOfBook = scanner.nextLine();
        System.out.println(sequentialSearch(books, nameOfBook));

        //Nổi bọt
        bubbleSort(books);
    }

    //Tính tổng tiền
    public static void totalPrice(Book[] books) {
        double price = 0;
        for (int i = 0; i < books.length; i++) {
            price += books[i].getPrice();
        }
        System.out.println("The total money of ten books is: " + price);
    }

    //Đếm số cuốn sánh ngôn ngữ Java
    public static void countBooks(ProgrammingBook[] programmingBooks) {
        double count = 0;
        for (int i = 0; i < programmingBooks.length; i++) {
            if (programmingBooks[i].getLanguage().equals("Java")) {
                count++;
            }
        }
        System.out.println("There are " + count + " books named Java");
    }

    //Tìm kiếm giá theo tìm kiếm tuần tự
    public static double sequentialSearch(Book[] books, String nameOfBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(nameOfBook)) {
                return books[i].getPrice();
            }
        }
        return -1;
    }

    //Nổi bọt, so sánh 2 phần tử một
    public static void bubbleSort(Book[] books) {
        boolean check = false;
        for (int i = 0; i < books.length - 1; i++) {
            check = false;
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j].getPrice() > books[j + 1].getPrice()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                    check = true;
                }
            }
            if (!check) {
                break;
            }
        }
    }

    //Sắp xếp chọn: tìm phần tử bé nhất đổi chỗ cho phần tử ở đầu mảng chưa được sx
    public static void selectionSort() {
    }

    //Sắp xếp chèn: duyệt từng phần tử và chèn từng phần tử đó vào đúng vị trí trong mảng con
    public static void insertionSort() {
    }

    //Tìm kiếm nhị phân
//    public static double binarySearch(Book[] books, String nameOfBook) {
//        int mid =
//        for (int i = 0; i < books.length; i++) {
//            if (books[(books.length - 1) / 2].getName() == nameOfBook) {
//                return books[(books.length - 1) / 2].getPrice();
//            } else if (books[(books.length - 1) / 2] <)
//        }
//        return -1;
//    }
}
