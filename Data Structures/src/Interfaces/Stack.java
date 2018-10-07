package Interfaces;

import Exceptions.NoSuchObjectException;
import Exceptions.OverflowException;
import Exceptions.UnderflowException;


public interface Stack<T> {

    /**
     * Returns the object before deleting it off the stack
     * @return T
     * @throws UnderflowException
     */
    public T pop() throws UnderflowException;

    /**
     * Returns the object at the top of the stack.
     * @return T
     */
    public T peek();

    /**
     * Returns the location where the object exists
     * @param o
     * @return T
     * @throws NoSuchObjectException
     */

    public T search(Object o) throws NoSuchObjectException;

    /**
     * Deletes all objects of the stacks
     * @return
     */

    public boolean empty();

    /**
     * Adds object to stack
     * @param o
     * @return
     * @throws OverflowException
     */

    public void push(T o) throws OverflowException;
}
