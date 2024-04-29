public class bird {
    String name;
    String latinName;
    int observations;

    public bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void observed(){
        this.observations++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observations + " observations";
    }

    
}
