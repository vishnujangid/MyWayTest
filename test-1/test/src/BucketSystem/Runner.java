package BucketSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vishnu.jangid on 11/05/2020 AD .
 */


public class Runner {
    public static void main(String[] args) {
        
        BucketSystem BucketS = new BucketSystem();

        BucketS.createBucket("A");
        Bucket bs = BucketS.getBucket("A");

        bs.add("key0", "value0");
        bs.update("key0", "value1");
        bs.delete("key");
        bs.get("key");
//        BucketSystem bs = new BucketSystem();
        //adding key in bucket
        bs.add("key0", "value0");
        bs.add("key1", "value1");
        bs.display();
        BucketS.createBucket("B");
        Bucket B= BucketS.getBucket("B");
        B.add("Pkey","pvalue");
       // adding Parent
        
        bs.addParent(B);
        
        System.out.println("Same Key in Parent or chile with key key1: "+bs.get("key1"));
        System.out.println("Same Key in Parent or chile with key pkey: "+bs.get("pkey"));
    
        System.out.println("Update start ... ");
        System.out.println("Update key2 : "+bs.update("key2", "value2"));
        bs.display();
        System.out.println("Update key1 : "+bs.update("key1", "value3"));
        bs.display();
        bs.delete("key0");
        bs.display();
        
    }
}
