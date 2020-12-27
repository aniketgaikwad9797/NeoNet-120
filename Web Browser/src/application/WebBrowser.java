package application;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

public class WebBrowser extends JFrame implements Runnable
{
	private JFXPanel panel;
	public void run()
	{
		setTitle("NeoNet-120");
		setBounds(0,0,1376,768);
		setVisible(true);
		panel=new JFXPanel();
		add(panel);
		//arrow functions are introduced in java 8
		Platform.runLater(() ->
		{
		WebView view=new WebView();
		view.getEngine().load("http://www.google.com");
		
		//panel.add(view) In case this was swing
		panel.setScene(new Scene(view));
		});
	}
	
	public static void main(String[] args) 
	{
	SwingUtilities.invokeLater(new WebBrowser());	
	}

}
