public class Aspirant  extends Student {
    String rabota;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String rabota) {
        super(firstName, lastName, group, averageMark);
        this.rabota = rabota;
    }

    @Override
    public int getScholarship() {
        return averageMark == 5 ? 20000 : 18000;
    }
}
