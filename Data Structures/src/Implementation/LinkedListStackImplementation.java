package Implementation;

import Exceptions.UnderflowException;
import Interfaces.Stack;

public class LinkedListStackImplementation<T> implements Stack<T>
{
    private int     length;
    private Node<T> head, tail;

    public LinkedListStackImplementation ()
    {
        setLength( -1 );
        setHead( getHead() );
        setTail( getTail() );
    }

    @Override
    public T pop () throws UnderflowException
    {
        if ( getLength() < 0 )
        {
            throw new UnderflowException( "Deleting when stack with no elements" );
        }

        T objectToReturn = getTail().getO();
        setTail( getTail().getPrev() );
        setLength( getLength() - 1 );
        getTail().setNext( null );

        return objectToReturn;
    }

    @Override
    public T peek ()
    {
        return getTail().getO();
    }

    @Override
    public T search (Object o)
    {
        return null;
    }

    @Override
    public boolean empty ()
    {
        setLength( -1 );
        setHead( null );
        setTail( null );
        return true;
    }

    @Override
    public void push (T o)
    {
        getTail().setNext( new Node<>( getTail(), null, o ) );
    }

    public int getLength ()
    {
        return length;
    }

    public void setLength (int length)
    {
        this.length = length;
    }

    public Node<T> getHead ()
    {
        if ( head == null )
        {
            head = tail = new Node<>();
        }
        return head;
    }

    public void setHead (Node<T> head)
    {
        this.head = head;
    }

    public Node<T> getTail ()
    {
        if ( tail == null )
        {
            head = tail = new Node<>();
        }
        return tail;
    }

    public void setTail (Node<T> tail)
    {
        this.tail = tail;
    }

    private class Node<T>
    {
        private Node prev;
        private Node next;
        private T    o;

        public Node ()
        {
            this.o = null;
            this.next = null;
            this.prev = null;
        }

        public Node (T o)
        {
            this.o = o;
            this.next = null;
            this.prev = null;
        }

        public Node (Node next, T o)
        {
            this.o = o;
            this.next = next;
            this.prev = null;
        }

        public Node (Node prev, Node next, T o)
        {
            this.o = o;
            this.prev = prev;
            this.next = next;
        }

        public Node getNext ()
        {
            return next;
        }

        public void setNext (Node next)
        {
            this.next = next;
        }

        public T getO ()
        {
            return o;
        }

        public void setO (T o)
        {
            this.o = o;
        }

        public Node getPrev ()
        {
            return prev;
        }

        public void setPrev (Node prev)
        {
            this.prev = prev;
        }
    }
}
