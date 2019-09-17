import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Controller {

    @FXML
    private VBox boxOfNotes;

    private ArrayList<Note> notes;

    public void initialize() {
        notes = new ArrayList<>();
        notes.add(new Note(boxOfNotes));
    }

    public void addNote(ActionEvent actionEvent) {
        if (notes.size() < 10)
            notes.add(new Note(boxOfNotes));
    }

    public void deleteNote(ActionEvent actionEvent) {
        if (notes.size() > 1) {
            for (Iterator<Note> i = notes.iterator(); i.hasNext(); ) {
                Note note = i.next();
                if (note.isSelected()) {
                    i.remove();
                    boxOfNotes.getChildren().removeAll(note.getNoteBox());
                }
                System.out.println("delka: " + notes.size());
            }

        }
    }

    public void changeBackground(ActionEvent actionEvent) {
        System.out.println("HERE");
        if(boxOfNotes.getStyleClass().contains("box-of-notes-solid")) {
            boxOfNotes.getStyleClass().add("box-of-notes-image");
            boxOfNotes.getStyleClass().removeAll("box-of-notes-solid");
        }
        else {
            boxOfNotes.getStyleClass().add("box-of-notes-solid");
            boxOfNotes.getStyleClass().removeAll("box-of-notes-image");
        }
    }
}
