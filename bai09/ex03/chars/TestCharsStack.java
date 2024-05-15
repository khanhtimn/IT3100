package bai09.ex03.chars;

public class TestCharsStack {
    public static void main(String[] args) {

        StackOfChars stack1 = new StackOfChars();
        System.out.println("Stack 1 được tạo với dung lượng là: [10] chars.");


        System.out.println("Push vào stack 1:");
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');

        System.out.println("Phần tử đầu stack 1: " + stack1.peak());

        System.out.println("Pop phần tử khỏi stack 1:");
        System.out.println(stack1.pop());
        System.out.println("Phần tử đầu stack 1: " + stack1.peak());


        System.out.println("Stack 1 rỗng?\n" + stack1.isEmpty());

        System.out.println("\n-----------------------\n");

        StackOfChars stack2 = new StackOfChars(5);
        System.out.println("Stack 2 được tạo với dung lượng là: [5] chars");

        System.out.println("Push vào stack 2:");
        stack2.push('x');
        stack2.push('y');
        stack2.push('z');

        System.out.println("Stack 2 đầy?\n" + stack2.isFull());

        System.out.println("Pop phần tử khỏi stack 2:");
        System.out.println(stack2.pop());

        System.out.println("Stack 2 rỗng?\n" + stack2.isEmpty());
    }
}

