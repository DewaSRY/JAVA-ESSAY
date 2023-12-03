package Designpattern.Behavioral.Command;

import java.util.List;
import java.util.ArrayList;

public class TextFileManager {
    public static void main(String[] args) {
        System.out.println();
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // 1- Command : Open
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // Save
        SaveFileCommand saveFileCommand = new SaveFileCommand(fs);

        // 3- Invoker
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        FileInvoker fileInvoker2 = new FileInvoker(saveFileCommand);

        fileInvoker.execute();
        fileInvoker2.execute();

    }
}

// Parent Class for all the commands
interface TextFileOperation {
    String execute();
}

class OpenTextFileOps implements TextFileOperation {
    private TextFile textFile;

    @Override
    public String execute() {
        return textFile.open();
    }

    public OpenTextFileOps(TextFile textFile) {
        this.textFile = textFile;
    }
}

class SaveTextFileOps implements TextFileOperation {
    private TextFile textFile;

    @Override
    public String execute() {
        return textFile.save();
    }

    public SaveTextFileOps(TextFile textFile) {
        this.textFile = textFile;
    }
}

class TextFile {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String open() {
        return "Opening file " + fileName;
    }

    public String save() {
        return "Saving file " + fileName;
    }

}

class TextFileOpsInvoker {

    private final List<TextFileOperation> operations = new ArrayList<>();

    public String executeOperation(TextFileOperation operation) {
        operations.add(operation);
        return operation.execute();
    }

}
