package studentdb;

//import java.sql.*; Connection,Pre~
import javax.sql.DataSource;//DB연결할때 필요
import java.util.List;//Select할때 필요(여러개의 레코드필요)

//1.DB연동을 초기화->Student에 접속->insert,update,delete,select 환경설정
public interface StudentDAO {

	//1.DB연결을 시켜주는 메서드필요(초기화)->DataSource객체->DB연동
	public void setDataSource(DataSource ds);
	
	//2.insert
	public void create(Integer id,String name,Integer age);
	
	//3.학생정보->pk로 검색 select * from student where id=1;
	public Student getStudent(Integer id);// (int id);
	
	//4.학생들 전체 정보 select * from student 
	public List<Student> listStudents();
	
	//5.학생정보 삭제 delete from student where id=2;
	public void delete(Integer id);
	
	//6.학생정보를 수정->update 테이블명 set 필드명=값,,,, where조건식
	public void update(Integer id,Integer age);//(int,int)
}









