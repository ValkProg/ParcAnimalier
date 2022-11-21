package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VueDetailController 
{
	private Animal selectedAnimal;
	
	@FXML private Label name;
	@FXML private Label age;
	@FXML private Label refuge;
	@FXML private Label sexe;
	@FXML private Label race;
	@FXML private Label taille;
	@FXML private ImageView myImageView;
	
	
	public void initData(Animal animal) {
		selectedAnimal = animal;
		
		Image myImage = new Image(animal.getPhoto());
		
		name.setText(selectedAnimal.getNom());
		age.setText(Integer.toString(selectedAnimal.getAge()));
		refuge.setText(selectedAnimal.getRefuge());
		sexe.setText(selectedAnimal.getSexe());
		race.setText(selectedAnimal.getRace());
		taille.setText(Double.toString(selectedAnimal.getTaille()));
		myImageView.setImage(myImage);
	}
	
	public void returnMain() {
		window.set
	}
}
