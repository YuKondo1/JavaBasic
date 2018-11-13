/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> player = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split(",");
                Player pl = new Player();
                pl.setPosition(array[0]);
                pl.setName(array[1]);
                pl.setCountry(array[2]);
                pl.setTeam(array[3]);

                player.add(pl);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        for(int i = 0; i < player.size(); i++) {
        	String tm = player.get(i).getTeam();
        	if (tm.endsWith("レアル・マドリード")) {
        		player.remove(i);
        	} else if (tm.endsWith("バルセロナ")) {
        		player.remove(i);
        	} else {
        		continue;
        	}
        }
		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player p : player) {
        	System.out.println(p);
        }
	}
}
