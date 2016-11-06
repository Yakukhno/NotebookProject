package ua.training.models;

import java.util.Date;

/**
 * The model describes note in notebook.
 * @version 1.0
 * @author Ivan Yakukhno
 */
public class Note {

    /** First name */
    private String firstName;

    /** Middle name */
    private String middleName;

    /** Last name */
    private String lastName;

    /** Full name */
    private String fullName;

    /** Username */
    private String username;

    /** Comment */
    private String comment;

    /** Group */
    private Group group;

    /** Home number in format 0-yyy-xxxxxx */
    private String homePhone;

    /** Home number in format 0yy-xxx-xx-xx */
    private String cellPhone;

    /** Additional home number in format 0yy-xxx-xx-xx */
    private String cellPhoneOptional;

    /** E-mail */
    private String email;

    /** Skype username */
    private String skype;

    /** Address */
    private Address address;

    /** Full address */
    private String fullAddress;

    /** Creation date of note */
    private Date initialDate;

    /** Data of last change of note */
    private Date lastChangeDate;

    /** Method creates full name from last name and first letter of first name */
    public void createFullName() {
        fullName = lastName + " " + firstName.charAt(0) + ".";
    }

    /** Method creates full address */
    public void createFullAddress() {
        fullAddress = address.getPostalCode() + ", " + address.getCity() + ", "
                + address.getStreet() + " " + address.getHouseNumber()
                + " flat " + address.getFlatNumber();
    }

    //getters & setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCellPhoneOptional() {
        return cellPhoneOptional;
    }

    public void setCellPhoneOptional(String cellPhoneOptional) {
        this.cellPhoneOptional = cellPhoneOptional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @Override
    public String toString() {
        return "Note{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", cellPhoneOptional='" + cellPhoneOptional + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", fullAddress='" + fullAddress + '\'' +
                ", initialDate=" + initialDate +
                ", lastChangeDate=" + lastChangeDate +
                '}';
    }
}
