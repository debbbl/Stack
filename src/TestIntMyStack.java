import java.util.Scanner;
import java.util.Stack;

public class TestIntMyStack {
    public static void main(String[] args){
        MyStack<Integer> IntegerStack=new MyStack<>();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int temp=sc.nextInt();
        sc.nextLine();
        IntegerStack.push(temp);

        String hold="";
        System.out.print("Would u like to continue? y for yes, n for no");
        hold=sc.nextLine();
        while(hold.equals("y")) {
            System.out.print("Enter an integer value: ");
            temp=sc.nextInt();
            sc.nextLine();
            IntegerStack.push(temp);
            System.out.println("Would u like to continue? y for yes, n for no");
            hold=sc.nextLine();

        }
        System.out.println("Size of the stack: "+IntegerStack.getSize());
        int sum=findSum(IntegerStack);
        System.out.println("The sum of this stack is: "+sum);
        while (!IntegerStack.isEmpty()) {
            System.out.println(IntegerStack.pop());
        }

        MyStack<String> Q4stack=new MyStack<>();
        Q4stack.push("A");
        Q4stack.push("L");
        Q4stack.push("L");
        Q4stack.push("A");
        boolean holdd=Q4stack.isPalindrome(Q4stack);
        System.out.println(holdd);
    }

    //Q3
    public static int findSum(MyStack<Integer> stack){
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }

}
