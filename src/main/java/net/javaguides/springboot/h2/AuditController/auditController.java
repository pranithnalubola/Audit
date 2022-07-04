package net.javaguides.springboot.h2.AuditController;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.h2.model.Details;

@Controller
public class auditController {

	public String answerOne,answerTwo,answerThree,projectName,managerName,applicationName;


    @GetMapping("/")
	public String home(Model model) {
		Details details=new Details();
		model.addAttribute("details", details);
		return "Audit";
	}

	@PostMapping("/submit")
	public String submit(@ModelAttribute("details") Details details){
		System.out.println(details);
		details.setProjectName(this.projectName);
		details.setApplicationName(applicationName);
		details.setManagerName(managerName);
		int count=0;
		if(details.getAnswerOne().equals("Yes"))
			count++;
		if(details.getAnswerTwo().equals("Yes"))
			count++;
		if(details.getAnswerThree().equals("Yes"))
			count++;
		if(details.getAnswerFour().equals("Yes"))
			count++;
		if(details.getAnswerFive().equals("Yes"))
			count++;
		details.setStatus(count>=3?"Green":"Red");
		details.setAction(details.getStatus().equals("Green")?"No action required":"Action to be taken two weeks");
		return "last";
	}

	@PostMapping("/submit/second")
	public String submitSecond(@ModelAttribute("details") Details details){
		System.out.println(details);
		this.projectName=details.getProjectName();
		this.applicationName=details.getApplicationName();
		this.managerName=details.getManagerName();
		return "Internal";
	}
}
