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
		System.out.println("TestActionController�� handleRequest()ȣ���!");
		ModelAndView mav=new ModelAndView(); //�̵��� ������,ȭ�鿡 ����� ����������
		//<property name="viewName" value="list3"></property>
		mav.setViewName("list3");//�̵��� ��������->���X ,������ Ȯ���ڵ� X
		//��2=>request.setAttribute("Ű��",�����Ұ�)->request.getAttribute("Ű��") ${Ű��}
		mav.addObject("greeting","����������!");//request.setAttribute("greeting","����������!")
		return mav; //return "/list.jsp";
	}
}




