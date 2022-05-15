package op;
public class book
{
    private String bookName;
    private float bookPrice;
    private String authorName;
    
    public void setBookName(String bookName)
    {
        this.bookName=bookName;
    }
    
    public String getBookName()
    {
        return this.bookName;
    }
    
    public void setBookPrice(float bookPrice)
    {
        this.bookPrice=bookPrice;
    }
    
    public float getBookPrice()
    {
        return this.bookPrice;
    }
    
    public void setAuthorName(String authorName)
    {
        this.authorName=authorName;
    }
   
    
    public String getAuthorName()
    {
        return this.authorName;
    }
    public  float discount(float price)
    {
    	float discount=price-(25*price)/100;
    	return discount;
    }
}