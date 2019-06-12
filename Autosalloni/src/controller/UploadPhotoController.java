package controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import view.SignUp;


public class UploadPhotoController implements EventHandler<MouseEvent> {

	public static FileChooser fileChooser = new FileChooser();
	
	@Override
	public void handle(MouseEvent e) {
		File file = fileChooser.showOpenDialog(SignUp.stage);
		if (file != null) {
			

			String current = null;
			try {
				current = new java.io.File(".").getCanonicalPath();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}

			configureFileChooser(fileChooser);

			try {
				SignUp.bImage = ImageIO.read(file);
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			SignUp.image1 = new Image(file.toURI().toString(), 100, 150, true, true);

			String imgName = file.getName().toString();
			String extType = imgName.split("\\.")[1];
			Random rand = new Random();
			String randomNumber = String.valueOf(rand.nextInt((800000) + 1) + 100000);
			String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			String joinName = randomNumber+timeStamp; 
			String finalName = joinName + "." + extType;
			System.out.println(finalName);
			SignUp.imageView1.setImage(SignUp.image1);
			SignUp.imageView1.setFitHeight(150);
			SignUp.imageView1.setFitWidth(100);
			SignUp.imageView1.setPreserveRatio(true);

			try {
				ImageIO.write(SignUp.bImage, extType, new File(current + "/uploads/user-img/" + finalName));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	public static void configureFileChooser(final FileChooser fileChooser) {
		fileChooser.setTitle("View Pictures");
		fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Images", "*.*"),
				new FileChooser.ExtensionFilter("JPG", "*.jpg"), new FileChooser.ExtensionFilter("PNG", "*.png"));
	}
}
