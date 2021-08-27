package Uke34;

public class Oppgave1 {
    public static int maks(int[] a) //a er en heltallstabell
    {
        if (a.length<1)
            throw new java.util.NoSuchElementException("Tabellen a er tom");
        int m = 0; //indeks til foreløpig største verdi (m for maks)

        for (int i=1; i<a.length; i++) //obs: starter med i =1
        {
            if (a[i]<a[m]) m=i; //indeksen oppdateres
        }
        return m; //returnerer indeksen/ posisjonen til største verdi
    } //min
}
