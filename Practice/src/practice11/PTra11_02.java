package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Arrays;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] books = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		String line = scanner.nextLine();

		if(Arrays.asList(books).contains("o")) {
			System.out.println("oo");
		}
		/*繰り返しで、文字の一部を一致するものを特定するメソッドを使う（探す）*/
		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

	}
}
