/**
 * This is the linked list class, it has a subclass called node which represents
 * a node in a linkedlist theory.
 *
 * For this class, i got inspiration from this website: https://www.geeksforgeeks.org/data-structures/linked-list/
 * and https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
 * 
 * 
 * @author Jay Darshan Vakil
 * @version 2/25/2020
 * 
 */
public class List {
    /**
     * The subclass Node which represents a node in a linked list.
     * 
     * @author Jay Darshan Vakil
     * @version 02/25/2020
     */
    private class Node {
        private Object data;//data to hold
        private Node next;//link to next node

        /**
         * Constructor for the Node class, it takes in the next data and the next node it is pointing to.
         * 
         * @param newData The new data to be set
         * @param nextNode The next node to point to 
         */
        private Node(Object newData, Node nextNode) throws LinkedListException {
            this.setData(newData);
            this.next = nextNode;
        }

        /**
         * This is the constructor when only the data is known and not the next node.
         * @param newData the new data to set
         * @throws LinkedListException 
         */
        private Node(Object newData) throws LinkedListException {
            this.setData(newData);
            this.next = null;
        }

        /**
         * The setter for the data, it checks if the data is not null.
         * @param newData the data to set 
         * @throws LinkedListException If newData is null
         */
        private void setData(Object newData) throws LinkedListException {
            if (newData != null) {
                this.data = newData;
            } else {
                throw new LinkedListException("data cannot be null...");
            }
        }
    }

    private Node head;//the head of the linked list

    /**
     * This method inserts a new element at the given index moving the other elements to the right.
     * @param newData The new data to insert
     * @param index The index at which the data to insert
     * @throws LinkedListException if the data is null or the index is out of range.
     */
    public void insert(Object newData, int index) throws LinkedListException {
        if (this.isEmpty()) {
            this.head = new Node(newData);
        } else if (this.size() == 1) {
            head.next = new Node(newData);
        } else if (this.size() > 1 && index < this.size()) {
            Node newNode = head;
            for (int i = 0; i < index; i++) {
                newNode = newNode.next;
            }
            Node n = new Node(newData);
            n.next = newNode.next;
            newNode.next = n;
        } if(newData == null || index <0 || index > this.size()){
            throw new LinkedListException("Index cannot be out of range...");
        }
    }

    /**
     * This method removes the element at the given index. checks if the given index is not out of range.
     * @param index index at which the element is to be removed
     * @return The element removed
     * @throws LinkedListException if the index is out of range
     */
    public Object remove(int index) throws LinkedListException {
        Object retVal = null;
        Node node = head;
        if (index == 0) {
            Node temp = head;
            head = head.next;
            retVal = temp.data;
        }
        if (index > 0 && index < this.size()) {
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node temp = node.next;
            node.next = node.next.next;
            retVal = temp.data;
        }
        if (index < 0 || index > this.size()) {
            throw new LinkedListException("Index cannot be out of range...");
        }
        return retVal;
    }

    /**
     * This method appends an object data to the end of the list. checks if newData is not null
     * @param newData The new data to be appended
     * @throws LinkedListException if newData is null
     */
    public void append(Object newData) throws LinkedListException {
        if (newData != null) {
            if (this.isEmpty()) {
                this.head = new Node(newData);
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(newData);
            }
        } else {
            throw new LinkedListException("New data cannot be null...");
        }
    }

    /**
     * This method behaves like remove but it doesnt return a value, it just deletes the element. Checks if index is in range.
     * @param index The index at which the element is to be removed.
     * @throws LinkedListException if the index is out of range.
     */
    public void delete(int index) throws LinkedListException {
        Node node = head;
        if (index == 0) {
            Node temp = head;
            temp = head.next;
        }
        if (index > 0 && index <= this.size()) {
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        } else {
            throw new LinkedListException("Index cannot be out of range...");
        }
    }

    /**
     * Returns the size of the linked list.
     * @return the size of the list
     */
    public int size() {
        int size = 0;
        Node node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    /**
     * This is the toString method,it outputs the class into a string form.
     * @return The list
     */
    @Override
    public String toString() {
        String retVal = "[ ";
        Node node = head;
        while (node != null) {
            retVal += node.data + " ";
            node = node.next;
        }
        retVal += "]";
        return retVal;

    }

    /**
     * This method returns if the list is empty or not. 
     * @return true or false
     */
    public boolean isEmpty() {
        boolean retVal = false;
        if (head == null) {
            retVal = true;
        }
        return retVal;
    }

    /**
     * This method returns the index value of a given Object, returns -1 if object not found.
     * @param newData object to find and return its index
     * @return index or -1
     */
    public int indexOf(Object newData) {
        int index = -1, count = 0;
        Node node = head;
        while (node != null) {
            if ((node.data.equals(newData))) {
                index = count;
                break;
            }
            count++;
            node = node.next;
        }
        return index;
    }

    /**
     * This method takes in another object/list and checks if they are equal or not.
     */
    @Override
    public boolean equals(Object other) {
        boolean retVal = false;
        if (other != null) {
            List list = (List) other;
            if (this.size() == list.size()) {
                if (this.toString().equals(list.toString())) {
                    retVal = true;
                }
            }
        }
        return retVal;
    }
}