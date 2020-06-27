package ex1;

public class Main {

    public static void main(String[] args) {
        Chicken hen = new Hen(3);
        Chicken cock = new Cock(5);
        Chicken chick = new Chick(1);
        int countLimited = 100;
        int priceLimited = 100;
        for (int i = 0; i <= countLimited; i++) {
            for (int j = 0; j <= countLimited; j++) {
                if (i + j > countLimited) {
                    break;
                }
                for (int k = 0; k <= countLimited; k++) {
                    int count = i + j + k * 3;
                    int price = i * cock.getPrice() + j * hen.getPrice() + k * chick.getPrice();
                    if (count > countLimited || price > priceLimited) {
                        break;
                    }
                    if (price == priceLimited && count == countLimited) {
                        System.out.printf("cock: %s, hen: %s, chickens: %s.\n", i, j, k);
                    }
                }
            }
        }
    }

}
