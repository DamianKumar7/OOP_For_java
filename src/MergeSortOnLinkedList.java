import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class MergeSortOnLinkedList{
    Node head = null;
    public Node SplitSubroutine(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node mid = slow.next;
        slow.next = null;

        Node LeftSorted = SplitSubroutine(head);
        Node RightSorted = SplitSubroutine(mid);

        return MergeSubroutine(LeftSorted,RightSorted);
    }

    public Node MergeSubroutine(Node a,Node b){
        if(a == null)return b;
        
        if(b == null)return a;

        Node res = null;
        if(a.data <= b.data){
            res = a;
            res.next = MergeSubroutine(a.next, b);
        }
        if(a.data > b.data){
            res = b;
            res.next = MergeSubroutine(a, b.next);
        }
        return res;
    }

    void push(int new_data)
    {
        
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }
    void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args)
    {
 
        MergeSortOnLinkedList li = new MergeSortOnLinkedList();
        Scanner sc = new Scanner(System.in);
        while(true){
            int choice ;
            System.out.println("Welcome!!!!Do You want to Continue?0 For No And  1 For Yes");
            choice = sc.nextInt();
            if(choice != 1){
                break;
            }
            else{
                System.out.println("Enter the data");
                int data = sc.nextInt();
                li.push(data);
            }
        }
        
        // li.push(15);
        // li.push(10);
        // li.push(5);
        // li.push(20);
        // li.push(3);
        // li.push(2);
 
        System.out.println("Enter the Linked List before sorting was:");
        li.printList(li.head);
        li.head = li.SplitSubroutine(li.head);
        System.out.print("\n Sorted Linked List is: \n");
        li.printList(li.head);
    }
}
/* Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
-19
Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
8
Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
-13
Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
2
Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
-5
Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
4
Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
100
Do You want to Continue?0 For No And  1 For Yes
1
Enter the data
30
Do You want to Continue?0 For No And  1 For Yes
0
Enter the Linked List before sorting was:
30 100 4 -5 2 -13 8 -19
 Sorted Linked List is:
-19 -13 -5 2 4 8 30 100
*/