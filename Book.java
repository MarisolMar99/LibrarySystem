public class Book
{
    //attributes
    private String title;
    private double price;
    private Author author;


    /**
     * parameterized constructor
     * @param title - constructing a book with a title
     */
    public Book(String title, double price, Author author)
    {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public double getPrice()
    {
        return price;
    }

    /**
     * This returns the book title
     * @return -the book title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * This is the overriden toString method
     */
    @Override
    public String toString()
    {
        return "Book: " + getTitle() + ", Price: $" + getPrice() + "\n" + author.toString();
    }
    
}