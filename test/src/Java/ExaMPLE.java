package Java;

/**
 * Created by Vishnu.jangid on 09/04/2020 AD .
 */


public class ExaMPLE {
    B b = new B();
//    C c= b.process(new C());
    B<C> b2= new B<C>();
    C c1= b2.process(new C());
}
interface A{
   int count();
    void show();
}
class B < T extends A>{
    T process(T t){
        t.count();
        t.show();
        return t;
    }
}
class C implements A{
    public int count(){return 25;}
    public void show(){
        System.out.println("CBHJSJG");
        new Exception("");
    }
}

@FunctionalInterface
interface FI{
    void show();
    default void m1(){}
}