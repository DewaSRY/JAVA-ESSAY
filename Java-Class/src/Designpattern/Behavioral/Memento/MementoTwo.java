package Designpattern.Behavioral.Memento;

public class MementoTwo {
    public static void main(String[] args) {
        System.out.println();
    }
}

// Care Taker
class TextEditor {

    private TextWindow textWindow;
    private TextWindowMemento savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getCurrentText();
    }

    public void hitSave() {
        savedTextWindow = textWindow.save();

    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

}

class TextWindow {
    // holds the currently entered text, adding more text
    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    // Adding text
    public void addText(String text) {
        currentText.append(text);
    }

    // save the memento
    public TextWindowMemento save() {
        return new TextWindowMemento(currentText.toString());
    }

    // Restoring the memento
    public void restore(TextWindowMemento save) {
        currentText = new StringBuilder(save.getText());
    }

    public String getCurrentText() {
        return currentText.toString();
    }

}

class TextWindowMemento {

    private String text;

    public TextWindowMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
