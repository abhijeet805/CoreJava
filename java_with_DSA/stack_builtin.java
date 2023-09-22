import java.util.*;
class Stack_11
{
    public static void main(String[] args) {
        
        Stack<Integer> s1=new Stack<Integer>();
        s1.push(22);
        s1.push(2222);
        s1.push(212);
        s1.push(122);
        System.out.println(s1);
        s1.pop();
        s1.pop();
        System.out.println(s1);

    }
}