/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        ArrayList<Player> gk = new ArrayList<>();
        ArrayList<Player> df = new ArrayList<>();
        ArrayList<Player> mf = new ArrayList<>();
        ArrayList<Player> fw = new ArrayList<>();

        for(int i = 0; i < player.size(); i++) {
        	String po = player.get(i).getPosition();
        	if (po.endsWith("GK")) {
        		gk.add(player.get(i));
        	} else if (po.endsWith("DF")){
        		df.add(player.get(i));
        	} else if (po.endsWith("MF")) {
        		mf.add(player.get(i));
        	} else {
        		fw.add(player.get(i));
        	}
        }
        int gkNm = new java.util.Random().nextInt(gk.size());
        Collections.shuffle(df);
        Collections.shuffle(mf);
        Collections.shuffle(fw);

        System.out.println(gk.get(gkNm));
        System.out.println(df.get(0));
        System.out.println(df.get(1));
        System.out.println(df.get(2));
        System.out.println(df.get(3));
        System.out.println(mf.get(0));
        System.out.println(mf.get(1));
        System.out.println(mf.get(2));
        System.out.println(mf.get(3));
        System.out.println(fw.get(0));
        System.out.println(fw.get(1));
	}
}
