import java.util.Scanner;
public class AnimalFactory {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			Animal a;
			String type = s.next();
			if (type.equals("cat")) {
				a = new Cat();
			} else {
				a = new Dog();
			}
			a.eat();
		}
	}
}
