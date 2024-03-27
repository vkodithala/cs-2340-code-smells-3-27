public class PercentageDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscountedPrice(double price, double discountAmount) {
        return price - (discountAmount * price);
    }
}
