/**
 * This method implements the idea of a queue, FIFO (first in first out).
 * 
 * @author Jay Darshan Vakil
 * @version 02/25/2020
 */
public class Queue extends List{
    /**
     * This method adds a new element to the start of the queue
     * @param newData The data to add
     * @throws LinkedListException if newData is null
     */
    public void enqueue(Object newData) throws LinkedListException {
        if (newData!=null) {
            super.append(newData);
        }else{
            throw new LinkedListException("Data cannot be null");
        }
    }

    /**
     * This removes the last element in the list (The first element to be added)
     * @return The item dequeued
     * @throws LinkedListException
     */
    public Object dequeue() throws LinkedListException {
        return super.remove(0);
    }
    
    @Override
    /**
     * This method checks if the queue is empty or not.
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }
}