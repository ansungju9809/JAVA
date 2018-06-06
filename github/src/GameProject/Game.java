package GameProject;

import java.util.*;
	public class Game{
		public static void main(String[] args) throws InterruptedException {
			Scanner sc = new Scanner(System.in);
			fight fi = new fight();
			character1 character1 = new character1();
			character2 character2 = new character2(); 
			System.out.println("1번 캐릭터 이름을 입력하세요");
			System.out.println("1번 캐릭터 정보");
			character1.choice(sc.nextInt());
			character1.inf(sc.next());
			System.out.println("2번 캐릭터 이름을 입력하세요.");
			System.out.println("2번 캐릭터 정보");
			character2.choice(sc.nextInt());
			character2.inf(sc.next());
			System.out.println("잠시 후 게임이 시작 됩니다.");
			Thread.sleep(2000);
			System.out.println("fight!");
			while(character1.health > 0 && character2.health > 0) {
					System.out.println("*************************");
					character1.attack();
					character2.health(character2.name);
					character2.attack();
					character1.health(character1.name);
					System.out.println("*************************");
					Thread.sleep(1000);
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
	int health;
	static int damage;
	String name;
	public static int s = 0;
	public void choice(int c) {
		switch(c) {
		case 1:
			health = 10;
			damage = 30;
			break;
		case 2:
			health = 450;
			damage = 60;
			break;
		case 3:
			health = 700;
			damage = 25;
			break;
		case 4:
			health = 550;
			damage = 30;
			break;
		case 5:
			health = 750;
			damage = 20;
			break;
		}
	}
}
class character1 extends all{
	all all = new all();
	all all1 = new all();
	fight fi = new fight();
	public void inf(String name){
		this.name = name;
		System.out.println("*************************");
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + health );
		System.out.println("공격력 : " + damage);
		System.out.println("*************************");
	}
	public void attack() {
		System.out.println(this.name + "의 공격!");
	}
	public void health(String name) {
		if(s == 0) {
			health = health - fi.fight();
			System.out.println(name + "의 체력 : " + health);
		}
		else {
			System.out.println(name + "의 체력 : " + health);
			s=0;
		}
	}
}
class character2 extends all{
	fight fi = new fight();
	public void inf(String name) {
		this.name = name;
		System.out.println("*************************");
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + health );
		System.out.println("공격력 : " + damage);
		System.out.println("*************************");
	}
	public void attack() {
		System.out.println(this.name + "의 공격!");
	}
	public void health(String name) {
		if(s == 0) {
		health = health - fi.fight();
		System.out.println(name + "의 체력 : " + health);
		}
		else {
			System.out.println(name + "의 체력 : " + health);
			s=0;
		}
	}
}	
class fight extends all{
	public int fight() {
		int ran = (int)(Math.random()*3)+1;
		switch(ran) {
		case 1:
			System.out.println("방어 실패");
			return damage;
		case 2:
			System.out.println("방어 성공!");
			return 10;
		case 3:
			System.out.println("기절했습니다.");
			++s;
			break;
		}
		return damage;
	}
}