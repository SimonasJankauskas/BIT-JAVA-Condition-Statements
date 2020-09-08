package lt.simonasjankauskas.app;

public class SalygosTeiginiai {
    public static void main (String[] args) {
        int amzius = 46;
        if (amzius >= 18 && amzius > 45) {
            System.out.println("Jums leidžiama balsuoti ir kandidatuoti!");
        } else if (amzius >= 18 ) {
            System.out.println("Jums leidžiama balsuoti!");
        } else {
            System.out.println("Jums neleidžiama balsuoti!");
        }
    }
}

