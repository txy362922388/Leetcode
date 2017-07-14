import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
	public static Hero getHero() {
		File f = new File("D:/workspace/Test/src/hero.config");
		try {
			FileReader fr = new FileReader(f);
			String className = null;
			char[] all = new char[(int)f.length()];
			fr.read(all);
			className = new String(all);
			return (Hero) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main (String[] args) {
//		try {
//			String className = "Hero";
//			Class c1 = Hero.class;
//			Class c2 = Class.forName(className);
//			Class c3 = new Hero().getClass();
//			System.out.println(c1 == c2);
//			System.out.println(c2 == c3);
//			System.out.println(c1 == c3);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Hero h1 = new Hero();
//		h1.name = "teemo";
//		System.out.println(h1);
//		try {
//			Class c = Class.forName("Hero");
//			Hero h2 = (Hero) c.newInstance();
//			h2.name = "gareen";
//			System.out.println(h2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Hero h3 = getHero();
//		System.out.println(h3);
		
//		Hero h = new Hero();
//		h.name = "teemo";
//		System.out.println(h.name);
//		try {
//			Field f = h.getClass().getField("name");
//			f.set(h, "gareen");
//			System.out.println(h.name);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Hero h = new Hero();
		h.name = "teemo";
		System.out.println(h.name);
		try {
			Method m = h.getClass().getMethod("setName", String.class);
			m.invoke(h, "garren");
			System.out.println(h.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
