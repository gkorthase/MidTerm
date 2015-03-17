
/**
 * @author gkorthase@gmail.com
 * @version 03.09.2015.01
 * Assignment: MidTerm
 * Purpose: Generate ski patrol reports.
 */

import java.util.ArrayList;

public class SkiPatrol {
    private ArrayList<Patient> patients;
    private ArrayList<Injury> injuries;

    public SkiPatrol() {
       patients = new ArrayList<>();
       injuries = new ArrayList<>();
    }

    /**
     * Enter patient information, ID must be 5 digits.
     */
    public void makePatientReport(String firstName, String lastName, int iD, int age, String address) { 
        patients.add(new Patient(firstName, lastName, iD, age, address));
    }
    
    /**
     * Enter injury information.
     * Location: Arms, Abdomen, Head, Legs
     * Severity: 0-10 (10 being most severe)
     * Type: Break, Sprain/Strain, Burn, Soft Tissue Slash, Soft Tissue Blunt
     */
    public void makeInjuriesReport(int patientID, String injuryLocation, int injurySeverity, String injuryType) {
        injuries.add(new Injury(patientID, injuryLocation, injurySeverity, injuryType));
    }
    
    public void listPatients() {
        for (int i = 0; i < patients.length; i++) {
            System.out.println("" + patients[i].getFirstName() + "" + patients[i].getLastName() + "" + patients[i].getID() + "" + patients[i].getAge() + "" + patients[i].getAddress());
        }
    }
    
    public void listInjuries() {
        for (int i = 0; i < injuries.length; i++) {
            System.out.println("" + injuries[i].getPatientID() + "" + injuries[i].getInjuryLocation() + "" + injuries[i].getInjurySeverity() + "" + injuries[i].getInjuryType());
        }
    }
    
    public void calculateAllInjuries() {
        int index = 0;
        int total = 0;
        int average = 0;
        while (index < injuries.length) {
            total = total + injuries[index].getInjurySeverity();
            index++;
        }
        average = total / index;
        system.out.println("The average severity of all injuries is" + average + ".");
    }
    
    public void findSevereInjuries() {
        final int SEVERE = 8;
        int index = 0;
        while (index < injuries.length) {
            if (injuries[index].getInjurySeverity() >= SEVERE) {
                printPatientReport(index);
            }
            index++;
        }
    }
    
    public printPatientReport(int index) {
        System.out.println("Patient: " + patients[index].getFirstName() + " " + patients[index].getLastName() + " ID: " + patients[index].getID() + " Age: " + patients[index].getAge() + " Address: " + patients[index].getAddress());
        System.out.println("Injury Location: " + injuries[index].getInjuryLocation() + " Injury Severity: " + injuries[index].getInjurySeverity() + " Injury Type: " + injuries[index].getInjuryType();
    }
}