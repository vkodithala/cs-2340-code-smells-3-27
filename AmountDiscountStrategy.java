public class AmountDiscountStrategy implements DiscountStrategy {
    public double calculateDiscountedPrice(double price, double discountAmount) {
        return price - discountAmount;
    }
}
