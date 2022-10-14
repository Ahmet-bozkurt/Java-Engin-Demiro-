public abstract class BaseCreditManager implements CreditManager.ICreditManager {

    public abstract void Calculate();

    public void Save() {
        System.out.println("Kaydedildi.");
    }
}
