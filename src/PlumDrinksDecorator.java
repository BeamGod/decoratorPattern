public class PlumDrinksDecorator extends  DrinksDecorator{

    public PlumDrinksDecorator(Drinks drinks){
        super(drinks);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("with plum");
    }
}
