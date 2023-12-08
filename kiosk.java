import java.util.Scanner;

class Food{
	int price;
	int bonusPoint;
	
	Food(int price){
		this.price=price;
		bonusPoint=(int)(price/10);
	}
}
class Cheeseburger extends Food{
	Cheeseburger(){  //조상클래스의 생성자 Food(int price)를 호출
		super(4000);   //치즈버거를 4000원으로 한다
	}
	public String toString() {return "치즈버거";}//Object클래스의 toString()을 오버라이딩
}
class Shrimpburger extends Food{
	Shrimpburger(){  //조상클래스의 생성자 Food(int price)를 호출
		super(4000);   //새우버거를 4000원으로 한다
	}
	public String toString() {return "새우버거";}//Object클래스의 toString()을 오버라이딩
}
class Coke extends Food{
	Coke(){  //조상클래스의 생성자 Food(int price)를 호출
		super(1000);   //콜라를 1000원으로 한다
	}
	public String toString() {return "코카콜라";}//Object클래스의 toString()을 오버라이딩
}

public class kiosk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int menuNum;
		
		while(true) {
			System.out.println("------[메뉴]------");
			System.out.println("1. 치즈버거(4000원)");
			System.out.println("2. 새우버거(4000원)");
			System.out.println("3. 코카콜라(1000원)");
			System.out.println("-----------------");
			System.out.println("4. 계산하기 5. 장바구니 보기");
			System.out.println("번호를 선택하세요 : ");
			menuNum = s.nextInt();
		}
	}

}
