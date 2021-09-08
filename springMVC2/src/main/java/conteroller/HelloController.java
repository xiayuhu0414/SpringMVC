package conteroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }

    @RequestMapping(value = "/param")
    public String param(){
        return "param";
    }
}
