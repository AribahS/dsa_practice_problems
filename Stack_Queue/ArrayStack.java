package Stack_Queue;
import java.util.*;
/*
Problem Statement: Implement a Last-In-First-Out (LIFO) stack using an array. 
The implemented stack should support the following operations: push, pop, peek, and isEmpty.
*/
class ArrayStack {
    static int[] stack = new int[100];
    static int top=-1;
    static int n=stack.length-1;

    static void push(int x){
        if(top==n){
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top]=x;
    }

    static int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int x=stack[top];
        top--;
        return x;
    }

    static int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    static boolean isEmpty(){
        return top==-1;
    }

    static void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int ch;

    do {
        System.out.println("\n----User Menu----");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. isEmpty");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();

        switch (ch) {
        case 1:
            System.out.print("Enter element to push: ");
            int x=sc.nextInt();
            push(x);
            break;
        case 2:
                System.out.println("Popped element: " + pop());
                break;

            case 3:
                System.out.println("Top element: " + peek());
                break;

            case 4:
                System.out.print("Stack: ");
                display();
                break;

            case 5:
                System.out.println(isEmpty());
                break;
            
             case 6:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid Choice");
        }

    } while (ch != 6);

    sc.close();
    }
}

