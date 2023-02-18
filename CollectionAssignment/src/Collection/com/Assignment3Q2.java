package Collection.com;


		

import java.util.*;
public class Assignment3Q2 {
    private static   HashSet unordered(){
    	
        HashSet<Integer> hash = new HashSet<>();
        
        
            hash.add(2);
            hash.add(4);
            hash.add(5);
            hash.add(8);
            hash.add(1);
        
       return  hash;
    }
    private static  LinkedHashSet ordered(){
        LinkedHashSet<Integer> linkedhash  = new LinkedHashSet<>();
        
            linkedhash.add(2);
            linkedhash.add(4);
            linkedhash.add(5);
            linkedhash.add(8);
            linkedhash.add(1);
        
       return  linkedhash;
        

    }
    public static void main(String[] args){
    	System.out.println(unordered());
         System.out.println(ordered());
        
    }
    
}