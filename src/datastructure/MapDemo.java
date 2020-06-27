package datastructure;
/*
    What is Map : key value pair.
 */
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,Users> user = new HashMap<Integer, Users>();
        user.put(1, new Users("Velerie","1245","01/01/1990"));
        user.put(2, new Users("Poppy  ","1246","01/01/2000"));
        user.put(3, new Users("Ullah  ","1247","01/01/2005"));
        user.put(4, new Users("Haldar ","1248","01/01/2020"));

        for (Map.Entry<Integer,Users> usersEntry : user.entrySet()){
            System.out.println(usersEntry.getKey()+"  "+usersEntry.getValue().getUserName()+"  "+
                    usersEntry.getValue().getPassword()+"  "+usersEntry.getValue().getDob());
        }
        System.out.println("---------------------------------------------------------");


    }
}
