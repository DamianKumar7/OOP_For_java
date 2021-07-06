import java.util.*;


class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        next = null;
    }
}
//ClassName referenec = new Constructor();

class LinkedListImplementation{
    ListNode head = null;

    void addNodeAtBegin(int data){
        ListNode newNode = new ListNode(data);

        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    void InsertAtEnd(int data){
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    int deleteAtEnd(){
        ListNode temp = head;
        while(temp.next.next!= null){
            temp =temp.next;
        }
        int i = temp.next.data;
        temp.next = null;
        return i;
    }
    int deleteAtBegin(){
        int ans = head.data;
        head = head.next;
        return ans;

    }

    void PrintList(){
       
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListImplementation ob = new LinkedListImplementation();
        // ob.addNodeAtBegin(1);
        // ob.addNodeAtBegin(2);
        // ob.addNodeAtBegin(3);
        // ob.addNodeAtBegin(4);
        // ob.addNodeAtBegin(5);
        ob.InsertAtEnd(1);
        ob.InsertAtEnd(2);
        ob.InsertAtEnd(3);
        ob.InsertAtEnd(4);
        ob.InsertAtEnd(5);
        ob.InsertAtEnd(6);
        ob.PrintList();
        System.out.println("THe element we just deleted: "+ Integer.toString(ob.deleteAtEnd()));
        ob.PrintList();
        System.out.println("THe element we just deleted: "+ Integer.toString(ob.deleteAtBegin()));
        ob.PrintList();
    }


}