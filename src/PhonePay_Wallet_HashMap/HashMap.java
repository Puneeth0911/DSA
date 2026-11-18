package PhonePay_Wallet_HashMap;

public class HashMap {
	Node[] buckets;

	public HashMap(int size) {
		this.buckets = new Node[size];
	}

	public void put(int key, String value) {
		Node nn = new Node(key, value);
		int index = getIndex(key);
		if (buckets[index] == null) {
			buckets[index] = nn;
			return;
		}
		Node temp = buckets[index];
		while (temp != null) {
			if (temp.key == key) {
				temp.value = value;
				return;
			}
			if (temp.next == null) {
				break;
			}
			temp = temp.next;
		}
		temp.next = nn;
	}
	
	private int getIndex(int key) {
		return key % buckets.length;
	}

	public void display() {
		for (int i = 0; i < buckets.length; i++) {
			Node temp = buckets[i];
			while (temp != null) {
				System.out.println("User ID: " + temp.key);
				System.out.println("Wallet Details: " + temp.value);
				System.out.println("-------------------");
				temp = temp.next;
			}
		}
	}
	
	public String get(int key) {
		int index = getIndex(key);
		Node temp = buckets[index];
		while (temp != null) {
			if (temp.key == key) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean contains(int key) {
		int index = getIndex(key);
		Node temp = buckets[index];
		while (temp != null) {
			if (temp.key == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void addMoney(int key, double amount) {
		String details = get(key);
		if (details == null) {
			System.out.println("No such user");
			return;
		}
		String[] data = details.split(",");
		double balance = Double.parseDouble(data[1]);
		balance = balance + amount;
		put(key, data[0] + "," + balance);
		System.out.println("Money added successfully");
	}

	public void deductMoney(int key, double amount) {
		String details = get(key);
		if (details == null) {
			System.out.println("No such user");
			return;
		}
		String[] data = details.split(",");
		double balance = Double.parseDouble(data[1]);
		if (amount <= 0) {
			System.out.println("Invalid amount");
			return;
		}
		if (balance < amount) {
			System.out.println("Insufficient balance");
			return;
		}
		balance = balance - amount;
		put(key, data[0] + "," + balance);
		System.out.println("Money deducted successfully");
	}

	public void remove(int key) {
		int index = getIndex(key);
		Node temp = buckets[index];
		if (temp == null) {
			System.out.println("No such user");
			return;
		}
		if (temp.key == key) {
			buckets[index] = temp.next;
			return;
		}
		while (temp.next != null) {
			if (temp.next.key == key) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
		System.out.println("No such user");
	}
}
