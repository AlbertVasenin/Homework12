package sky.pro.java;

public class Main {

  public static void main(String[] args) {
    Author authorOne = new Author("Габриэль Гарсиа", "Маркес");
    Book bookOne = new Book("Сто лет одиночества", authorOne, 1967);
    Author authorTwo = new Author("Олдос", " Хаксли");
    Book bookTwo = new Book("О дивный новый мир", authorTwo, 1932);
    bookTwo.setPublicationYear(1948);
    System.out.println("======================================================================");
//    доп задача
    Author authorThree = new Author("Лев", "Николаевич Толстой");
    Book bookThree = new Book("Война и мир", authorThree, 1865);
    Author authorFour = new Author("Федор", "Михайлович Достоевский");
    Book bookFour = new Book("Братья Карамазовы", authorFour, 1880);
    Author authorFive = new Author("Федор", "Михайлович Достоевский");
    Book bookFive = new Book("Преступление и наказание", authorFive, 1866);
    Library library = new Library(6);
    library.addBook(bookOne);
    library.addBook(bookTwo);
    library.addBook(bookThree);
    library.addBook(bookFour);
    library.addBook(bookFive);
    library.printBooks();
    library.printFreePlaceInTheLibrary();
    System.out.println();
    library.printInfoAboutBook("Братья Карамазовы");
    System.out.println();
    library.setYearPublication("Братья Карамазовы", 1890);
    library.printInfoAboutBook("Братья Карамазовы");
    Author authorSix = new Author("Какой-то", "Автор");
    Book bookSix = new Book("Жили были", authorSix, 2022);
    System.out.println();
    System.out.println(bookSix);
    System.out.println(bookSix.hashCode());
    System.out.println(bookSix.equals(bookFive));
    System.out.println(authorFour.equals(authorFive));
  }
}
