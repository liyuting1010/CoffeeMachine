public class Customer{
    private String[] coffeeName;
    private String[] coffeeSize;
    private double expense;

    public Customer(String[] coffeeName, String[] coffeeSize, double expense){
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
        this.expense = expense;
    }

    public void setPay(double[] coffeePrice) throws InsufficientPaidException{
        double totalPrice = 0.00;
        for(int i = 0; i < coffeePrice.length; i ++){
            totalPrice += coffeePrice[i];
        }
        if(expense >= totalPrice){
            double changes = expense - totalPrice;
            System.out.println("Give you a change of " + changes + " dollars.");
        }
        else {
            double needs = totalPrice - expense;
            throw new InsufficientPaidException(needs);
        }
    }

    public void toDrink(){
        int i = 0;
        for(String name : coffeeName){
            System.out.println("There is your " + coffeeSize[i] + " cup of " + coffeeName[i] + ".");
            i ++;
        }
    }

    public double getExpense(){
        return expense;
    }
    public String[] getNameList(){
        return coffeeName;
    }
    public String[] getSizeList(){
        return coffeeSize;
    }

    //throw exception
    //public double[] getPriceList()
}
