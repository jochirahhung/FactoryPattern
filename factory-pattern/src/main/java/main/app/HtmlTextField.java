package main.app;

public class HtmlTextField implements Components{

	public StringBuilder buildComponent(StringBuilder html) {
		html.append("<textarea rows='4' cols='50'></textarea>");
		return html;
	}

}  