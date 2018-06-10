package sg.edu.rp.c346.cghversion20;

public class MedicalDetail {
    String patientFBId, typeOfAnaesthesiaSedation, preOpDiagnosis;
    boolean infectionControlConcerns, contactPrecautions, bloodBorneInfection, airbornePrecautions, otherHighRiskInfections;

    String contactPrecautionsString, bloodBorneInfectionString, airbornePrecautionsString, otherHighRiskInfectionsString;
    String assignDoctorId,locationOT, chitSubmission;

    public MedicalDetail(String patientFBId, String typeOfAnaesthesiaSedation, String preOpDiagnosis, boolean infectionControlConcerns, boolean contactPrecautions, boolean bloodBorneInfection, boolean airbornePrecautions, boolean otherHighRiskInfections, String contactPrecautionsString, String bloodBorneInfectionString, String airbornePrecautionsString, String otherHighRiskInfectionsString, String assignDoctorId, String locationOT, String chitSubmission) {
        this.patientFBId = patientFBId;
        this.typeOfAnaesthesiaSedation = typeOfAnaesthesiaSedation;
        this.preOpDiagnosis = preOpDiagnosis;
        this.infectionControlConcerns = infectionControlConcerns;
        this.contactPrecautions = contactPrecautions;
        this.bloodBorneInfection = bloodBorneInfection;
        this.airbornePrecautions = airbornePrecautions;
        this.otherHighRiskInfections = otherHighRiskInfections;
        this.contactPrecautionsString = contactPrecautionsString;
        this.bloodBorneInfectionString = bloodBorneInfectionString;
        this.airbornePrecautionsString = airbornePrecautionsString;
        this.otherHighRiskInfectionsString = otherHighRiskInfectionsString;
        this.assignDoctorId = assignDoctorId;
        this.locationOT = locationOT;
        this.chitSubmission = chitSubmission;
    }

    public String getPatientFBId() {
        return patientFBId;
    }

    public void setPatientFBId(String patientFBId) {
        this.patientFBId = patientFBId;
    }

    public String getTypeOfAnaesthesiaSedation() {
        return typeOfAnaesthesiaSedation;
    }

    public void setTypeOfAnaesthesiaSedation(String typeOfAnaesthesiaSedation) {
        this.typeOfAnaesthesiaSedation = typeOfAnaesthesiaSedation;
    }

    public String getPreOpDiagnosis() {
        return preOpDiagnosis;
    }

    public void setPreOpDiagnosis(String preOpDiagnosis) {
        this.preOpDiagnosis = preOpDiagnosis;
    }

    public boolean isInfectionControlConcerns() {
        return infectionControlConcerns;
    }

    public void setInfectionControlConcerns(boolean infectionControlConcerns) {
        this.infectionControlConcerns = infectionControlConcerns;
    }

    public boolean isContactPrecautions() {
        return contactPrecautions;
    }

    public void setContactPrecautions(boolean contactPrecautions) {
        this.contactPrecautions = contactPrecautions;
    }

    public boolean isBloodBorneInfection() {
        return bloodBorneInfection;
    }

    public void setBloodBorneInfection(boolean bloodBorneInfection) {
        this.bloodBorneInfection = bloodBorneInfection;
    }

    public boolean isAirbornePrecautions() {
        return airbornePrecautions;
    }

    public void setAirbornePrecautions(boolean airbornePrecautions) {
        this.airbornePrecautions = airbornePrecautions;
    }

    public boolean isOtherHighRiskInfections() {
        return otherHighRiskInfections;
    }

    public void setOtherHighRiskInfections(boolean otherHighRiskInfections) {
        this.otherHighRiskInfections = otherHighRiskInfections;
    }

    public String getContactPrecautionsString() {
        return contactPrecautionsString;
    }

    public void setContactPrecautionsString(String contactPrecautionsString) {
        this.contactPrecautionsString = contactPrecautionsString;
    }

    public String getBloodBorneInfectionString() {
        return bloodBorneInfectionString;
    }

    public void setBloodBorneInfectionString(String bloodBorneInfectionString) {
        this.bloodBorneInfectionString = bloodBorneInfectionString;
    }

    public String getAirbornePrecautionsString() {
        return airbornePrecautionsString;
    }

    public void setAirbornePrecautionsString(String airbornePrecautionsString) {
        this.airbornePrecautionsString = airbornePrecautionsString;
    }

    public String getOtherHighRiskInfectionsString() {
        return otherHighRiskInfectionsString;
    }

    public void setOtherHighRiskInfectionsString(String otherHighRiskInfectionsString) {
        this.otherHighRiskInfectionsString = otherHighRiskInfectionsString;
    }

    public String getAssignDoctorId() {
        return assignDoctorId;
    }

    public void setAssignDoctorId(String assignDoctorId) {
        this.assignDoctorId = assignDoctorId;
    }

    public String getLocationOT() {
        return locationOT;
    }

    public void setLocationOT(String locationOT) {
        this.locationOT = locationOT;
    }

    public String getChitSubmission() {
        return chitSubmission;
    }

    public void setChitSubmission(String chitSubmission) {
        this.chitSubmission = chitSubmission;
    }
}
