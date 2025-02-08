public class Patient {
    int id;
    String surname;
    String firstname;
    String patronymic;
    String address;
    char phoneNumber;
    int patientIDNumber;
    String diagnosis;

    public  Patient(int id, String surname, String firstname, String patronymic, String address, char phoneNumber,
                    int patientIDNumber, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.patientIDNumber = patientIDNumber;
        this.diagnosis = diagnosis;
    }

    public  Patient(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public char getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(char phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPatientIDNumber(){
        return patientIDNumber;
    }
    public void setPatientIDNumber(int patientIDNumber){
        this.patientIDNumber = patientIDNumber;
    }
    public String getDiagnosis(){
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString(){
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", patientIDNumber=" + patientIDNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
