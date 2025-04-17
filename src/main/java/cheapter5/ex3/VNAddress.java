package cheapter5.ex3;

public class VNAddress implements AddressValidator {

    @Override
    public boolean validateStreet(String street) {
        return street != null && !street.trim().isEmpty();
    }

    @Override
    public boolean validateCity(String city) {
        return city != null && city.matches("^[\\p{L} ]+$");
    }

    @Override
    public boolean validateZipCode(String zipCode) {
        return zipCode != null && zipCode.matches("^\\d{5}$");
    }

    @Override
    public boolean validateCountry(String country) {
        return country != null && country.equalsIgnoreCase("Vietnam");
    }
}

