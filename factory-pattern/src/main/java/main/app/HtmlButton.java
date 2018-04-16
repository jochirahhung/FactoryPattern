package main.app;

public class HtmlButton implements Components {

	public StringBuilder buildComponent(StringBuilder html, int height, int width, int left, int top, String text) {
		html.append("<button style= 'height:" + height + "; width:" + width + "; left:" + left + "; top:" + top + ";'>"+ text + "</button>");
		return html;
	}
 
}