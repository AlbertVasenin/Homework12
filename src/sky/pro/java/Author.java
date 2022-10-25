package sky.pro.java;

public class Author {

  final private String name;
  final private String lastName;

  public Author(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return name + " " + lastName;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, lastName);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Author a = (Author) obj;
    return (name.equals(a.name) && lastName.equals(a.lastName));
  }
}

