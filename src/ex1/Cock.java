package ex1;

public class Cock extends Chicken {

    public Cock(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }
}
