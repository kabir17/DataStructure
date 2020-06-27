package datastructure;
/*
    What is LinkedList : Linked List are linear/graphical data structures.
                         Every element is a separate object.
                         Each element is known as a node in Java.
                         LinkedList class implements the list interface.

    Why use :   If we have insertion and deletion a lot,LinkedList is better then ArrayList.
                LinkedList takes more memory than ArrayList.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("NY");
        list.add("CA");
        list.add("NJ");
        list.add("VA");

        //Only one index output
        System.out.println(list.get(2)+"  "+list.get(0)+"  "+list.get(3)+"  "+list.get(1));

        System.out.println("-------------------------------");

        //using Iterator
        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------------");

        //using for..each loop
        for(String st : list){
            System.out.println(st);
        }
    }
}
