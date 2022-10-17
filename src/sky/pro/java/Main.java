package sky.pro.java;

public class Main {

  public static void main(String[] args) {
    Author authorOne = new Author("Габриэль Гарсиа", "Маркес");
    Book bookOne = new Book("Сто лет одиночества", authorOne, 1967);
    Author authorTwo = new Author("Олдос", "Хаксли");
    Book bookTwo = new Book("О дивный новый мир", authorTwo, 1932);
    bookTwo.setPublicationYear(1948);
  }

}
