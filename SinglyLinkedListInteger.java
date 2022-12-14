
public class SinglyLinkedListInteger {
	
	Node head = null;
	Node tail = null;
	int count = 0;
	
	public SinglyLinkedListInteger() {
		
	}
	
	public void createList(int info){              
		Node p = new Node();
		p.data = info;
		p.next = null;
		if(head == null) {
			head = p;
		}else tail.next = p;
		
		tail = p;
	}
	
	public void insertRear(SinglyLinkedListInteger list) {
		Node p;
		p = head;
		if (head ==null) {
			head = tail = p;
		}else {
			head = p.next;
			if (list.tail == null)list.head = list.tail = p;
			else {
				list.tail.next = p;
				list.tail = p;
				count++;
			}
		}
		p.next = null;
	}

	public int length() {
		return count;
	}
	
	public void append(SinglyLinkedListInteger b){


		if (head==null){
		head = b.head;
		tail = b.tail;
		}else
		if(b.head ==null)return;

		else{
		tail.next = b.head;
		tail = b.tail;
		}
		b.head = b.tail = null;


	}
	
	public boolean empty() {
		return head==null;
	}
	
	public String printList() {
		String data = "";
		Node p = head;
		if (head == null) {
			data = "empty";
			return data;
		}
		while (p.next!=null) {
			data+=(p.data + " ");
			p = p.next;
		}
		data +=p.data;
		return data;
	}


}
