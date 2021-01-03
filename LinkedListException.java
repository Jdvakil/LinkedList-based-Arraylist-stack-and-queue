/**
 * This method is a special exception for the linkedlist.
 * @author Jay Darshan Vakil
 * @version 02/25/2020
 */
public class LinkedListException extends Exception{

    /**
     * The empty contructor for the class
     */
    public LinkedListException() {
        super();
    }

    /**
     * The second constructor, it outputs the message provided by the user.
     * @param message
     */
    public LinkedListException(String message){
        super(message);
    }
    
}