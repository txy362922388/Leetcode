public class Hero {
	public String name;
	public float hp;
	public int damage;
	public int id;
	static String copyright;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	static {
		System.out.println("��ʼ�� copyright");
		copyright = "��Ȩ��Riot Games��˾����";
		}
}
