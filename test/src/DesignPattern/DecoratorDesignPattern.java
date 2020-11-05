package DesignPattern;
interface Dress{
    void assemble();
}
class BasicDress implements Dress{
    @Override
    public void assemble() {
        System.out.println("Basic Dress");
    }
}
class DressDecorator implements Dress{
    protected Dress dress;
    public DressDecorator(Dress dress){
        this.dress = dress;
    }

    @Override
    public void assemble() {
    this.dress.assemble();
    }
}

class FancyDress extends DressDecorator{
    public FancyDress(Dress dress){
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Fancy Dress");
    }
}

class CasualDress extends DressDecorator{
    public CasualDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Casual Dress");
    }
}


public class DecoratorDesignPattern {
    public static void main(String[] args) {
        Dress dress = new CasualDress(new FancyDress(new BasicDress()));
        dress.assemble();
    }
}
