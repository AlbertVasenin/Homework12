package sky.pro.java;

public class Library {

  private Book[] books;

  public Library(int size) {
    books = new Book[size];

  }

  public boolean addBook(Book book) {
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        books[i] = book;
        return true;
      }
    }
    return false;
  }

  public void printBooks() {
    for (Book books : books) {
      if (books != null) {
        System.out.printf("%s %s: %s: %d \n", books.getAuthor().getName(),
            books.getAuthor().getLastName(), books.getNameBook(), books.getPublicationYear());
      }
    }
  }

  public void printFreePlaceInTheLibrary() {
    int count = 0;
    for (Book books : books) {
      if (books == null) {
        count++;
      }
    }
    System.out.printf("Свободных мест в библиотеке: %d", count);
  }

  public void printInfoAboutBook(String nameBook) {
    for (int i = 0; i < books.length; i++) {
      if (books[i] != null && books[i].getNameBook().equals(nameBook)) {
        System.out.printf("Книга: %s, которую написал %s %s, была опубликована в %d ",
            books[i].getNameBook(), books[i].getAuthor().getName(),
            books[i].getAuthor().getLastName(), books[i].getPublicationYear());
      }
    }
  }
  public void setYearPublication(String nameBook, int year){
    for (int i = 0; i < books.length; i++) {
      if(books[i]!= null && books[i].getNameBook().equals(nameBook)){
        books[i].setPublicationYear(year);
      }
    }
  }
}
