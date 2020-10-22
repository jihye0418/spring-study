package studentdb;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;//spring-jdbc~.jar파일
import org.springframework.transaction.annotation.Transactional;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;//DB접속->Bean.xml에서 불러다 사용
	//접속후 sql실행->pstmt와 역할이 비슷한 클래스
	private JdbcTemplate jdbcobject;//->query()(select), udpate()(insert,update,delete)처리
	
	//DI방법 DB정보를 매개변수로 전달받음
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
        this.dataSource=dataSource;
        this.jdbcobject=new JdbcTemplate(dataSource);//jdbcTemplate(DB정보)
        System.out.println("setDataSource()호출돼서 DB연결됨(dataSource)=>"+dataSource);
	}

	@Override
	@Transactional
	public void create(Integer id, String name, Integer age) {
		// TODO Auto-generated method stub
       //형식) jdbcTemplate객체명.update(1.실행시킬 sql구문,2.입력받은값을 매개변수로 전달)
		String sql="insert into student values(?,?,?)";
		jdbcobject.update(sql,id,name,age);
		System.out.println("생성된 레코드이름->+id="+id+",name="+name+",age="+age);
	}
     //Mapper를 이용해서 Select구현(ResultSet을 따로 구현)
	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		String sql="select * from student where id=?";
		//반환값=jdbctemplate객체명.queryForObject(실행시킬 sql,매개변수(배열표시),RowMapper객체지정)
		//StudentMapper sm=new StudentMapper();
		Student st=jdbcobject.queryForObject(sql, new Object[] {id},new StudentMapper());
		return st;
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		//반환값(List)=jdbctemplate객체명.query(실행시킬 sql,RowMapper객체 지정)
		List<Student> sts=jdbcobject.query(sql, new StudentMapper());
		return sts;
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete from student where id=?";
		jdbcobject.update(sql,id);
		System.out.println("삭제된 레코드 id->+id="+id);
	}

	@Override
	@Transactional
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String sql="update student set age=? where id=?";
		//pstmt.setInt(1,age), pstmt.setInt(2,id)
		jdbcobject.update(sql,age,id);
		System.out.println("수정된 레코드이름->+id="+id+",age="+age);
	}

}




