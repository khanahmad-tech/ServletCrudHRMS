package com.hrms.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class RegisterModel {
    private int userId;
    private String userName;
    private String email;
    private String address;
    private String mobileNumber; // Change to String
    private Date registerDate;
    private String parentContact;
	private Set<Topic> topics;

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobile) {
        this.mobileNumber = mobile;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getParentContact() {
        return parentContact;
    }

    public void setParentContact(String parentContact) {
        this.parentContact = parentContact;
    }


    public RegisterModel(int userId, String userName, String email, String address, String mobileNumber,
            Set<Topic> topics, Date registerDate, String parentContact) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.mobileNumber = mobileNumber; // Change to long
        this.topics = topics;
        this.registerDate = registerDate;
        this.parentContact = parentContact;
    }

    public RegisterModel() {
        // Default constructor
    }

    @Override
    public String toString() {
        return "RegisterModel [userId=" + userId + ", userName=" + userName + ", email=" + email + ", address="
                + address + ", mobileNumber=" + mobileNumber + ", topics=" + topics + ", registerDate=" + registerDate
                + ", parentContact=" + parentContact + "]";
    }

	public Set<Object> setTopics(HashSet<Topic> topics) {
	return Set.of("java");
	}

}
