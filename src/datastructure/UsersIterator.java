package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
    What is Iterator : To traverse/go a collection object elements one by one.It is an interface.
                       Iterator following the index order value from 0 to size.
 */
public class UsersIterator {
    public static void main(String[] args) {


        //Store numbers into the list using ArrayList by calling interface List.
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        //Iterator = type as interface, list.listIterator= reference variable as ArrayList.
        Iterator it = list.listIterator();  // store list with help of Iterator
        while (it.hasNext()){       //hasNext = boolean method in Iterator (is list there?).
            System.out.println(it.next());   //next= object method in Iterator get element of list.
        }

        System.out.println("----------------------------------");

        List<String> listObj = new ArrayList<String>();
        listObj.add("Banana");
        listObj.add("Apple");
        listObj.add("Grape");
        listObj.add("Berry");

        Iterator it1 = listObj.listIterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println("------------------------------------");

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(60);
        list2.add(50);
        list2.add(40);

        Iterator it2 = list2.listIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("---------------------------------------");

        List<Users> uList = new ArrayList<Users>();
        uList.add(new Users("Rayn   ","23254 ","01/02/2016"));
        uList.add(new Users("Hasnine","1235  ","01/03/2017"));
        uList.add(new Users("Ayla   ","021456","01/03/2015"));

        for(Users usr : uList) {
            System.out.println(usr.getUserName()+"      "+usr.getPassword()+"  "+usr.getDob());
        }

        System.out.println("--------------------------------------");

        List<String> listObj1 = new ArrayList<String>();
        listObj1.add("Salmon");
        listObj1.add("Whitefish");
        listObj1.add("Tuna");
        listObj1.add("Talapia");
        listObj1.add("Shrimp");

        Iterator it3 = listObj1.listIterator();
        while (it3.hasNext()){
            System.out.println(it3.next());
        }

        System.out.println("-------------------------------");

        List<Double> dList = new ArrayList<Double>();
        dList.add(100.00);
        dList.add(200.00);
        dList.add(300.00);

        Iterator dIt = dList.listIterator();
        while (dIt.hasNext()){
            System.out.println(dIt.next());
        }

        System.out.println("-----------------------------------");

        List<Character> cList = new ArrayList<Character>();
        cList.add('A');
        cList.add('B');
        cList.add('C');

        Iterator cIt = cList.listIterator();
        while (cIt.hasNext()){
            System.out.println(cIt.next());
        }

        System.out.println("--------------------------------------");

        List<Boolean> bList = new ArrayList<Boolean>();
        bList.add(true);
        bList.add(false);
        bList.add(true);
        bList.add(false);

        Iterator bIt = bList.listIterator();
        while (bIt.hasNext()){
            System.out.println(bIt.next());
        }

        System.out.println("--------------------------");

        List<String> sList = new ArrayList<String>();
        sList.add("USA");
        sList.add("UK");
        sList.add("BD");
        sList.add("India");

        //Using Iterator but also We can use for..each loop.
        Iterator sIt = sList.listIterator();
        while (sIt.hasNext()) {
            System.out.println(sIt.next());
        }
       /* for..each loop :
       for(String str : sList){
            System.out.println(str);
       }*/
    }
}
