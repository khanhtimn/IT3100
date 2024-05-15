package bai09.ex03.integers;


public class TestIntegersStack {
    public static void main(String[] args) {

        StackOfIntegers stack1 = new StackOfIntegers();
        System.out.println("Stack 1 được tạo với dung lượng là: [10] ints.");


        System.out.println("Push vào stack 1:");
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        System.out.println("Phần tử đầu stack 1: " + stack1.peak());

        System.out.println("Pop phần tử khỏi stack 1:");
        System.out.println(stack1.pop());
        System.out.println("Phần tử đầu stack 1: " + stack1.peak());


        System.out.println("Stack 1 rỗng?\n" + stack1.isEmpty());

        System.out.println("\n-----------------------\n");

        StackOfIntegers stack2 = new StackOfIntegers(5);
        System.out.println("Stack 2 được tạo với dung lượng là: [5] ints");

        System.out.println("Push vào stack 2:");
        stack2.push(6);
        stack2.push(9);
        stack2.push(69);

        System.out.println("Stack 2 đầy?\n" + stack2.isFull());

        System.out.println("Pop phần tử khỏi stack 2:");
        System.out.println(stack2.pop());

        System.out.println("Stack 2 rỗng?\n" + stack2.isEmpty());
    }
}


