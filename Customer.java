public class Customer{
    private String coffeeName;
    private String coffeeSize;
    private double expense;

    public Customer(String coffeeName, String coffeeSize, double expense){
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
        this.expense = expense;
    }

    public void setPay(double coffeePrice) throws InsufficientPaidException{
        if(expense >= coffeePrice){
            double changes = expense - coffeePrice;
            System.out.println("Give you a change of " + changes + " dollars.");
        }
        else {
            double needs = coffeePrice - expense;
            throw new InsufficientPaidException(needs);
        }
    }

    public void toDrink(){
        System.out.println("There is your " + coffeeSize + " cup of " + coffeeName + ".");
    }

    public double getExpense(){
        return expense;
    }
}
