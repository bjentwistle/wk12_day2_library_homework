import com.codeclan.example.Book;
import com.codeclan.example.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private ArrayList<Book> stock;

    @Before
    public void setUp() {
        Book book = new Book("Persuasion", "Jane Austen", "Period Drama");
        Library library = new Library(1000, stock);
    }
    @Test
    public void bookHasTitle(){
        assertEquals("Persuasion", book.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("Jane Austen", book.getAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Period Drama", book.getGenre());
    }
    @Test
    public void libraryHasStock(){
        assertEquals(0, library.bookCount());
    }
}
