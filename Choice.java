import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;
import java.util.ArrayList;
import javafx.application.Application;

public class Choice extends Application {
	@Override
	public void start(Stage primaryStage){
	
	ArrayList<String> choices = new ArrayList<String>();
	choices.add("Administrator");
	choices.add("Student");
	choices.add("Faculty");
	choices.add("Staff");
	choices.add("Guest");

	ChoiceDialog<String> dialog = new ChoiceDialog<String>("Administrator", choices);
	dialog.setTitle("Switch demo");
	dialog.setHeaderText("Choice Dialog");
	dialog.setContentText("choose your role");
	Optional<String> result = dialog.showAndWait();

	switch(result.get()) {
	
		case "Administrator":
			System.out.println("Welcome administrator");
			break;
		
		case "Student":
			System.out.println("Welcome student");
			break;

		case "Faculty":
			System.out.println("Welcome faculty");
			break;
		case "Staff":
			System.out.println("Welcome Staff");
			break;
		case "guest":
			System.out.println("Welcome Guest");
			break;

	}


	
	}

}




