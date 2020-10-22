package studentdb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//RowMapper인터페이스->select구문을 실행(mapRow()때문)->결과를 리턴
//RowMapper<Student>=>형변환을 시켜서 받을려고 제너릭을 준거임
public class StudentMapper implements RowMapper<Student> {

	//callBack 메서드->내부적으로 자동적으로 호출해주는 메서드
	//1.ResultSet객체를 반환(테이블 정보),2.검색된 갯수
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		//if(rs.next()) or while(rs.next())
		System.out.println("mapRow() 호출됨(rownum)=>"+rowNum);
		//while(rs.next()){
		Student st=new Student();//DTO객체를 생성->검색된 갯수만큼 필드별로 담기
		st.setId(rs.getInt("id"));
		st.setName(rs.getNString("name"));
		st.setAge(rs.getInt("age"));
		return st;//query()의 반환값으로 전달받을 수있다.
	}
}








