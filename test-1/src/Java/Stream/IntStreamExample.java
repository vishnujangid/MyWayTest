package Java.Stream;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
      //  IntStream.range(1,10).forEach(System.out::print); // 1
      //IntStream.of(1,2,5,7,8,9).filter(value -> value>2).forEach(System.out::print);
//        IntStream.range(1,50).filter(e->e%2==0).forEach(value -> System.out.print("Even "+value));
//        IntStream.builder(IntStream.range(1,10)).build().forEach(System.out::print);
//        System.out.println(new Date(System.currentTimeMillis()));
    
//        final String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
//        final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
//        final DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT);
//
//
//        // convert date to localdatetime
//        LocalDateTime today =  LocalDateTime.now();     //Today
//        LocalDateTime tomorrow = today.plusDays(7);     //Plus 7 day
//        LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day
//
//        System.out.println(today);          //2018-07-14
//        System.out.println(tomorrow);       //2018-07-15
//        System.out.println(yesterday);
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
    
        //x++;
        Predicate<Integer>  even= e->e%2==0;
        Predicate<Integer>  g10= e->!(e%2==0);
        System.out.println(numbersList.stream().distinct().collect(Collectors.toList()));
        
    
    
//        Date currentDate = new Date();
//        System.out.println(currentDate);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(currentDate);
//        calendar.add(Calendar.MINUTE,-20);
//        Date windowStartingTime = calendar.getTime();
//        System.out.println(windowStartingTime);
//        calendar.add(Calendar.MINUTE, -10);
//        System.out.println(calendar.getTime());
//        List<String > strList= new ArrayList<>();
//        strList.add("A");
//        strList.add("B");
//        strList.add("C");
//        strList.add("D");
//        strList.add("E");
//
//        List<String> listb= new ArrayList<>();
//            listb.add("A");
//            listb.add("M");
//            listb.add("B");
//
//        System.out.println(strList.stream().filter(aElement ->
//             !listb.stream().anyMatch(e->e.equals(aElement))
//        ).collect(Collectors.toList()));
        
        
    }
}
