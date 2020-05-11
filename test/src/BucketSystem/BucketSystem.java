package BucketSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vishnu.jangid on 11/05/2020 AD .
 */

class Bucket {
    Map<String, String> bData;
    Bucket parent;
    
    
    public void add(String key, String value) {
        if(this.bData==null){
            Map<String, String> data= new HashMap<>();
            data.put(key, value);
            bData= data;
        }else {
            this.bData.put(key, value);
        }
    }
    
    
    public boolean update(String key, String value) {
        if(bData==null){
            return false;
        }else {
            if (bData.get(key)!=null)
            bData.put(key, value);
            return true;
        }
    }
    
    
    public void delete(String key) {
        if(bData!=null){
      bData.remove(key);
        }
    }
    
    public String get(String key) {
        return this.parent == null ? this.bData.get(key) : this.parent.bData.get(key) == null ? this.bData.get(key) : this.parent.bData.get(key);
    }
    public void addParent(Bucket pb) {
        if (pb != null) {
            pb.parent = null;
            this.parent = pb;
        }
    }
    
    public void display() {
        if (bData != null) {
            System.out.println(this.bData);
        }
    }
}

public class BucketSystem {
    
    Bucket bucket;
    Map<String, Bucket> bucketMap;
    
    
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
    
    public void createBucket(String key) {
        if(this.bucketMap==null){
            Map<String, Bucket> newBucket = new HashMap<String,Bucket>();
            newBucket.put(key, new Bucket());
            bucketMap =newBucket;
        }else {
            this.bucketMap.put(key, new Bucket());
        }
    }
    
    public Bucket getBucket(String key) {
        return bucketMap.get(key);
    }
}