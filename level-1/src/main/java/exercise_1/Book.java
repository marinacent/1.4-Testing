package exercise_1;

import java.util.Objects;

public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return getTitle().equalsIgnoreCase(book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTitle().toLowerCase());
    }
}
