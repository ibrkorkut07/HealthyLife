package pojo;

public class Appointment {
/*
{
  "appoSpeciality": "string",
  "birthDate": "2022-04-09T22:53:47.163Z",
  "email": "string",
  "firstName": "string",
  "gender": "string",
  "lastName": "string",
  "phone": "string",
  "snumber": "string",
  "ssn": "string",
  "startDate": "2022-04-09"





 */

    @Override
    public String toString() {
        return "Appointment{" +
                "email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", gender='" + gender + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", snumber='" + snumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }

    public Appointment(String email, String firstname, String lastname, String phoneNumber, String ssn, String startDate) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.startDate = startDate;
    }

    public Appointment() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    private String email;
    private String firstname;
    private String gender;
    private String lastname;
    private String phoneNumber;
    private String snumber;
    private String ssn;
    private String startDate;


}