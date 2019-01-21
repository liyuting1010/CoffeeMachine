enum SmallCup{
    small, Small, SMALL, S, s
}
enum MediumCup{
    medium, Medium, MEDIUM, M, m
}
enum LargeCup{
    large, Large, LARGE, L, l
}

public enum CoffeeType{
    Latte1("Latte", "small", 8.00),
    Latte2("Latte", "medium", 13.00),
    Latte3("Latte", "large", 18.00),
    Espresso1("Espresso", "small", 10.00),
    Espresso2("Espresso", "medium", 15.00),
    Espresso3("Espresso", "large", 20.00),
    Cappuccino1("Cappuccino", "small", 10.00),
    Cappuccino2("Cappuccino", "medium", 15.00),
    Cappuccino3("Cappuccino", "large", 20.00),
    Flat_white1("Flat_white", "small", 12.50),
    Flat_white2("Flat_white", "medium", 17.50),
    Flat_white3("Flat_white", "large", 22.50),
    Americano1("Americano", "small", 8.00),
    Americano2("Americano", "medium", 12.50),
    Americano3("Americano", "large", 17.00);
    private String name;
    private String size;
    private double price;
    private CoffeeType(String name, String size, double price){
        this.name = name;
        this.size = size;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String getSize(){
        return this.size;
    }
    public double getPrice(){
        return this.price;
    }
}

