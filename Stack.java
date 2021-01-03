/**
 * This method represents a stack, uses the idea of lifo (last in first out).
 * 
 * @author Jay Darshan
 * @version 02/25/2020
 */
public class Stack extends List{

    /**
     * This method pushes a new element to the top of the stack or the first element of the list.
     * @param newData The object to push
     * @throws LinkedListException if newData is null
     */
    public void push(Object newData) throws LinkedListException {
        if (newData != null) {
            super.insert(newData,0);
        }else{
            throw new LinkedListException("New Data cannot be null");
        }
    }

    /**
     * This pops the first element of the stack and returns it.
     * @return the first elemnt
     * @throws LinkedListException 
     */
    public Object pop() throws LinkedListException {
        return super.remove(super.size()-1);
    }
    
    @Override
    /**
     * This checks if the stack is empty or not.
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }
}