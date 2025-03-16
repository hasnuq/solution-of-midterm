class LegacyCreditCardValidator {
    public boolean validate() {
        return Math.random() > 0.2;
    }
}
class CreditCardAdapter {
    private final LegacyCreditCardValidator validator = new LegacyCreditCardValidator();
    public boolean validateCard() {
        return validator.validate();
    }
}
