
public class Test {

	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");
		
		//追加コード用１
		dao.selectALL();
		
		//追加コード用２
		dao.selectByName("taro");
		
		//追加コード用３
		dao.selectByPassword("123");
		
		//追加コード用４
		dao.updateUserNameByUserName("taro","saburo");
		
		//追加コード用５
		dao.insert(4,"shiro","012");
		
		//追加コード用６
		dao.delete("jiro");
	}

}

