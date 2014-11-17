package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController
{
    @RequestMapping(method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", "Elmo");
        return "index";
    }
}
