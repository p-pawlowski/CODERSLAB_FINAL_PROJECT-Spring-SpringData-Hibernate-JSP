package p.p.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import p.p.repository.ConspectusRepository;

@RequestMapping("/homework")
@Controller
public class HomeworkController {

	@Autowired
	ConspectusRepository conspectusRepository;

	@RequestMapping(path = "/{id}")
	public String moviesPage(@PathVariable long id, Model model) {
		model.addAttribute("conspectus", conspectusRepository.findOne(id));

		return "Homework";

	}

}