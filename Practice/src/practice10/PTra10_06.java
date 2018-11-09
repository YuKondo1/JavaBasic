package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		final int distance = 100;
		int sum = 0;
		int n = 0;

		Car car1 = new Car();
		car1.color = "赤";
		car1.gasoline = 30;

		while (true) {
			int run = car1.run();
			n++;
			sum += run;
			System.out.println(sum);

			if(distance <= sum) {
				System.out.println("「目的地にまで" + n + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです」");
				break;
			}
		}

		sum = 0;

		Car car2 = new Car();
		car2.color = "青";
		car2.gasoline = 50;

		while (true) {
			int run = car2.run();
			n++;
			sum += run;
			System.out.println(sum);

			if(distance <= sum) {
				System.out.println("「目的地にまで" + n + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです」");
				break;
			}
		}

		sum = 0;

		Car car3 = new Car();
		car3.color = "緑";
		car3.gasoline = 100;

		while (true) {
			int run = car3.run();
			n++;
			sum += run;
			System.out.println(sum);

			if(distance <= sum) {
				System.out.println("「目的地にまで" + n + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです」");
				break;
			}
		}
	}
}
