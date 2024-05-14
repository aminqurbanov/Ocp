public class Main {
    public static void main(String[] args) {
        Phone basicPhone = new Phone("a30","Samsung",325.44);
        System.out.println("Basic phone: " + basicPhone.getModel() + ", Price: $" + basicPhone.getPrice());

        PhoneCamera cameraPhone = new PhoneCamera("iPhone 14", "Apple", 999.85, 8);
        System.out.println("Camera phone: " + cameraPhone.getModel() + ", Price: $" + cameraPhone.getPrice() + ", Megapixels: " + cameraPhone.getMegapixels());
    }
}

