package objectClass.com;

//TreeSet provides an implementation of the Set interface that uses a tree for storage. 
//Objects are stored in a sorted and ascending order.


import java.util.*;  
class treeSet{  
 public static void main(String args[]){  
 TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(6);  
         set.add(1);  
         set.add(3);  
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
         
         System.out.println("Lowest Value: "+set.pollFirst());    
         System.out.println("Highest Value: "+set.pollLast());    
           
 }  
}  
