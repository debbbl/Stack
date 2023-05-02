import java.util.ArrayList;
public class MyStack <E>{
    private ArrayList<E> list=new ArrayList<E>();
    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    public void push(E e){
        list.add(e);
    }

    public E pop(){
        E o=list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;

    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "stack: "+list.toString();
    }

    public boolean search(E o){
        return list.contains(o);
    }

    //Q3
    public static int sum(MyStack<Integer> stack){
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }

    //Q4
    public static boolean isPalindrome(MyStack<String> stack){
        String reverse="";
        while(!stack.isEmpty())
            reverse+=stack.pop();

        String forward="";
        for(int i=0;i<reverse.length();i++){
            char hold=reverse.charAt(i);
            forward+=hold;
        }
        return forward.equals(reverse);
    }

    //Q5
    
}
