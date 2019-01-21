public class Coffee {
    private String name;
    private double price;
    private String size;

    public Coffee(String name){
        this.name = name;
        this.size = "small";
    }

    public Coffee(String name, String size){
        this.name = name;
        this.size = size;
        this.price = setPrice(name, size);
    }

    public Coffee(String name, double price, String size){
        this.name = name;
        this.price = price;
        this.size = size;
    }

    //throw exception
    public double setPrice(String name, String size){
        double price = 0.00;
        for(CoffeeType coffeeType : CoffeeType.values()){
            if(coffeeType.getName().equals(name) && coffeeType.getSize().equals(size)){
                return coffeeType.getPrice();
            }
        }
        return price;
    }

    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getSize(){
        return this.size;
    }

    public void toOrder(){
        System.out.println("A " + this.size + " cup of " + this.name + ", " + this.price + " dollars.");
    }
}
