package com.ronyao.bean;

public class MeetingFile {
    private Integer fileId;

    private String fileName;

    private Byte fileRight;

    private String filePath;

    private Integer fileMeeting;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Byte getFileRight() {
        return fileRight;
    }

    public void setFileRight(Byte fileRight) {
        this.fileRight = fileRight;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Integer getFileMeeting() {
        return fileMeeting;
    }

    public void setFileMeeting(Integer fileMeeting) {
        this.fileMeeting = fileMeeting;
    }
}