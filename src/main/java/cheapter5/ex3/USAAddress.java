package cheapter5.ex3;

public class USAAddress implements AddressValidator {

    @Override
    public boolean validateStreet(String street) {
        return street != null && !street.trim().isEmpty();
    }

    @Override
    public boolean validateCity(String city) {
        return city != null && city.matches("^[a-zA-Z ]+$");
    }

    @Override
    public boolean validateZipCode(String zipCode) {
        return zipCode != null && zipCode.matches("^\\d{5}(-\\d{4})?$");
    }

    @Override
    public boolean validateCountry(String country) {
        return country != null && country.equalsIgnoreCase("USA");
    }
}

