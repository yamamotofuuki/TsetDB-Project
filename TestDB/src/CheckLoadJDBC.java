
public class CheckLoadJDBC {

	public static void main(String[] args) throws
	InstantiationException,IllegalAccessException {
		// TODO 自動生成されたメソッド・スタブ
		
		String msg = "";
		
		try {  // テキストは古いドライバクラス名
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		msg = "ドライバのロードに成功しました";
		} catch (ClassNotFoundException e){
		msg = "ドライバのロードに失敗しました";
		}
		System.out.println(msg);
	}

}
