package spring8;

import java.util.Properties;

//서버에 접속->ip주소,접속시간 제한 정보저장=>Properties
public class BookClient {
   
	private Properties prop;

	public void setProp(Properties prop) {
		this.prop = prop;
		System.out.println("setProp()호출=>"+prop);
	}
}
