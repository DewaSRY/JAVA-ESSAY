package Designpattern.Structural.Composite;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FileManager {
    public static void main(String[] args) {
        File[] f = new File[20];

        f[0] = new Directory("Root");
        f[1] = new Directory("My Documents");
        f[2] = new Directory("Maths");
        f[3] = new AFile("primary-numbers.txt");
        f[4] = new AFile("evens-numbers.txt");

        // Link and Creating Hierarchy
        ((Directory) f[0]).addFile(f[1]);
        ((Directory) f[1]).addFile(f[2]);

        ((Directory) f[2]).addFile(f[3]);
        ((Directory) f[2]).addFile(f[4]);
        // Displaying the hierarchy from the root folder
        System.out.print(f[0].display());
    }
}

class AFile extends File {
    public AFile(String fileName) {
        super(fileName);
    }

    @Override
    public String display() {
        return fileName;
    }
}

class Attributey {
    String attributeName;

    public Attributey(String attributeName) {
        this.attributeName = attributeName;
    }
}

class Directory extends File {
    Set<File> files;

    public Directory(String fileName) {
        super(fileName);
        files = new TreeSet<>();
    }

    @Override
    public String display() {
        String out = this.fileName + "\n";
        int level = 0;
        Iterator<File> iter = files.iterator();
        while (iter.hasNext()) {
            File f = iter.next();

            // if it is a file:
            if (f instanceof AFile) {
                out += f.fileName + "\n";
            }

            // if it is a directory:
            else if (f instanceof Directory) {
                // Recursive Function display
                out += f.display();
            } else
                assert false;

        }
        return out;
    }

    public boolean addFile(File file) {
        return files.add(file);
    }

    public boolean removeFile(File file) {
        return files.remove(file);
    }

    public String[] list() {
        String[] fls = new String[files.size()];
        Iterator<File> iter = files.iterator();
        int i = 0;
        while (iter.hasNext()) {
            File f = iter.next();
            fls[i++] = f.getFileName();
        }
        return fls;

    }

    public File[] listFiles() {
        return (File[]) files.toArray();
    }

}

abstract class File implements Comparable<File> {
    String fileName;
    Set<FileAttributey> fileAttributes;

    public File(String fileName) {
        this.fileName = fileName;
        this.fileAttributes = new TreeSet<>();
    }

    public Set<FileAttributey> getFileAttributes() {
        return fileAttributes;
    }

    public FileAttributey getFileAttribute(Attributey attributey) {
        if (!fileAttributes.isEmpty()) {
            Iterator<FileAttributey> iter = fileAttributes.iterator();
            while (iter.hasNext()) {
                FileAttributey fileAttributey = iter.next();
                if (fileAttributey.equals(attributey))
                    return fileAttributey;
            }
        }
        return null;
    }

    public String getFileName() {
        return fileName;
    }

    public void addFileAttribute(FileAttributey attr) {
        fileAttributes.add(attr);
    }

    public void removeFileAttribute(FileAttributey attr) {
        fileAttributes.remove(attr);
    }

    @Override
    public int compareTo(File f) {
        return fileName.compareTo(f.fileName);
    }

    public abstract String display();
}

class FileAttributey implements Comparable<FileAttributey> {

    Attributey attributey;
    String value;

    public FileAttributey(Attributey attributey, String value) {
        this.attributey = attributey;
        this.value = value;
    }

    @Override
    public int compareTo(FileAttributey o) {
        return attributey.attributeName.compareTo(o.attributey.attributeName);
    }
}
