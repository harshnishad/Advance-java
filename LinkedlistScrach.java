public class Main
{
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    // add --> First , last
    public void addFirst(String data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        
        n.next = head;
        head = n;

    }
    public void addLast(String data){
        Node n= new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = n;
    } 
    //print
    
    public void printList(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -->");
            currNode = currNode.next;
        }
       System.out.print("Null"+" ");
    }
    
	public static void main(String[] args) {
		Main l = new Main();
		l.addFirst("s");
		l.addFirst("k");
		l.addLast("ko");
		l.printList();
	
	}
}
