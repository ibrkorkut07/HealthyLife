package pojo

class DoctorAppointment {
/*
 "createdBy": "anonymousUser",
    "createdDate": "2021-12-21T22:33:06.907662Z",
    "id": 3403,
    "startDate": "2021-12-22T17:00:00Z",
    "endDate": "2021-12-22T18:00:00Z",
    "status": "UNAPPROVED",
    "anamnesis": null,
    "treatment": null,
    "diagnosis": null,
    "prescription": "",
    "description": "cfgvhbjn",
    "physician": {
        "createdBy": "oscarlebsack",
        "createdDate": "2022-03-01T13:26:00.734890Z",
        "id": 10501,
        "firstName": "Arif",
        "lastName": "Canpol",
        "birthDate": "1991-01-31T23:00:00Z",
        "phone": "5354334312",
        "gender": "MALE",
        "bloodGroup": "Apositive",
        "adress": "",
        "description": "",
        "user": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-03-01T13:19:47.400256Z",
            "id": 10097,
            "login": "arifcanpol135",
            "firstName": "physicianTeam93-10",
            "lastName": "physicianTeam93-10",
            "email": "canpolska@gmail.co",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "331-13-1131"



 */
        private int id;
        private String startDate;
        private String endDate;
        private String status;

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getStartDate() {
        return startDate
    }

    void setStartDate(String startDate) {
        this.startDate = startDate
    }

    String getEndDate() {
        return endDate
    }

    void setEndDate(String endDate) {
        this.endDate = endDate
    }

    String getStatus() {
        return status
    }

    void setStatus(String status) {
        this.status = status
    }

    DoctorAppointment() {
    }

    DoctorAppointment(int id, String startDate, String endDate, String status) {
        this.id = id
        this.startDate = startDate
        this.endDate = endDate
        this.status = status
    }

    @Override
    public String toString() {
        return "DoctorAppointment{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
