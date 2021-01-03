/**
 * The driver class for the list, stack, and the queue.
 * Instead of having multiple main methods in each class, i decided to have one class that ties all the test methods
 * in one to save time on testing each class individually.
 * 
 * @author Jay Darshan Vakil
 * @version 02/25/2020
 */
public class Driver {
    public static void main(String[] args) throws LinkedListException {
        testList();
        System.out.println("_______________");
        testStack();
        System.out.println("_______________");
        testQueue();
    }

    /**
     * The tester for list class
     * @throws LinkedListException
     */
    private static void testList() throws LinkedListException {
        List list = new List();
        System.out.println("List is empty: "+ list.isEmpty());
        for (int i = 0; i < 15; i++) {
            list.append(i+10);
            System.out.println(list);
        }
        System.out.println("List is empty: "+ list.isEmpty());
        System.out.println("Size of the list: " + list.size());
        System.out.println(list.remove(5) + " is removed.");
        System.out.println(list);
        System.out.println("Size of the list: " + list.size()); 
    }

    private static void testStack() throws LinkedListException {
        Stack stack = new Stack();
        System.out.println("stack is empty: "+ stack.isEmpty());
        for (int i = 0; i < 10; i++) {
            stack.push(i+20);
            System.out.println(stack);
        }
        System.out.println("stack is empty: "+ stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack.pop() + " is removed");
        System.out.println(stack);
        System.out.println("Size: " + stack.size());
        stack.push("BATMAN");
        System.out.println(stack);
        System.out.println("Size: " + stack.size());   
    }

    private static void testQueue() throws LinkedListException {
        Queue queue = new Queue();
        for (int i = 0; i < 13; i++) {
            queue.enqueue(i+22);
            System.out.println(queue);
        }
        System.out.println("queue is empty: "+ queue.isEmpty());
        System.out.println("Size: " + queue.size());
        System.out.println(queue.dequeue() + " is removed");
        System.out.println(queue);
        System.out.println("Size: " + queue.size());
        queue.enqueue("BATMAN");
        System.out.println(queue);
        System.out.println("Size: " + queue.size());   
    }
}