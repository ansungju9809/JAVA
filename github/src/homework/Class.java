package homework;
class Unit{
	String name;
	int HP = 2000;
}
class Champion extends Unit{
	int MP = 1000;
	String type = "�ٰŸ�";
	int avilityPower = 100;
	int level = 10;
	int attackSpeed = 10;
	int attackDamage = 200;
	public void Q_Skill() {
		System.out.println("����");
	}
	public void W_Skill() {
		System.out.println("��");
	}
	public void E_Skill() {
		System.out.println("��");
	}
	public void R_Skill() {
		System.out.println("�ñر�!");
	}

	public void attack(Unit name) {
		HP-=200;
		System.out.println("è�Ǿ��� �⺻����!");
		System.out.println("monsterü�� : "+HP);
		System.out.println();
	}
}
class jungle extends Unit{
	int coolDown;
	int attackSpeed = 10;
	int attackDamage = 100;
	public void attack1(Unit name){
		HP-=100;
		System.out.println("monster�� �⺻����!");
		System.out.println("è�Ǿ��� ü�� : "+HP);
		System.out.println();
	}
}
public class Class {
	
	public static void main(String[] args) {
		Champion sung = new Champion();
		jungle monster = new jungle();
		while(monster.HP > 0 && sung.HP > 0) {
			sung.attack(monster);
			monster.attack1(sung);
		}
		System.out.println("��������!");
	}

}