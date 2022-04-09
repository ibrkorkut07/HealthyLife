package pojo

class DoctorAppointment {

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
