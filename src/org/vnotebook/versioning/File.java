package org.vnotebook.versioning;

public class File {
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Byte[] getContent() {
        return content;
    }

    public void setContent(Byte[] content) {
        this.content = content;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void share(String url) {
        // Suppose we implement share here
    }

    public void download() {
        // Suppose we implement download here
    }

    private String fileType;
    private Byte[] content;
    private double size;
}
