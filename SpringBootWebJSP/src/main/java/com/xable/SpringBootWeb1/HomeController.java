package com.xable.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "student";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session) throws Exception {
//       int number1 = Integer.parseInt(req.getParameter("num1"));
//       int number2 = Integer.parseInt(req.getParameter("num2"));
//       session.setAttribute("result", (number1 + number2));
//        System.out.println("Add method called" + (number1+number2));
//        return "result.jsp";
//    }

    // we can directly use the names instead of httpservlet request
//    @RequestMapping("/add")
//    public String add(int num1, int num2, HttpSession session) throws Exception {
//        session.setAttribute("result", (num1 + num2));
//        System.out.println("Add method called" + (num1+num2));
//        return "result.jsp";
//    }

    // we can use Model obj instead of HttpSession
//    @RequestMapping("/add")
//    public String add(int num1, int num2, Model model) throws Exception {
//        int result = num1 + num2;
//        model.addAttribute("result", result);
//        System.out.println("Add method called" + result);
//        return "result";
//    }


    // Model view object

    @RequestMapping("/add")
    public ModelAndView add(int num1, int num2, ModelAndView mv) throws Exception {
        int result = num1 + num2;
        mv.addObject("result", result);
        System.out.println("Add method called" + result);
        mv.setViewName("result");
        return mv;
    }

//    @RequestMapping("/student")
//    public ModelAndView studentInfo(String name, int age, ModelAndView mv) throws Exception {
//       Student student = new Student();
//       student.setName(name);
//       student.setAge(age);
//       mv.addObject("student", student);
//        mv.setViewName("result");
//        return mv;
//    }

    // using model attribute annotation
    @RequestMapping("/student")
    public String studentInfo(@ModelAttribute Student student) throws Exception {

        return "result";
    }
}
