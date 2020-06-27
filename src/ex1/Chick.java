package ex1;

public class Chick extends Chicken {

    public Chick(int price) {
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
