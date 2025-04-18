package chapter5.ex3;

public class MainApp {
    public static void main(String[] args) {
        AddressValidator usaValidator = new USAAddress();
        AddressValidator vnValidator = new VNAddress();

        System.out.println("=== USA Address Validation ===");
        System.out.println("Street: " + usaValidator.validateStreet("123 Main St"));
        System.out.println("City: " + usaValidator.validateCity("New York"));
        System.out.println("Zip: " + usaValidator.validateZipCode("10001"));
        System.out.println("Country: " + usaValidator.validateCountry("USA"));

        System.out.println("\n=== VN Address Validation ===");
        System.out.println("Street: " + vnValidator.validateStreet("12 Nguyễn Huệ"));
        System.out.println("City: " + vnValidator.validateCity("TP Hồ Chí Minh"));
        System.out.println("Zip: " + vnValidator.validateZipCode("70000"));
        System.out.println("Country: " + vnValidator.validateCountry("Vietnam"));
    }
}

