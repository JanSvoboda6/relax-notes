import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Note {
    @FXML
    private TextField noteText;
    @FXML
    private CheckBox noteSelector;
    @FXML
    private HBox noteBox;

    public Note(VBox boxOfNotes) {
        noteText = new TextField();
        noteSelector = new CheckBox();
        noteBox = new HBox();

        noteText.getStyleClass().add("text-field");
        noteSelector.getStyleClass().add("check-box");
        noteBox.getStyleClass().add("note-box");
        noteText.setPrefColumnCount(24);

        noteSelector.setOnAction(e -> {
            if (this.isSelected())
                noteText.setStyle("-fx-opacity: 0.29");
            else
                noteText.setStyle("-fx-opacity: 1");
        });
        noteBox.getChildren().addAll(noteText, noteSelector);
        boxOfNotes.getChildren().add(noteBox);
    }

    public void addToBoxOfNotes(VBox boxOfNotes) {
        boxOfNotes.getChildren().add(noteBox);
    }

    public boolean isSelected() {
        return noteSelector.isSelected();
    }

    public HBox getNoteBox() {
        return noteBox;
    }

}
