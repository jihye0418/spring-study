package lee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//public class WriteActionController extends AbstractCommandController {

@Controller
public class WriteActionController {
   
	@Autowired
    BoardDAO dao;//BoardDAO dao=new BoardDAO();
	
	/*
	public void setDao(BoardDAO dao) {//<property name="dao"><ref bean="id명" />~
		this.dao=dao;
		System.out.println("setDao() 호출됨(dao)=>"+dao);
	}
	   String title=request.getParameter("title");      
	   형식)@RequestParam("매개변수명") 자료형 반환을 받을 변수명      
	    request객체=>get방식으로 요청시 처리(@getMapping("요청경로")
	    request객체->post방식으로 요청시 처리(@postMapping("요청경로")        
	*/
	@RequestMapping("/write.do")
	public ModelAndView test(@RequestParam("title") String title,
			                               @RequestParam("author") String author,
			                               @RequestParam("content") String content
			                              )
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WriteActionController의 test()호출됨!");
		//request.setCharacterEncoding("utf-8");//한글처리
		/* 어노테이션을 이용해서 생략이 가능
		String author=request.getParameter("author");
		String content=request.getParameter("content");
		String title=request.getParameter("title");
		*/
		BoardCommand data=new BoardCommand();//이미 입력받은값을 Setter Method로 호출이 돼서 저장이 된상태
		int newNum=dao.getNewNum()+1;//새로 저장할 게시물번호
		data.setNum(newNum);
		//수동=><jsp:setProperty name="객체명" property="*" />
		data.setTitle(title);
		data.setAuthor(author);
		data.setContent(content);
		dao.write(data);//dao.write(data);
		
		return new ModelAndView("redirect:/list.do");
	}
}




