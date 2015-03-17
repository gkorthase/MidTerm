
/**
 * @author gkorthase@gmail.com
 * @version 03.09.2015.01
 * Assignment: MidTerm
 * Purpose: Creating injury information for ski patrol.
 */

public class Injury
{
    private int injurySeverity, patientID;
    private String injuryLocation, injuryType;

    /**
     * Enter injury information.
     * Location: Arms, Abdomen, Head, Legs
     * Severity: 0-10 (10 being most severe)
     * Type: Break, Sprain/Strain, Burn, Soft Tissue Slash, Soft Tissue Blunt
     */
    public Injury(int patientID, String injuryLocation, int injurySeverity, String injuryType) {
        this.patientID = patientID;
        this.injuryLocation = injuryLocation;
        this.injurySeverity = injurySeverity;
        this.injuryType = injuryType;
    }

    public int getPatientID() {
        return patientID;
    }
    
    public String getInjuryLocation() {
        return injuryLocation;
    }
    
    public int getInjurySeverity() {
        return injurySeverity;
    }
    
    public String getInjuryType() {
        return injuryType;
    }
}
