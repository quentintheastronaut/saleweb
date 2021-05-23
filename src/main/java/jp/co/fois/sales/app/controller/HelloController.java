package jp.co.fois.sales.app.controller;

import jp.co.fois.sales.app.constant.SalesConstant.Commodity;
import jp.co.fois.sales.app.constant.SalesConstant.ViewName;
import jp.co.fois.sales.app.web.form.company.CompanyForm;
import jp.co.fois.sales.domain.service.CompanyFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){

        return "testQuan/hello";
    }
}
