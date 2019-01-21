public abstract class Coffee {
    private String name;
    private double price;
    private String size;

    public Coffee(String name, String size){
        this.name = name;
        this.size = size;
    }

    public Coffee(String name, double price, String size){
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public abstract void toOrder();
    public abstract double getPrice();
}
