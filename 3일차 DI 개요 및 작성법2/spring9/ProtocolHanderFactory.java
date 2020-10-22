package spring9;

import java.util.Map;

class RestHandler {
	//new RestHandler() ->public RestHandler(){} 기본생성자 만들어서 호출
}

class SoapHandler{}

public class ProtocolHanderFactory { //비누생산공장
 //Map객체->HashMp,Hashtable
	private Map<String,Object> map;

	public void setMap(Map<String, Object> map) {
		this.map = map;
		System.out.println("setMap()호출(map)=>"+map);
	}
}

