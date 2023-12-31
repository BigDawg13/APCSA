package LinearStructures;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
    private int size = 0;

    private Node<E> head, tail;

    public LinkedList() {

    }

    public LinkedList(E[] objects) {
        for(int i = 0; i < objects.length; i++) {
            // add(objects[i]);
        }
    }

    public void add(E e) {
        add(size, e);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public int indexOf(E e) {
        if(size == 0) return -1;

        int index = 0;
        Node<E> current = head;
        do {
            if(current.element == e) {
                return index;
            }
            current = current.next;
            index++;
        } while(current != null);
        
        return -1;
    }

    public int lastIndexOf(E e) {
        if(size == 0) return -1;
        int index = -1;
        Node<E> current = head;
        for(int i = 0; i < size; i++) {
            current = current.next;
            if(e == current) index = i; // Use .equals? Ask Clark
        }
        return index;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head; // head is like index 0 of linked list
        head = newNode;
        size++;

        if(tail == null) { // the list was empty
            tail = head; // head and tail are the same...
        }
    }
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if(tail == null) { // the list is empty
            head = tail = newNode; // the list has only one node, head and tail
        } else {
            tail.next = newNode; // we are moving the tail forward to the end
            tail = tail.next;
            size++;
        }
    }

    public void add(int index, E e) {
        if(index == 0) addFirst(e);
        else if(index >= size) addLast(e);
        else { // inserts in the middle
            Node<E> current = head;
            for(int i = 1; i < index; i++) {
                current = current.next; // advance the pointer
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public E getFirst() {
        if(size == 0) return null;
        return head.element;
    }

    public E getLast() {
        if(size == 0) return null;
        return tail.element;
    }

    public E removeFirst() {
        if(size == 0) return null;
        else {
            Node<E> temp = head; // save the head
            head = head.next; // move the head down the chain by one
            size--;
            if(head == null) tail = null; // we removed the only element, so the list is empty
            return temp.element; // return the origional head value
        }
    }

    public E removeLast() {
        if(size == 0) return null;
        else if(size == 1) {
            Node<E> temp = head;
            clear();
            return temp.element;
        } else {
            Node<E> current = head;

            for(int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            Node<E> temp = current.next;
            temp = null;
            current.next = (current.next).next;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if(size == 0) return null;
        else if(size == 1) {
            Node<E> temp = head;
            clear();
            return temp.element;
        } else {
            Node<E> current = head;
            for(int i = 1; i < index - 1; i++) {
                current = current.next; // advance the pointer
            }
            Node<E> temp = current.next;
            current.next = (current.next).next;
            size--;
            return temp.element;
        }
    }

    public E get(int index) {
        if(size == 0) return null;
        checkIndex(index);
        Node<E> current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public E set(int index, E e) {
        if(size == 0) addFirst(e);
        else if(index >= size) addLast(e);
        else {
            //checkIndex(index);
            Node<E> current = head;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
            current.element = e;
            return e;
        }
        return e;
    }

    public void clear() {
        size = 0;
        head = tail = null;
    }

    // why is this static?
    // find a better answer to this question
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

        public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return (current.next != null);
        }
        @Override
        public E next() {
            current = current.next;
            return current.next.element;
        }
        @Override
        public void remove() {
            LinkedList.this.remove(indexOf(current.element));
        }
    }
}
