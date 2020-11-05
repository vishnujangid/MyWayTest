package BucketSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vishnu.jangid on 11/05/2020 AD .
 */

public class TempBSystem {
    class Bucket {
        Map<String, String> bData;
        Bucket parent;
        
    }
    
    public class BucketSystem {
        
        Bucket bucket;
        
        
        public void add(String key, String value) {
            if (bucket == null) {
                Bucket newBucket = new Bucket();
                if (key != null) {
                    Map<String, String> map = new HashMap<>();
                    map.put(key, value);
                    newBucket.bData = map;
                    bucket = newBucket;
                }
            } else {
                
                Map<String, String> map = bucket.bData;
                map.put(key, value);
            }
        }
        
        public void display() {
            if (bucket != null) {
                System.out.println(bucket.bData);
            }
        }
        
        public void addParent(Bucket pb) {
            if (pb != null) {
                pb.parent = null;
                bucket.parent = pb;
            }
        }
        
        
        public String get(String key) {
            if (bucket != null && key != null) {
                //key is not present in chile bucket and return null
//          return bucket.bData.get(key) == null ? null : bucket.parent == null ? bucket.bData.get(key) : bucket.parent.bData.get(key) == null ? bucket.bData.get(key) : bucket.parent.bData.get(key);
                
                return bucket.parent == null ? bucket.bData.get(key) : bucket.parent.bData.get(key) == null ? bucket.bData.get(key) : bucket.parent.bData.get(key);
            
            
            }
            return null;
            
        }
        
        public boolean update(String key, String value) {
            if (key != null && bucket != null) {
                Map<String, String> map = bucket.bData;
                //check if already exist or not /// if exist then update otherwise make it new
                if (map.get(key) != null) {
                    map.put(key, value);
                    return true;
                }
            }
            return false;
        }
        
        public void delete(String key) {
            if (key != null && bucket != null) {
                Map<String, String> map = bucket.bData;
                //check if already exist or not /// if exist then update otherwise make it new
                map.remove(key);
            }
        }
    }
    
}
