/** This class represents the Drug Object with instance variables like name of drug,smiles, drug id,url
 * @Name:  Nitish
 *  @StudentID:   7201791
 * @Assignment:    3
 */
import java.io.*;
public class Drug {
    String genericname;                  // genericname
    String SMILES;                       // SMILES
    String drugBankID;                   // drugBankID
    String url;                          //  url
    String druggroups;                   // druggroups
    Double score;                        //  score
    //getter fns -use to get value of instance variables of class
    public String getDrugbankID() {
        return drugBankID;
    }

    public String getGenericname() {
        return genericname;
    }

    public String getSmiles() {
        return SMILES;
    }

    public double getScores() {
        return score;
    }

    public String getUrl() {
        return url;
    }
    public String getDruggroups() {
        return druggroups;
    }

    /**This method displays information of drugs
     */
    public void displayDrugs(){
        System.out.println(this.genericname);
        System.out.println(this.SMILES);
        System.out.println(this.drugBankID);
        System.out.println(this.url);
        System.out.println(this.druggroups);
        System.out.println(this.score);
    }


    public Drug(String genericname, String SMILE, String drugbankid, String url, String druggroups, double score){
        this.genericname=genericname;
        this.SMILES=SMILE;
        this.drugBankID=drugbankid;
        this.url=url;
        this.druggroups=druggroups;
        this.score =score;
    }



}