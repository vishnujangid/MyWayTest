package Java;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.WeakHashMap;

/**
 * Created by Vishnu.jangid on 03/04/2020 AD .
 */

class MySingleToneClass {
    
    private static MySingleToneClass mySingleToneClass = new MySingleToneClass();
    
    
    private MySingleToneClass() {
    
    }
    
    public static MySingleToneClass getInstance() {
        return mySingleToneClass;
    }
}

interface Country{
    String getCurrency();
}

class India implements Country{
    
    @Override
    public String getCurrency() {
        return "INR";
    }
}

class USA implements Country{
    
    @Override
    public String getCurrency() {
        return "USD";
    }
}

class CurrencyFactory{
    
    public static Country getCountryByName( String cName){
        if (cName.equals("india"))
            return new India();
        else if (cName.equals("usa"))
            return new USA();
        else return new India();// as Defult
    }
    
    
}





public class SingleTonClass {
    int i =0;
    public static void main(String[] args) {
       // MySingleToneClass mySingleToneClass= MySingleToneClass.getInstance();
        
        //[1,4,6,4,1,5]
    
        Country country = CurrencyFactory.getCountryByName("usa");
        System.out.println(country.getCurrency());
        String s= null;
//        System.out.println(i);
//        WeakHashMap
//        Hashtable
//        Integer
//        ArrayList
    }
    
    
}
