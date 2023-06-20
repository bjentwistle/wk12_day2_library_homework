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
    public void before() {
        book = new Book("Persuasion", "Jane Austen", "Period Drama");
        library = new Library(1000, stock);
        library.add(book);
        library.add(book);
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
        assertEquals(2, library.bookCount());
    }
    @Test
    public void libraryHasCapacity(){
        assertEquals(true, library.getCapacity(book));
        assertEquals(3, library.bookCount()); //book is added to library
    }
}
