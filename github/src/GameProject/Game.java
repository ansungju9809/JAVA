package GameProject;

import java.util.Scanner;
	public class Game{
		public static void main(String[] args) throws InterruptedException {
			Scanner sc = new Scanner(System.in);
			character1 character1 = new character1();
			character2 character2 = new character2(); 
			System.out.println("1번 캐릭터 이름을 입력하세요");
			System.out.println("1번 캐릭터 정보");
			character1.inf(sc.next());
			System.out.println("2번 캐릭터 이름을 입력하세요.");
			System.out.println("2번 캐릭터 정보");
			character2.inf(sc.next());
			System.out.println("잠시 후 게임이 시작 됩니다.");
			Thread.sleep(2000);
			System.out.println("fight!");
			for(;character1.health > 0 && character2.health > 0;) {
				if(character1.attackSpeed > character2.attackSpeed) {
					character1.attackSpeed -= 5;
					System.out.println("*************************");
					character1.attack();
					character2.health(character2.name);
					System.out.println("*************************");
					Thread.sleep(1000);
				}
				else if(character1.attackSpeed == character2.attackSpeed){
					System.out.println("*************************");
					character1.attack();
					character2.health(character2.name);
					character2.attack();
					character1.health(character1.name);
					System.out.println("*************************");
					character1.attackSpeed +=5;
					Thread.sleep(1000);
				}
			}
			System.out.println(character1.name + "의 체력은 : " + character1.health);
			System.out.println(character2.name + "의 체력은 : " + character2.health);
			System.out.println();
			if(character1.health > character2.health) {
				System.out.println(character1.name + "의 승리 입니다.");
			}
			else if(character1.health == character2.health) {
				System.out.println("무승부 입니다.");
			}
			else {
				System.out.println(character2.name + "의 승리입니다.");
			}
			sc.close();
		}
	}
class all{
	int health = 500;
	String name;
}
class character1 extends all{
	int attackSpeed = 10;
	int damage = 30;
	public void inf(String name){
		this.name = name;
		System.out.println("*************************");
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + health );
		System.out.println("공격력 : " + damage);
		System.out.println("공격 속도 : " + attackSpeed);
		System.out.println("*************************");
	}
	public void attack() {
		System.out.println(this.name + "의 공격!");
	}
	public void health(String name) {
		health = health - 40;
		System.out.println(name + "의 체력 : " + health);
	}
}
class character2 extends all{
	int attackSpeed = 5;
	int damage = 40;
	public void inf(String name) {
		this.name = name;
		System.out.println("*************************");
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + health );
		System.out.println("공격력 : " + damage);
		System.out.println("공격 속도 : " + attackSpeed);
		System.out.println("*************************");
	}
	public void attack() {
		System.out.println(this.name + "의 공격!");
	}
	public void health(String name) {
		health = health - 30;
		System.out.println(name + "의 체력 : " + health);
	}
}