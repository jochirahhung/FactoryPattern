package main.app;

public class HtmlButton implements Components {

	public StringBuilder buildComponent(StringBuilder html) {
		html.append("<button>Click Me</button>");
		return html;
	}
 
}