public class CoffeeDemo {
    public static void main(String[] args){
//        Customer c = new Customer("Latte", 10.00, "small", 9.00);
//        try{
//            c.setPay();
//            c.toDrink();
//        }catch(InsufficientPaidException e){
//            System.out.println("Sorry, but you are short " + e.getExpense());
//        }

        try{
            Customer c = new Customer("Latte", "small", 13.00);
            Coffee l = new Latte("small");
            l.toOrder();
            c.setPay(l.getPrice());
            c.toDrink();
        }catch(InsufficientPaidException e){
            System.out.println("Sorry, but you are short " + e.getExpense());
        }
    }
}
