package animal;

public class Review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human tanaka = new Human("田中 太郎", 25, "電車");
		Human suzuki = new Human("鈴木 次郎", 30, "野球");
		Human satou = new Human("佐藤 花子", 20, "映画");

		tanaka.say();
		tanaka.think();

		suzuki.say();
		suzuki.think();

		satou.say();
		satou.think();

	}

}
