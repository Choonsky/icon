package com.choonsky.astra.basic_icon;

import java.util.logging.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IconController {

	private static final Logger LOG = Logger.getLogger(IconController.class.getName());
	private IconProperties iconProperties;

	public IconController(IconProperties iconProperties) { this.iconProperties = iconProperties; }

	@RequestMapping("/")
	public String getGreeting() {
		LOG.info("Plain greeting from " + iconProperties.getName());
		return new StringBuilder("<h1>")
				.append("Plain greeting from ")
				.append(iconProperties.getName())
				.append("!!!</h1>")
				.toString();
	}

	@RequestMapping("/{present}")
	public String getGreeting(@PathVariable String present) {
		LOG.info("Greeting: " + present + " from " + iconProperties.getName());
		return new StringBuilder("<h1>Here is your ")
				.append(new String(Character.toChars(iconProperties.getPresents().get(present.toLowerCase()))))
				.append(" from ")
				.append(iconProperties.getName())
				.append("!!!</h1>")
				.toString();
	}
}