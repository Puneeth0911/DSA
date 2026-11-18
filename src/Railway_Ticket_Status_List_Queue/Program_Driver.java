package Railway_Ticket_Status_List_Queue;

public class Program_Driver {
	public static void main(String[] args) {
		Queue_List q=new Queue_List(5);
		q.bookTicket("Amit");
		q.bookTicket("Kevin");
		q.bookTicket("King");
		q.bookTicket("Smith");
		q.bookTicket("Puneeth");
		q.bookTicket("Ram");
		q.bookTicket("Shyam");
		q.remove("Kevin");
		
	}
}
