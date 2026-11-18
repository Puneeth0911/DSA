package Stack_Browser_Task;

public class Program_Driver {
	public static void main(String[] args) {
		Stack s=new Stack();
        System.out.println(s.search("insta.com"));
        System.out.println(s.search("fb.com"));
        System.out.println(s.search("yt.com"));
        System.out.println(s.search("google.com"));
        s.refresh();
        System.out.println(s.backward());
        System.out.println(s.forward());
        s.refresh();
	}
}
