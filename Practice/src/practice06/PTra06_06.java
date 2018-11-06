package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */
		String square = "□";
		System.out.println("-----------------------------------");

		for (int i = 0; i < 5; i++) {
			square = "■";
			System.out.println();
			for (int n = 0; n < 5; n++) {
				if (n <= i - 1) {
				System.out.print(square);
				}else {
					square = "□";
					System.out.print(square);
				}
			}
		}

	}
}
