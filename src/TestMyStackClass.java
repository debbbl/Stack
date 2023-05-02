import java.util.Stack;

public class TestMyStackClass{
    public static void main(String[] args) {
        MyStack<Character> stack1=new MyStack<>();
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        System.out.println(stack1.toString());
        System.out.println("Checking if element 'b' is in the stack: "+stack1.search('b'));
        System.out.println("Checking if element 'k' is in the stack: "+stack1.search('k'));

        MyStack<Integer> stack2=new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.toString());
        System.out.println("Checking if the element '6' is in the stack: "+stack2.search(6));

    }
}