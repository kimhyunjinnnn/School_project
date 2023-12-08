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

class Buyer{
	Scanner s = new Scanner(System.in);
	int price;
	int bonusPoint;
	int count=0;
	int foodCnt;
	int foodCnt2;
	Food[] cart = new Food[10];
	Integer[] foodAmount = new Integer[10];
    int cartCnt =0;
	int buy(Food selectedFood) {
		if(price==0) { //장바구니 비우면 카트초기화
			cartCnt=0; 
			foodCnt=0;
			foodCnt2=0;
		}
		System.out.println("수량 : ");
		foodAmount[foodCnt++] = s.nextInt(); //수량 입력
		System.out.println(selectedFood+" "+foodAmount[foodCnt2]+"개 장바구니에 담았습니다. ");
		price+=selectedFood.price*foodAmount[foodCnt2]; 
		bonusPoint+=selectedFood.bonusPoint*foodAmount[foodCnt2];
		cart[cartCnt++]=selectedFood;
		foodCnt2++;
		return selectedFood.price; //선택한 상품 단가 리턴
	}
}

public class kiosk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Buyer b = new Buyer();
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
		
			if(menuNum==4) {
				break;
			}
	
			switch(menuNum) {
			case 1:
				b.buy(new  Cheeseburger());  //단가 4000원 
				break;
			case 2:
				b.buy(new  Shrimpburger());  //단가 4000원 
				break;
			case 3:
				b.buy(new  Coke());  //단가 1000원 
				break;
			default: 
				System.out.println("번호를 잘못입력하였습니다.");
				break;
			}
		}
	}
}