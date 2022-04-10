package pojo;

public class StaffApiPojo {



       /**{
        "createdBy": "anonymousUser",
        "createdDate": "2022-01-01T14:31:36.539261Z",
        "id": 4862,
        "firstName": "Omer",
        "lastName": "Nadercikli",
        "birthDate": "1010-02-01T18:38:00Z",
        "phone": "4387221874",
        "gender": "FEMALE",
        "bloodGroup": "Bnegative",
        "adress": "Fettek",
        "email": "elroy.mitchell@gmail.com",
        "description": "We are conducting Medunna",
        "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2021-12-25T17:00:55.695854Z",
        "id": 3314,
        "login": "apl",
        "firstName": "Pl",
        "lastName": "Ali",
        "email": "apl@email.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "888-88-8766"
        },
        "appointments": null,
        "inPatients": null,
        "country": {
        "id": 1201,
        "name": "US"
        },
        "cstate": {
        "id": 1251,
        "name": "Alaska",
        "country": {
        "id": 1201,
        "name": "US"
        }
        }
        }
        */

       private String createdBy;
    private String createdDate;
    private String id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String description;
   // private String user;
   // private StaffUserPojo staffUserdates;


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public String getUser() {
        return user;
    }

   public void setUser(String user) {
        this.user = user;
    }*/

   /* public StaffUserPojo getStaffUserdates() {
        return staffUserdates;
    }

    public void setStaffUserdates(StaffUserPojo staffUserdates) {
        this.staffUserdates = staffUserdates;
    }
          */

    public StaffApiPojo() {
    }


    public StaffApiPojo(String createdBy, String createdDate, String id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String description) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.description = description;
        //this.user = user;
        //this.staffUserdates = staffUserdates;
    }


    @Override
    public String toString() {
        return "StaffApiPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


   // StaffUserPojo staffUserdates
//", staffUserdates=" + staffUserdates +
// ", user='" + user + '\'' +

