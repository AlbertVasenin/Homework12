package sky.pro.java;

public class Main {

  private static Book[] books;

  public static void main(String[] args) {
    Author authorOne = new Author("Габриэль Гарсиа", "Маркес");
    Book bookOne = new Book("Сто лет одиночества", authorOne, 1967);
    Author authorTwo = new Author("Олдос", " Хаксли");
    Book bookTwo = new Book("О дивный новый мир", authorTwo, 1932);
    bookTwo.setPublicationYear(1948);
    System.out.println("======================================================================");
    books = new Book[6];
    addBook(bookOne);
    addBook(bookTwo);
//  =================================================================================
    Author authorThree = new Author("Лев", "Николаевич Толстой");
    Book bookThree = new Book("Война и мир", authorThree, 1865);
    Author authorFour = new Author("Федор", "Михайлович Достоевский");
    Book bookFour = new Book("Братья Карамазовы", authorFour, 1880);
    Author authorFive = new Author("Федор", "Михайлович Достоевский");
    Book bookFive = new Book("Преступление и наказание", authorFive, 1866);
    addBook(bookThree);
    addBook(bookFour);
    addBook(bookFive);
    printBooks();
  }

  public static boolean addBook(Book book) {
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        books[i] = book;
        return true;
      }
    }
    return false;
  }

  public static void printBooks() {
    for (Book books : books) {
      if (books != null) {
        System.out.printf("%s %s: %s: %d \n", books.getAuthor().getName(),
            books.getAuthor().getLastName(), books.getNameBook(), books.getPublicationYear());
      }
    }
  }
}
