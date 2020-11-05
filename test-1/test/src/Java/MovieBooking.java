package Java;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Movies{
    public Movies(String name){
        this.name = name;
    }
    String name;
    String Actor;
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}



public class MovieBooking {
    public static void main(String[] args) {
        Map<Movies, String> map = new HashMap<>();
        map.put(new Movies("AGO1"),"First");
        map.put(new Movies("AGO2"),"Second");
        map.put(new Movies("AGO3"),"Third");
        System.out.println(17 & 15);
        System.out.println(map);
    }



}
