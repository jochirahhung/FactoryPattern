package main.app;

public class HtmlTextField implements Components{

	public StringBuilder buildComponent(StringBuilder html, int height, int width, int left, int top, String text) {
		html.append("<textarea rows='4' cols='50' style= 'height:" + height + "; width:" + width + "; left:" + left + "; top:" + top + ";'>"+ text + "</textarea>");
		return html;
	}

}  