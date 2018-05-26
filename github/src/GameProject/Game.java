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
		System.out.println("챔피언의 정보를 입력하세요.\n이름,체력,마나,레벨 순 ");
	}
}
class champion extends all{
	int mana;
	int level;
	public void champion(String name, int hp, int mp, int lv){
		this.name = name;
		health = hp;
		System.out.print("챔피언 정보" + "\n이름 : " + name + "\n체력 : " + hp);
		System.out.println("\n마나 : " + mp + "\n레벨 : " + lv + "lv");
	}
}