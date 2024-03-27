public class DefaultDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscountedPrice(double price, double discountAmount) {
        return price;
    }
}
