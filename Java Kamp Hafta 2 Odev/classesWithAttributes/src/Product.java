public class Product {

    public Product(int id, String name, String description,double price,int stockAmount,String color){
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
        this.color = color;

    }

    public Product(){}

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int _id){
        this.id=_id;

    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String _description) {
        this.description = _description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double _price) {
        this.price = _price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int _stockAmount) {
        this.stockAmount = _stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String _color) {
        this.color = _color;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }
}
