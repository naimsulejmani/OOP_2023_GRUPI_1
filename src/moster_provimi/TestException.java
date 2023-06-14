package moster_provimi;

public class TestException {
    public static void main(String[] args) {
        try {
            int numri = -4;
            if (numri < 0)
                throw new RrenjaKatroreNumratNegativeException("Nuk ka rrenje katrore per vlera negtive");
            System.out.println(Math.sqrt(numri));
        } catch (RrenjaKatroreNumratNegativeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
