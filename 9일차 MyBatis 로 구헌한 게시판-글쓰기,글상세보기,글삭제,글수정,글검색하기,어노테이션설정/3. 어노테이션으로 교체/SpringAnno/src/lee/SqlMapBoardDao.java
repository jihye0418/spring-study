package lee;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;

//업무에 따른 메서드를 구현
//SqlSessionDaoSupport을 상속
//SqlSession클래스가 객체->DB연동할때 필요로하는 객체
public class SqlMapBoardDao extends SqlSessionDaoSupport implements BoardDAO {

	//SqlSession sqlSession; =>getSqlSession()을 제공해준다.
	//setSqlSession(~){this.sqlSession=sqlSession;}
	@Override
	public List list() throws DataAccessException {
		// TODO Auto-generated method stub
		/*
		 * select->레코드 한개이상(List~)->selectList("실행시킬 sql구문의 id부여")
		 * select->레코드 한개(DTO,String,Integer,,,)->selectOne("실행시킬 sql구문의 id부여")
		 */
		
		return getSqlSession().selectList("list");//<select id="list" ~>SQL구문</select>
	}
	/*
	 * <select id="list" resultType="board(lee.BoardCommand)">
          select * from springboard order by num desc
       </select>
	 */
	@Override
	public int getNewNum() throws DataAccessException {
		// TODO Auto-generated method stub
		//레코드한개(SelectOne),특정필드의 자료형(Wrapper)
		//형식) selectOne("실행시킬 sql의 id값부여",매개변수전달할값=>#{매개변수}
		//Object->Integer->int
		return (Integer)getSqlSession().selectOne("getNewNum");//매개변수 X
	}
	
	@Override
	public void write(BoardCommand data) throws DataAccessException {
		// TODO Auto-generated method stub
		//형식) sqlSession객체명.insert("실행시킬 id",전달할 매개변수명)
		//id값이 구분이 안되면 네임스페이스명.id값으로 구분해서 호출하는 경우도 있다.
		getSqlSession().insert("write",data);//Setter Method로 값이 다 저장된 상태
	}
	
	//조회수 증가->RetrieveActionController->retrive.jsp로 전달
	@Override
	public void updateReadcnt(String num) throws DataAccessException {
		// TODO Auto-generated method stub
		//형식) sqlSession객체명.update("실행구문의 id",매개변수)
		getSqlSession().update("updateReadcnt",num);
	}
	
	@Override
	public BoardCommand retrieve(String num) throws DataAccessException {
		// TODO Auto-generated method stub
		return (BoardCommand)getSqlSession().selectOne("retrieve",num);
	}
	
	@Override
	public void delete(String num) throws DataAccessException {
		// TODO Auto-generated method stub
		//형식) sqlSession객체명.delete("실행구문의 id",매개변수)
		getSqlSession().delete("delete",num);
	}
	
	@Override
	public void update(BoardCommand data) throws DataAccessException {
		// TODO Auto-generated method stub
		getSqlSession().update("update",data);
	}
	
	@Override
	public List search(BoardCommand data) throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("search",data);
	}
	
}






