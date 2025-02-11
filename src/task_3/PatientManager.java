package task_3;

public class PatientManager{

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
