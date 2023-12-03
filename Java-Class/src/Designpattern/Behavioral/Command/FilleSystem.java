package Designpattern.Behavioral.Command;

public class FilleSystem {
    public static void main(String[] args) {
        System.out.println();
        TextFileOpsInvoker opsInvoker = new TextFileOpsInvoker();

        TextFile textFile = new TextFile("file1.txt");

        // Opening Operation
        TextFileOperation openOperation = new OpenTextFileOps(textFile);
        System.out.println(opsInvoker.executeOperation(openOperation));

        // Saving Operation
        TextFileOperation saveOperation = new SaveTextFileOps(textFile);
        System.out.println(opsInvoker.executeOperation(saveOperation));
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}

class Windows implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening File in Windows");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving File in Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Windows");
    }
}

class SaveFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public SaveFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.saveFile();
    }
}

class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}

class Linux implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening File in Linux");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving File in Linux");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Linux");
    }
}

class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Current OS is: " + osName);

        if (osName.contains("Windows")) {
            return new Windows();
        } else {
            return new Linux();
        }

    }

}

interface FileSystemReceiver {
    void openFile();

    void saveFile();

    void closeFile();
}

interface Command {
    void execute();
}

class FileInvoker {
    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
