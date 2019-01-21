import java.util.Random;

public class CoffeeDemo {
    public static void main(String[] args){
//        Customer c = new Customer("Latte", 10.00, "small", 9.00);
//        try{
//            c.setPay();
//            c.toDrink();
//        }catch(InsufficientPaidException e){
//            System.out.println("Sorry, but you are short " + e.getExpense());
//        }
        Random rand = new Random();
        int counts = rand.nextInt(10);
        try{
            String[] coffeeList = new String[counts];
            String[] sizeList = new String[counts];
            double[] priceList = new double[counts];
            for(int i = 0; i < counts; i ++){
                int ordinal = rand.nextInt(CoffeeType.values().length);
                coffeeList[i] = CoffeeType.values()[ordinal].getName();
                sizeList[i] = CoffeeType.values()[ordinal].getSize();
                priceList[i] = CoffeeType.values()[ordinal].getPrice();
            }
            Customer customer = new Customer(coffeeList, sizeList, 200.00);
            customer.setPay(priceList);

            int j = 0;
            System.out.println("Your Order:\n ****");
            for(String caffeeName : coffeeList){
                Coffee coffee = new Coffee(caffeeName, sizeList[j]);
                coffee.toOrder();
                j ++;
            }
            System.out.println("******");

            customer.toDrink();

        }catch(InsufficientPaidException e){
            System.out.println("Sorry, but you are short " + e.getExpense());
        }
    }
}
