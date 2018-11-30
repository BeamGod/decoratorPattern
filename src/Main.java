public class Main {

    public static void main(String[] args) {

        Drinks drinks = new CocaCola();
        drinks = new LemonDrinksDecorator(drinks);
        drinks = new PlumDrinksDecorator(drinks);
        drinks.show();

    }
}
