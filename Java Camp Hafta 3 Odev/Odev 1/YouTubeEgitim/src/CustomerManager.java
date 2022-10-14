public class CustomerManager {

    private Customer _customer;
    private CreditManager.ICreditManager _creditManager;
    public CustomerManager(Customer customer, CreditManager.ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }
    public void Save() {
        //System.out.println("Müşteri kaydedildi: " + _customer.Firstname);
    }

    public void Delete(){
        // System.out.println("Müşteri silindi: "+ _customer.Firstname);
    }

    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi verildi.");
    }
}
