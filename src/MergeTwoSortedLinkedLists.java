class ListNode{
    int data;
    Node next;
    ListNode(int data){
        this.data = data;
        next = null;
    }
}

public class MergeTwoSortedLinkedLists {
    Node head = null;
    public static Node Merge(Node a,Node b){
        if(a == null){
            return b;

        }
        if(b == null){
            return a;
        }
        Node res = null;
        if(a.data <= b.data){
            res = a;
            res.next = Merge(a.next,b);

        }
        else{
            res = b;
            res.next = Merge(a,b.next);
        }
        return res;
    }

    void Insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void Print(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        MergeTwoSortedLinkedLists List1 = new MergeTwoSortedLinkedLists();
        MergeTwoSortedLinkedLists List2 = new MergeTwoSortedLinkedLists();
        List1.Insert(4);
        List1.Insert(3);
        List1.Insert(1);

        List2.Insert(6);
        List2.Insert(5);
        List2.Insert(2);

        System.out.println("The lists before sorting were :");
        List1.Print(List1.head);
        
        List2.Print(List2.head);
        MergeTwoSortedLinkedLists result = new MergeTwoSortedLinkedLists();

        result.head = Merge(List1.head,List2.head);

        System.out.println("The lists after sorting are :");
        result.Print(result.head);
        
        
    }


}
/*
The lists before sorting were :
1 3 4
2 5 6
The lists after sorting are :
1 2 3 4 5 6
*/