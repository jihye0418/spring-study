package kim;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestActionController {
	
	//public String hello(){return "home";} ==> /home.jsp로 단순 이동.
	//이동하면서 데이터도 전송할 때 ModelAndView
		
		@RequestMapping("/hello.do")
		public ModelAndView hello() {
			System.out.println("hello()호출됨");
			ModelAndView mav = new ModelAndView();
			mav.setViewName("hello"); //--이동할 페이지 이름!!!! (나머지 경로, 확장자는 .. 어... 그... test-servlet.xml에서)
			mav.addObject("greeting",getGreeting()); //  ===> 웹에서는 ${greeting}을 써서 나타낸다. 
			return mav;
		}
		
		//이동만 한다면
		//public String hello(){
		//return "hello";
		//}
		
		private String getGreeting() { //오늘 날짜   
			int hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY); //오늘 날짜 객체를 얻어옴.(시간대를 구해옴)
			if(hour >= 6 && hour <=10) { //6시 ~ 10시면
				return "좋은 아침입니다!";
			}else if(hour >= 12 && hour <= 15) { //12시 ~ 3pm이면
				return "맛점하세요!";
			}else if(hour >=18 && hour <=22) {
				return "집가요!!!!!!!!";
			}
			return "반갑습니다.";
		}
	}