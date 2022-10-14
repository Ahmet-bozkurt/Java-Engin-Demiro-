class MilitaryCredit extends   BaseCreditManager implements CreditManager.ICreditManager {

    @Override
    public void Calculate() {
        System.out.println("Asker kredisi hesaplandı.");
    }
}