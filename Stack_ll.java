import java.util.Scanner;

public class Stack_ll {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public static void search(int num){
            Node temp = head;
            int index = 1;
            while(temp != null){
                if(temp.data == num){
                    System.out.println(" The number " + num + " found at " + index + " index");
                    return;
                }
                temp = temp.next;
                index++;
            }
            System.out.println(" The number " + num + " not found ");
        }
        public static void display(){
            if(isEmpty()){
                System.out.println(" Stack is empty ");
                return;
            }
            Node temp = head;
            System.out.println(" Stack :");
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

    }
    public static void main(String[] args) {
        stack s = new stack();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println(" Enter the value to push ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    int popped = s.pop();
                    if(popped != -1){
                        System.out.println(" Popped the element " + popped);
                        break;
                    }
                case 3:
                    int top = s.peek();
                    if(top != -1){
                        System.out.println(" The top element is " + top);
                        break;
                    }
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println(" Enter the element to search ");
                    int elem = sc.nextInt();
                    s.search(elem);
                    break;
                case 6:
                    System.out.println(" Exiting....");
                    break;
                default:
                    System.out.println(" Invalid choice, try again ");
            }


        }            while (choice !=6);

    }


}



