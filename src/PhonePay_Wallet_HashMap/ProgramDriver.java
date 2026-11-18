package PhonePay_Wallet_HashMap;

public class ProgramDriver {
	public static void main(String[] args) {
		HashMap h = new HashMap(5);
		h.put(101, "Allen,5000");
		h.put(102, "Kevin,3000");
		h.put(103, "Amit,4000");
		h.put(107, "Mahesh,6000");
		h.put(112, "Ram,2000");
		h.put(113, "Sham,7000");

		h.display();
		System.out.println(h.get(103));
		System.out.println(h.contains(103));
		h.addMoney(101, 2000);
		h.deductMoney(102, 1000);
		h.remove(112);
		h.display();
	}
}
