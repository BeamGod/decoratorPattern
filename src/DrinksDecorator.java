public abstract class DrinksDecorator implements  Drinks{

    Drinks drinks;

    public DrinksDecorator(Drinks drinks){
        this.drinks = drinks;
    }

    @Override
    public void show() {
        drinks.show();
    }
}
