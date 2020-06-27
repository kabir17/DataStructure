package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    What is arrayList : To store dynamically size collection of elements.
                        ArrayList manage Array, increase by 10 sizes as needed.
                        In ArrayList no initialized like Arrays just need to add method.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        Two things store first then retrieve/get. List=class as interface, <Integer>=Class as
        int type, ArrayList=Class,()=default 10 sizes coz Array size so ArrayList increase by 10
        indexes as many as.
         */
        List<Integer> list = new ArrayList<>();
        list.add(14);  //storing index value dynamically by method, using add method.
        list.add(20);
        list.add(5);

        //Retrieve/getting index value by calling ArrayList as list, using get method.
        System.out.println(list.get(0));   // 0=index--14 as value
        System.out.println(list.get(2));   //2=index---5 as value

        //Storing by loop with the help of Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit index number : ");
        int limit= sc.nextInt();
        System.out.println("Enter index value : ");

        for(int i=0; i<limit; i++){
            list.add(sc.nextInt());       //nextInt = Scanner method
        }

        System.out.println("---------------------------------------");

        //Retrieve/get index value by using loop
        for (int j=0; j<limit; j++) {     //size = ArrayList method
            System.out.println(list.get(j));    //get = Scanner method
        }
            List<Users> usersList = new ArrayList<Users>();
            usersList.add(new Users("Hasnine", "123 ", "01/01/2013"));
            usersList.add(new Users("Rayn   ", "214 ", "01/01/2017"));
            usersList.add(new Users("Ayla   ", "1256", "01/01/2016"));

            //Retrieve data by for each loop(data type and reference variable as ArrayList)
            for (Users users : usersList) {
                System.out.println(users.getUserName() + " " + users.getPassword() + " " + users.getDob());
            }

        System.out.println("----------------------------------");

        List<Users> uList = new ArrayList<Users>();
        uList.add(new Users("Rayn   ","23254 ","01/02/2016"));
        uList.add(new Users("Hasnine","1235  ","01/03/2017"));
        uList.add(new Users("Ayla   ","021456","01/03/2015"));

        for(Users usr : uList) {
            System.out.println(usr.getUserName()+"      "+usr.getPassword()+"  "+usr.getDob());
        }

        System.out.println("-------------------------------------------------");

        List<Operators> oObj = new ArrayList<Operators>();
        oObj.add(new Operators("kajol  ",101,2000.00));
        oObj.add(new Operators("Manon  ",102,5000.00));
        oObj.add(new Operators("Rasel  ",103,2500.00));

        for(Operators opr : oObj){
            System.out.println(opr.getName()+" "+opr.getId()+"  "+opr.getSalary());
        }

        System.out.println("----------------------------------");

        List<Operators> obj = new ArrayList<Operators>();
        obj.add(new Operators("Awlad",001,1000.00));
        obj.add(new Operators("Munia",002,2000.00));

        for(Operators ops : obj){
            System.out.println(ops.getName()+"  "+ops.getId()+"  "+ops.getSalary());
        }
    }
}
