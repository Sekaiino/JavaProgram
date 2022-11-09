package prb;

public class TransfDate {
    public static void main(String[] args) {
        String date = "05-31-2001";

        date = dateInv(date);
        System.out.println(date);
    }

    public static String dateInv(String date) {
        String jj, mm, aaaa, dateinv;
        int firstIndex, secondIndex;

        firstIndex = date.indexOf("-");
        secondIndex = date.lastIndexOf("-");
        mm = date.substring(0, firstIndex);
        jj = date.substring(firstIndex+1, secondIndex);
        aaaa = date.substring(secondIndex+1, date.length());

        dateinv = String.join("/", jj, mm, aaaa);

        return dateinv;
    }
}
