package sg.edu.rp.c346.cghversion20;

public class Patient {
    String mrin, acountNo, name, age, gender;

    public Patient(String mrin, String acountNo, String name, String age, String gender) {
        this.mrin = mrin;
        this.acountNo = acountNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getMrin() {
        return mrin;
    }

    public void setMrin(String mrin) {
        this.mrin = mrin;
    }

    public String getAcountNo() {
        return acountNo;
    }

    public void setAcountNo(String acountNo) {
        this.acountNo = acountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
