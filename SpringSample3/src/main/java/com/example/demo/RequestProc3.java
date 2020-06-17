package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * Controller class to display and send the text box.
 */
@Controller
public class RequestProc3 {

	/*
	 * Function to display the route path
	 * @return "index" Return index.html
	 */
	@RequestMapping(value="/")
	public String index() {

		return "index3";
	}

	/*
	 * Function to process the value sent by the Send button
	 * @param members Receive a text string in a text box as a list value (object).
	 * @return mav Returns a string stored in ModelAndView.
	 */
	@RequestMapping(value="/post")
	public ModelAndView response(@ModelAttribute ParamObject members) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index3");
		// Stores a string
		mav.addObject("result", members.getMembers());

		return mav;
	}

	/*
	 * An inner class for objects to be passed to the respopnse function
	 */
	public static class ParamObject {

		// Let members have a list to pass the list values to.
		private List<Member> members = new ArrayList<>();

		// Input values Getter/Setter
		public List<Member> getMembers() { return members; }
		public void setMembers(List<Member> members) { this.members = members; }

	}

}

