package GameProject;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		champion Champion = new champion();
		Champion.all();
		Champion.champion(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.close();
	}
}
class all{
	String name;
	int health;
	public void all() {
		System.out.println("è�Ǿ��� ������ �Է��ϼ���.\n�̸�,ü��,����,���� �� ");
	}
}
class champion extends all{
	int mana;
	int level;
	public void champion(String name, int hp, int mp, int lv){
		this.name = name;
		health = hp;
		System.out.print("è�Ǿ� ����" + "\n�̸� : " + name + "\nü�� : " + hp);
		System.out.println("\n���� : " + mp + "\n���� : " + lv + "lv");
	}
}