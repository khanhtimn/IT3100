package bai09.ex03.integers;

public class StackOfIntegers {
    private final int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[10];
        this.size = 0;
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public int peak() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack rỗng");
        }
        return elements[size - 1];
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack đầy");
        }
        elements[size++] = value;
        System.out.println("Đã push: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack rỗng");
        }
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}

