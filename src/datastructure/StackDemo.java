package datastructure;
/*
    What is Stack : First in last out and last in first out.It has two basic operations.push and pop.
                    push adds the element at the top of Stack and pop removes at the top of Stack.
                    Stack is interface.
 */
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("NY");   //push=add item.
        stack.push("NJ");
        stack.push("FL");

        System.out.println("Stack display : ");
        System.out.println(stack);

        System.out.println("---------");

        Stack<String> stack1 = new Stack<String>();
        stack1.push("NY");   //push=add item.
        stack1.push("VA");
        stack1.push("NJ");
        stack1.push("FL");

        System.out.println("Stack Push : ");
        Iterator it = stack1.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------");

        System.out.println("Stack pop : using while loop ");
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
        System.out.println("-----------------------------");

        Stack<String> stack2 = new Stack<String>();
        stack2.push("NY");   //push=add item.
        stack2.push("VA");
        stack2.push("NJ");
        stack2.push("FL");

        System.out.println("Stack peek : ");
        System.out.println(stack2.peek());

        System.out.println(stack2.push("CA"));

        System.out.println("------------------------");

        Stack<String> stack3 = new Stack<String>();
        stack3.push("NY");   //push=add item.
        stack3.push("VA");
        stack3.push("NJ");
        stack3.push("FL");

        System.out.println("Stack pop : Using for loop ");
        for(int i=0; i<4; i++) {
            System.out.println(stack3.pop());
        }
    }
}
