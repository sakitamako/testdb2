public class Test {

	/*public,どこからでも参照可能
	 * static,インスタンス可(new)しなくても外部から使用可能
	 * void,戻り値なし
	 * main,メソッド名
	 * String[],引数をString型の配列で受け取る
	 * args,引数名、argument（和訳：引数）の複数形でargumentsの略省*/
	public static void main(String[] args) {

		//インスタンス化
		TestUserDAO dao = new TestUserDAO();

		//メソッドを実行
		//4
		dao.select("taro", "123");
		//6
		dao.selectAll();
		//8
		dao.selectByName("taro");
		//10
		dao.selectByPassword("123");
		//12
		dao.updateUserNameByUserName("taro", "saburo");
		//14
		dao.insert(4, "shiro", "012");
		//15
		dao.delete("jiro");
	}

}
