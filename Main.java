public class Main 
{
    public static void main(String [] args)
    {
        Author myAuthor = new Author("J.K. Rowling ", "jk.rowling@example.com", "British");
        Book book = new Book("Harry Potter and the Philosophor's Stone", 19.99, myAuthor);
        System.out.println(book);
    }

}