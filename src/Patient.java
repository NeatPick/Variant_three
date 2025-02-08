public class Patient {

    int id;
    String surname;
    String firstname;
    String patronymic;
    String address;
    String phoneNumber;
    int patientIDNumber;
    String diagnosis;

    public  Patient(int id, String surname, String firstname, String patronymic, String address, String phoneNumber,
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
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
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
        return "Пациент (" +
                "id=" + id +
                ", Имя: " + surname +
                ", Фамилия: " + firstname +
                ", Отчество: " + patronymic +
                ", Домашний адрес: " + address +
                ", Телефон: " + phoneNumber +
                ", Номер медицинской карты: " + patientIDNumber +
                ", Диагноз: " + diagnosis +
                ')';
    }


}

class PatientManager{

    public static void workingWithPatients(){
        Patient[] patients = new Patient[5];

        patients[0] = new Patient(1, "Абрамова", "Алёна", "Викторовна", "ул. Смолина, 90А",
                "+7 (951)633-62-59", 88564, "Грипп");
        patients[1] = new Patient(2, "Баранов", "Анатолий", "Леонидович", "пр. Строителей, 12",
                "369-369", 140254, "Аллергия");
        patients[2] = new Patient(3, "Романова", "Кристина", "Сергеевна", "ул. Калашникова, 37",
                "112-467", 747951, "Грипп");
        patients[3] = new Patient(4, "Иванов", "Иван", "Иванович", "ул. Ленина, 3",
                "911-004", 46715, "ОРВИ");
        patients[4] = new Patient(5, "Власов", "Максим", "Васильевич", "ул. Комсомольская, 20",
                "771-543", 465228, "Грипп");
        printPatients(patients);
        System.out.println("_________________________________________________________________");
        printDiagnosisPatient(patients);
    }

    private static void printPatients(Patient[] patients){
        System.out.println("Список пациентов: ");
        for (int i=0; i<patients.length; i++){
            System.out.println(patients[i]);
        }
    }
    private static void printDiagnosisPatient(Patient[] patients){
        System.out.println("Пациенты с диагнозом Грипп: ");
        for (int i = 0; i < patients.length; i++){
            if (patients[i].getDiagnosis().equals("Грипп")) {
                System.out.println(patients[i]);
            }
        }
    }

}


