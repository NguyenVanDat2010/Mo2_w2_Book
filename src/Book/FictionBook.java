package Book;

public class FictionBook extends Book{
    private String category;

    public FictionBook(){}

    public FictionBook(String category) {
        this.category = category;
    }
    public FictionBook(String name,double price,String category){
        super(name, price);
        this.category=category;
    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return "A book, There are name: "+super.getName()+", Price: "+super.getPrice()+" and Category: "+getCategory();
    }
}
