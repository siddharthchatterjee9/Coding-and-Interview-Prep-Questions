package charStackInJava;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.lang.Character;

// Stack => LIFO => push, pop and peek operations
// Java has a built-in API named java.util.Stack.
// Since char is a primitive datatype, which cannot be used in generics,
// we have to use the wrapper class of java.lang.Character to create a Stack:

public class Main {
    //Stack<Character> charStack = new Stack<>();
    public static void main (String[] args) {
        CharStackUsingLinkedList obj = new CharStackUsingLinkedList();
        obj.push('a');
        System.out.println(obj.peek());
        obj.push('b');
        obj.push('d');
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        obj.push('c');
        System.out.println(obj.peek());

    }
}

// Custom implementation using LinkedList
class CharStackUsingLinkedList {
    private LinkedList<Character> items;
    public CharStackUsingLinkedList() {
        this.items = new LinkedList<Character>();
    }
    public void push(Character item) {
        items.push(item);
    }
    public Character peek() {
        return items.getFirst();
    }
    public Character pop() {
        // For pop, we first used an Iterator to check if there's an item on the top or not.
        Iterator<Character> iter = items.iterator();
        Character item = iter.next();
        if (item != null) {
            iter.remove();
            return item;
        }
        return null;
    }
}

// Custom implementation using Array
class CharStackUsingArray {
    private char[] elements;
    private int size;

    public CharStackUsingArray() {
        size = 0;
        elements = new char[4];
    }
    public void push(char item) {

    }
    private void ensureCapacity(int newSize) {
        char newBiggerArray[];
        if (elements.length < newSize) {
            newBiggerArray = new char[elements.length * 2];
            System.arraycopy(elements, 0, newBiggerArray, 0, size);
            elements = newBiggerArray;
        }
    }
    public char peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[size-1];
    }
    public char pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }
}