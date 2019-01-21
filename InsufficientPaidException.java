public class InsufficientPaidException extends Exception{
    public double expense;
    public InsufficientPaidException(double expense){
        this.expense = expense;
    }

    public double getExpense(){
        return expense;
    }
}
