public class Payment {
    Pay pay;

    public void payBy(Pay pay){
        this.pay = pay;
    }

    public void payOut(){
        pay.pay();
    }
}
