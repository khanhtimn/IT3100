package bai09.ex03.chars;

public class StackOfChars {
    private final char[] elements;
    private int size;

    public StackOfChars() {
        this.elements = new char[10];
        this.size = 0;
    }

    public StackOfChars(int capacity) {
        this.elements = new char[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public char peak() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack rỗng");
        }
        return elements[size - 1];
    }

    public void push(char value) {
        if (isFull()) {
            throw new IllegalStateException("Stack đầy");
        }
        elements[size++] = value;
        System.out.println("Đã push: " + value);
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack rỗng");
        }
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}

