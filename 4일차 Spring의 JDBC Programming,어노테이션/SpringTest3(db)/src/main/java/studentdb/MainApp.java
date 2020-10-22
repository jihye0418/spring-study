package studentdb;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.xml파일을 메모리에 올리는 작업
		ApplicationContext context=
				new ClassPathXmlApplicationContext("/studentdb/Bean.xml");
		
	   //2.xml->getBean(id값 또는 name값)
	  StudentJDBCTemplate st=(StudentJDBCTemplate)
			                                     context.getBean("studentJDBCTemplate");
	  //DB연동이 끝난상태->insert,update,delete,select 메서드호출->처리결과를 확인
	  System.out.println("st=>"+st);
	  st.create(1,"홍길동", 23);
	  st.create(2,"테스트", 34);//->37
	  st.create(3,"박영진", 45);
	  st.create(4,"임시", 22);
	  st.create(5,"테스트2", 32);
	  System.out.println("전체 레코드 검색중....");
	  List<Student> sts=st.listStudents();
	  for(Student record:sts) { //for(객체자료형 객체명:컬렉션객체명(or 배열)
		  System.out.println("id="+record.getId()); //${record.id}
		  System.out.println("name="+record.getName());
		  System.out.println("age="+record.getAge());
	  }
		//수정
	   st.update(2, 37);//id가 2번=>37살로 변경
	   //삭제
	   System.out.println("삭제시킬 Record번호는 3번");
	   st.delete(3);
	   //5번인 데이터를 검색
	   Student record=st.getStudent(5);
	   System.out.println("id="+record.getId()); //${record.id}
	   System.out.println("name="+record.getName());
	   System.out.println("age="+record.getAge());
	}
}











