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

    private String meetingContent;

    private Integer meetingIsopen;

    private Department department;

    private MeetingType type;

    public MeetingInfo(Integer meetingId, String meetingName, Integer meetingDepartment, String meetingPlace, Date meetingDate, String meetingHost, String meetingPresent, String meetingSaver, String meetingAbstruct, String meetingRemarks, Integer meetingType, String meetingContent, Integer meetingIsopen, Department department, MeetingType type) {
        this.meetingId = meetingId;
        this.meetingName = meetingName;
        this.meetingDepartment = meetingDepartment;
        this.meetingPlace = meetingPlace;
        this.meetingDate = meetingDate;
        this.meetingHost = meetingHost;
        this.meetingPresent = meetingPresent;
        this.meetingSaver = meetingSaver;
        this.meetingAbstruct = meetingAbstruct;
        this.meetingRemarks = meetingRemarks;
        this.meetingType = meetingType;
        this.meetingContent = meetingContent;
        this.meetingIsopen = meetingIsopen;
        this.department = department;
        this.type = type;
    }

    public MeetingInfo() {
        super();
    }

    public MeetingInfo(Integer meetingId, String meetingName, Integer meetingDepartment,
                       String meetingPlace, Date meetingDate, String meetingHost,
                       String meetingPresent, String meetingSaver, String meetingAbstruct,
                       String meetingRemarks, Integer meetingType, String meetingContent,
                       Integer meetingIsopen) {
        this.meetingId = meetingId;
        this.meetingName = meetingName;
        this.meetingDepartment = meetingDepartment;
        this.meetingPlace = meetingPlace;
        this.meetingDate = meetingDate;
        this.meetingHost = meetingHost;
        this.meetingPresent = meetingPresent;
        this.meetingSaver = meetingSaver;
        this.meetingAbstruct = meetingAbstruct;
        this.meetingRemarks = meetingRemarks;
        this.meetingType = meetingType;
        this.meetingContent = meetingContent;
        this.meetingIsopen = meetingIsopen;
    }

    public Integer getMeetingIsopen() {
        return meetingIsopen;
    }

    public void setMeetingIsopen(Integer meetingIsopen) {
        this.meetingIsopen = meetingIsopen;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public MeetingType getType() {
        return type;
    }

    public void setType(MeetingType type) {
        this.type = type;
    }

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

    public String getMeetingContent() {
        return meetingContent;
    }

    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent == null ? null : meetingContent.trim();
    }
}