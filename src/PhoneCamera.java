public class PhoneCamera extends Phone{
    private int megapixels;

    public PhoneCamera(String model, String manufacturer, double price, int megapixels) {
        super(model, manufacturer, price);
        this.megapixels = megapixels;
    }

    public int getMegapixels() {
        return megapixels;
    }
}
