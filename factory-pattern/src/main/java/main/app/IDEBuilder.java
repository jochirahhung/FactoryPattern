package main.app;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class IDEBuilder extends Application{
	
	private Stage primaryStage;
	private BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("IDE Builder");
		showMainView(); 
	}
	
	private void showMainView() throws IOException{
		FXMLLoader loader = new FXMLLoader(); 
		loader.setLocation(IDEBuilder.class.getResource("IDE.fxml"));
		mainLayout = loader.load();  
		
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false); 
		primaryStage.show();    
	}
	
	public static void WriteToFile(String fileContent, String fileName) throws IOException {
        String projectPath = System.getProperty("user.dir");
        String tempFile = projectPath + File.separator+fileName;
        File file = new File(tempFile);
        // if file does exists, then delete and create a new file
        if (file.exists()) {
            try {
                File newFileName = new File(projectPath + File.separator+ "backup_"+fileName);
                file.renameTo(newFileName);
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //write to file with OutputStreamWriter
        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
        Writer writer=new OutputStreamWriter(outputStream);
        writer.write(fileContent);
        writer.close();  
        Desktop.getDesktop().open(file);

    }
	
	public void widget() {
	/*  JPanel panel = new JPanel(new BorderLayout());
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text = new JTextField();
		JPanel outerPanel = new JPanel();
		JColorChooser button1 = new JColorChooser();
		text.setColumns(8);
		
		panel.add(text, BorderLayout.CENTER);
		panel.add(button1, BorderLayout.AFTER_LAST_LINE);
		outerPanel.add(panel, BorderLayout.BEFORE_FIRST_LINE);
		
		window.add(outerPanel);
		window.setSize(1000, 1000);
		window.setVisible(true);
	*/
		
		StringBuilder html = new StringBuilder();
		HtmlButton b = new HtmlButton();
		HtmlTextField t = new HtmlTextField();
		html.append("<html><head><title> Test </title></head>");
		html.append("<body>");
		b.buildComponent(html);
		t.buildComponent(html);
		html.append("</body>");
		try {
			WriteToFile(html.toString(), "test.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	} 
	
	public static void main(String[] args){ 
		launch(args); 
	} 
	
}
 