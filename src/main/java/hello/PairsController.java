package hello;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PairsController {

	@RequestMapping("/pairs")
	public String greeting(Model model) {
		model.addAttribute("pairs", Arrays.asList(new Pair("Joe", "Bob"), new Pair("Marley", "Jane")));
		return "pairs";
	}

	public static class Pair {
		private String driver;
		private String navigator;

		public Pair(String driver, String navigator) {
			this.driver = driver;
			this.navigator = navigator;
		}

		@Override
		public String toString() {
			return String.format("Pair of %s and %s.", driver, navigator);
		}

	}
}