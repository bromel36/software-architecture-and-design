package chapter5.ex3;

public interface AddressValidator {
    boolean validateStreet(String street);
    boolean validateCity(String city);
    boolean validateZipCode(String zipCode);
    boolean validateCountry(String country);
}
