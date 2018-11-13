/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;
import practice13.common.Person;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee[] employees = new Employee[NAMEDATA.length];

		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee();
			employees[i].setUserId(Person.BASE_NO + i);
			employees[i].setUserNm(NAMEDATA[i]);
			employees[i].setMail(MAILDATA[i]);
			employees[i].setPassword(PASSDATA[i]);
			employees[i].setDepartmentNm(QUATERDATA[0][i]);
			employees[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));
		}

		for (Employee emp : employees) {
			System.out.println("ID:" + emp.getUserId());
			System.out.println("名前：" + emp.getUserNm());
			System.out.println("メールアドレス：" + emp.getMail());
			System.out.println("パスワード：" + emp.getPassword());
			System.out.println("部署：" + emp.getDepartmentNm());
			System.out.println("部署人数：" + emp.getDepartmentCnt());
		}


		/*Employee[] employees = new Employee[3];

			Employee employee1 = new Employee();
			employee1.setDepartmentNm(QUATERDATA[0][0]);
			employee1.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][0]));

			Employee employee2 = new Employee();
			employee2.setDepartmentNm(QUATERDATA[0][1]);
			employee2.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][1]));

			Employee employee3 = new Employee();
			employee3.setDepartmentNm(QUATERDATA[0][2]);
			employee3.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][2]));*/
	}
}
