package net.javaguides.springboot.h2.AuditController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class auditController {
    @RequestMapping("/")
	public String home() {
		return "Internal";
	}
}
