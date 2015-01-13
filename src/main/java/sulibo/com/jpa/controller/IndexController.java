package sulibo.com.jpa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index.html")
public class IndexController {
	@RequestMapping
public String getindex(){
	String page="WEB-INF/jsp/index.jsp";
	return page;
}
}
