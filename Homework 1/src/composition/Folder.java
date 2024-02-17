package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderName;
    private List<Folder> folderList;
    private List<File> fileList;

    public Folder(String folderName) {
        this.folderName = folderName;
        this.folderList = new ArrayList<>();
        this.fileList = new ArrayList<>();
    }

    public void deleteFolder(Folder folder) {
        folderList.remove(folder);
    }

    public void deleteFile(File file) {
        fileList.remove(file);
    }

    public void print() {
        printHelper(0);
    }

    private void printHelper(int recurCount) {
        StringBuilder indentation = new StringBuilder();
        for(int i = 0; i < recurCount; i++) {
            indentation.append("\t");
        }

        System.out.println(indentation.toString() + "Folder : " + folderName);

        for(Folder folder : folderList) {
            folder.printHelper(recurCount + 1);
        }

        for(File file : fileList) {
            System.out.println(indentation.toString() + "\tFile: " + file.getFileName());
        }
    }

    public void addFolder(Folder folder) {
        folderList.add(folder);
    }

    public void addFile(File file) {
        fileList.add(file);
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public List<Folder> getFolderList() {
        return folderList;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public String getFolderName() {
        return folderName;
    }
}
