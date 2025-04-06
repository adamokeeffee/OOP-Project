public class Medical {
    private int medicalId;
    private int patientId;
    private int staffId;
    private String diagnosis;
    private String symptoms;
    private String treatment;
    private String visitDate;
    private String nextAppointment;

    // Constructor
    public Medical(int medicalId, int patientId, int staffId, String diagnosis, String symptoms, String treatment, String visitDate, String nextAppointment) {
        this.medicalId = medicalId;
        this.patientId = patientId;
        this.staffId = staffId;
        this.diagnosis = diagnosis;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.visitDate = visitDate;
        this.nextAppointment = nextAppointment;
    }

    // Getters and Setters
    public int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(int medicalId) {
        this.medicalId = medicalId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(String nextAppointment) {
        this.nextAppointment = nextAppointment;
    }
}
