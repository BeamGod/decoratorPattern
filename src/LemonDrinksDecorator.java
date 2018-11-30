public class LemonDrinksDecorator extends  DrinksDecorator{

    public LemonDrinksDecorator(Drinks drinks){
        super(drinks);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("with Lemon");
    }
}
