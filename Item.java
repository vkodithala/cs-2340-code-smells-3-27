class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;
    private boolean isGiftCard;
    private DiscountStrategy discountStrategy;

    public Item(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean isGiftCard) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountType = discountType;
        if (discountType == DiscountType.AMOUNT) {
            discountStrategy = new AmountDiscountStrategy();
        } else if (discountType == DiscountType.PERCENTAGE) {
            discountStrategy = new PercentageDiscountStrategy();
        } else {
            discountStrategy = new DefaultDiscountStrategy();
        }
        this.discountAmount = discountAmount;
        this.isGiftCard = isGiftCard;
    }

    public boolean isGiftCard() {
        return isGiftCard;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public double getFinalPrice() {
        return discountStrategy.calculateDiscountedPrice(price, discountAmount);
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}
