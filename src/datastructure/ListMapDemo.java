package datastructure;
/*
    What is listMap : Map has two values (a key and value), while a List only has one value (an element).
 */
import java.util.*;

public class ListMapDemo {
    public static void main(String[] args) {

        //List has only one value by using add method
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("New York");
        cityOfUSA.add("New Jersey");
        cityOfUSA.add("Virginia ");
        cityOfUSA.add("Florida");

        List<String> cityOfBanglades = new ArrayList<String>();
        cityOfBanglades.add("Dhaka ");
        cityOfBanglades.add("Chittagong");
        cityOfBanglades.add("Comilla ");
        cityOfBanglades.add("Sylhet");

        List<String> cityOfIndia = new ArrayList<String>();
        cityOfIndia.add("New Delhi");
        cityOfIndia.add("Calcatta ");
        cityOfIndia.add("Mumbai ");
        cityOfIndia.add("Hydrabad ");

        //Map has two values key and value by using put method.
        Map<String,List<String>> cities = new LinkedHashMap<String, List<String>>();
        cities.put("USA       ",cityOfUSA);
        cities.put("Bangladesh",cityOfBanglades);
        cities.put("India     ",cityOfIndia);

        //using for..each loop
        for (Map.Entry<String,List<String>> city : cities.entrySet()){
            System.out.println(city.getKey()+"   "+city.getValue());
        }
        System.out.println("-------------------------------------------------");

        List<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Berry");
        fruits.add("Banana");
        fruits.add("Lichi");

        List<String> vegetables = new ArrayList<String>();
        vegetables.add("Broccoli");
        vegetables.add("Tomato");
        vegetables.add("Spinach");
        vegetables.add("Okra");

        List<String> fish = new ArrayList<String>();
        fish.add("Salmon");
        fish.add("Talapia");
        fish.add("Tuna");
        fish.add("Pompino");

        Map<String,List<String>> eat = new LinkedHashMap<String,List<String>>();
        eat.put("Fruits    ",fruits);
        eat.put("Fish      ",fish);
        eat.put("Vegetables",vegetables);

        for (Map.Entry<String,List<String>> eats : eat.entrySet()){
            System.out.println(eats.getKey()+" "+eats.getValue());
        }

        System.out.println("----------------------------------------------------");

        List<String> ullah = new ArrayList<String>();
        ullah.add("Ullah");
        ullah.add("  101");
        ullah.add(" 85000.00");
        ullah.add(" 01/01/2000");

        List<String> velerie = new ArrayList<String>();
        velerie.add("Velerie");
        velerie.add("102");
        velerie.add(" 80000.00");
        velerie.add(" 01/01/2001");

        List<String> poppy = new ArrayList<String>();
        poppy.add("Poppy");
        poppy.add("  103");
        poppy.add(" 75000.00");
        poppy.add(" 70000.00");

        Map<String,List<String>> persons = new LinkedHashMap<String, List<String>>();
        persons.put("Student1",ullah);
        persons.put("Student2",velerie);
        persons.put("Student3",poppy);

        for (Map.Entry<String,List<String>> folks : persons.entrySet()){
            System.out.println(folks.getKey()+"   "+folks.getValue());
        }
        System.out.println("------------------------------------------------------------");

        List<Integer> person1 = new ArrayList<Integer>();
        person1.add(101);
        person1.add(45);
        person1.add(01/01/1975);
        person1.add(90000);

        List<Integer> person2 = new ArrayList<Integer>();
        person2.add(102);
        person2.add(50);
        person2.add(01/01/1970);
        person2.add(80000);

        List<Integer> person3 = new ArrayList<Integer>();
        person3.add(103);
        person3.add(55);
        person3.add(01/01/1985);
        person3.add(70000);

        Map<String,List<Integer>> person = new LinkedHashMap<String, List<Integer>>();
        person.put("Ullah  ",person1);
        person.put("Velerie",person2);
        person.put("Poppy  ",person3);

        for(Map.Entry<String,List<Integer>> ppl : person.entrySet()){
            System.out.println(ppl.getKey()+"  "+ppl.getValue());
        }
    }
}
