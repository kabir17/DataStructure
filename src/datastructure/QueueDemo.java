package datastructure;
/*
    What is Queue : First in first out and last in last out.
                    Queue is a collection of ordered elements (Or objects),
                    but it performs insert and remove operations differently.
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("Ullah");
        queue.add("Velerie");
        queue.add("Poppy");
        queue.add("kabir");

        System.out.println("Queue display : ");
        for (String st : queue){
            System.out.println(st);
        }
    }
}
