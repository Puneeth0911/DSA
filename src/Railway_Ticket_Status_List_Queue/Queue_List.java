package Railway_Ticket_Status_List_Queue;

public class Queue_List {
	Node confirmedTicketHead;
	Node waitingTicketHead;
	Node waitingTicketTail;
	int length;
	int noOfTickets;
	public Queue_List(int noOfTickets) {
		this.noOfTickets=noOfTickets;
	}

	public void bookTicket(String name) {
		Ticket t = new Ticket(name);
		if (length < noOfTickets) {
			t.status = "Confirmed";
			Node nn = new Node(t);
			if (confirmedTicketHead == null) {
				confirmedTicketHead = nn;
				length++;
				System.out.println(name + " ticket confirmed");
				return;
			}
			Node temp = confirmedTicketHead;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nn;
			length++;
			System.out.println(name + " Ticket Confirmed");
		} else {
			t.status = "Waiting";
			Node nn = new Node(t);
			if (waitingTicketHead == null && waitingTicketTail == null) {
				waitingTicketHead = waitingTicketTail = nn;
				return;
			}
			waitingTicketTail.next = nn;
			waitingTicketTail = nn;
			System.out.println(name + " added to waiting");
		}
	}

	public void remove(String name) {
		Node temp = confirmedTicketHead;
		Node prev = null;
		while (temp != null) {
			if (temp.data.name.equals(name)) {
				if (prev == null) {
					confirmedTicketHead = temp.next;
				} else {
					prev.next = temp.next;
				}
				length--;
				System.out.println(name + " Ticket cancelled");

				if (waitingTicketHead != null) {
					Node nn = waitingTicketHead;
					waitingTicketHead = waitingTicketHead.next;
					if (waitingTicketHead == null) {
						waitingTicketTail = null;
					}
					nn.next = null;
					nn.data.status = "Confirmed";
					if (confirmedTicketHead == null) {
						confirmedTicketHead = nn;
					} else {
						Node last = confirmedTicketHead;
						while (last.next != null) {
							last = last.next;
						}
						last.next = nn;
					}
					length++;
					System.out.println(nn.data.name + " Ticket confirmed");
				}
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		System.out.println("Passenger not found");
	}
}
