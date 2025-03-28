public class Author
{
    //attributes
    private String name;
    private String email;
    private String nationality;

    /**
     * This is the constructor for a author
     */
    public Author(String name, String email, String nationality)
    {
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }    

/**
 * This is the overriden toString method
 */
@Override
public String toString()
{
    return "Author: " + name + ", Email: " + email + ", Nationality: " + nationality;
}

/**
 *This is a getter for the author's information 
 * @return - the name of the author
 */
    public String getAuthor()
    {
        return name;
    }

/**
 * This is a getter for the email
 * @return- the email of the author
 */
    public String getEmail()
    {
        return email;
    }

/**
 * This is a getter for nationality
 * @return- the nationality of the author
 */
    public String getNationality()
    {
        return nationality;
    }
}