package lee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//public class ListAction implements CommandAction
public class TestActionController implements Controller {

	//public String requestPro(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			                                              HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestActionController의 handleRequest()호출됨!");
		ModelAndView mav=new ModelAndView(); //이동할 페이지,화면에 출력할 데이터정보
		//<property name="viewName" value="list3"></property>
		mav.setViewName("list3");//이동할 페이지명->경로X ,파일의 확장자도 X
		//모델2=>request.setAttribute("키값",저장할값)->request.getAttribute("키명") ${키명}
		mav.addObject("greeting","스프링세상!");//request.setAttribute("greeting","스프링세상!")
		return mav; //return "/list.jsp";
	}
}




