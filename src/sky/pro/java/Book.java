package sky.pro.java;

public class Book {

  private String nameBook;
  private Author author;
  private int publicationYear;

  public Book(String nameBook, Author author, int publicationYear) {
    this.nameBook = nameBook;
    this.author = author;
    this.publicationYear = publicationYear;
  }

  public String getNameBook() {
    return nameBook;
  }

  public Author getAuthor() {
    return author;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  @Override
  public String toString() {
    return nameBook + ": " + author + " " + publicationYear;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(nameBook, author, publicationYear);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Book b = (Book) obj;
    return (nameBook.equals(b.nameBook) && author.equals(
        b.author) && publicationYear == b.publicationYear);
  }
}


