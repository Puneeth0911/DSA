package Stack_Browser_Task;

public class Stack {
	Node currentStackHead;
	Node historyStackHead;

	public String search(String data) {
		Node nn = new Node(data);
//		if(currentStackHead==null) {
//			currentStackHead=nn;
//			return "visiting "+data+"site";
//		}
		nn.next = currentStackHead;
		currentStackHead = nn;
		historyStackHead = null;
		return "visiting " + data + "site";
	}

	public String backward() {
		if (currentStackHead == null || currentStackHead.next == null) {
			return "No previous page";
		}
		Node temp = currentStackHead;
		currentStackHead = currentStackHead.next;
		temp.next = null;
		if (historyStackHead == null) {
			historyStackHead = temp;
			return "Backward: " + currentStackHead.data;
		}
		temp.next = historyStackHead;
		historyStackHead = temp;
		return "Backward: " + currentStackHead.data;

	}

	public String forward() {
		if (historyStackHead == null) {
			return "No next page";
		}
		Node temp = historyStackHead;
		historyStackHead = historyStackHead.next;
		temp.next = null;
		if (currentStackHead == null) {
			currentStackHead = temp;
			return "Forward: " + currentStackHead.data;
		}
		temp.next = currentStackHead;
		currentStackHead = temp;
		return "Forward: " + currentStackHead.data;
	}

	public void refresh() {
		if (currentStackHead == null) {
			System.out.println("No page to refresh");
			return;
		}
		System.out.println("Refreshing: " + currentStackHead.data);
	}
}

/*
 * Stack current = new Stack(); 
 * Stack history = new Stack(); 
 * String present = "";
 * 
 * public void push(String data) { 
 * 		Node nn = new Node(data); 
 * 		if (head == null) {
 * 			head = nn; 
 * 			return; 
 * 		} 
 * 		nn.next = head; head = nn; }
 * 
 * 		public String pop() { 
 * 			if (head == null) 
 * 				return null; 
 * 			String data = head.data;
 * 			head = head.next; 
 * 			return data; 
 * 		}
 * 
 * 		public boolean isEmpty() { 
 * 			return head == null; 
 * 		}
 * 
 * 		public void search(String website) { 
 * 			current.push(present); 
 * 			present = website; 
 * 			System.out.println("Visited: " + present); 
 * 		}
 * 
 * public void backward() { 
 * 		if (current.isEmpty()) {
 * 			System.out.println("No previous page"); 
 * 				return; 
 * 		} 
 * 		history.push(present);
 * 		present = current.pop(); 
 * 		System.out.println("Backward: " + present); 
 * 	}
 * 
 * public void forward() { 
 * 		if (history.isEmpty()) {
 * 			System.out.println("No next page"); 
 * 			return; 
 * 		} 
 * 		current.push(present); present = history.pop(); System.out.println("Forward: " + present); }
 * 
 * public void refresh() { System.out.println("Refreshing: " + present); }
 * 
 */
