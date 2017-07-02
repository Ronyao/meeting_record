package com.ronyao.bean;

import java.util.Date;

public class MeetingInfo {
    private Integer meetingId;

    private String meetingName;

    private Integer meetingDepartment;

    private String meetingPlace;

    private Date meetingDate;

    private String meetingHost;

    private String meetingPresent;

    private String meetingSaver;

    private String meetingAbstruct;

    private String meetingRemarks;

    private Integer meetingType;

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public Integer getMeetingDepartment() {
        return meetingDepartment;
    }

    public void setMeetingDepartment(Integer meetingDepartment) {
        this.meetingDepartment = meetingDepartment;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace == null ? null : meetingPlace.trim();
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingHost() {
        return meetingHost;
    }

    public void setMeetingHost(String meetingHost) {
        this.meetingHost = meetingHost == null ? null : meetingHost.trim();
    }

    public String getMeetingPresent() {
        return meetingPresent;
    }

    public void setMeetingPresent(String meetingPresent) {
        this.meetingPresent = meetingPresent == null ? null : meetingPresent.trim();
    }

    public String getMeetingSaver() {
        return meetingSaver;
    }

    public void setMeetingSaver(String meetingSaver) {
        this.meetingSaver = meetingSaver == null ? null : meetingSaver.trim();
    }

    public String getMeetingAbstruct() {
        return meetingAbstruct;
    }

    public void setMeetingAbstruct(String meetingAbstruct) {
        this.meetingAbstruct = meetingAbstruct == null ? null : meetingAbstruct.trim();
    }

    public String getMeetingRemarks() {
        return meetingRemarks;
    }

    public void setMeetingRemarks(String meetingRemarks) {
        this.meetingRemarks = meetingRemarks == null ? null : meetingRemarks.trim();
    }

    public Integer getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Integer meetingType) {
        this.meetingType = meetingType;
    }
}