import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> Abbreviations;

    public Abbreviations() {
        this.Abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.Abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {

        if (Abbreviations.containsKey(abbreviation)) {
            return true;
        }

        return false;
    }

    public String findExplanationFor(String abbrevation) {
        if (!Abbreviations.containsKey(abbrevation)) {
            return null;
        }
        return Abbreviations.get(abbrevation);
    }

}

/*
 * 
 * public void addAbbreviation(String abbreviation, String explanation) adds a
 * new abbreviation and its explanation.
 * 
 * public boolean hasAbbreviation(String abbreviation) checks if an abbreviation
 * has already been added; returns true if it has and false if it has not.
 * 
 * public String findExplanationFor(String abbreviation) finds the explanation
 * for an abbreviation; returns null if the abbreviation has not been added yet.
 * 
 */
