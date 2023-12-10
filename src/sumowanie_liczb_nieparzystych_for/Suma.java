package sumowanie_liczb_nieparzystych_for;

public class Suma {

    public static void main(String[] args)

    {
        int i, suma = 0;

        System.out.println();

        for (i = 1; i <= 100; i++)
        {
            if(!(i % 2 == 0)) suma += i;
        }

        System.out.print( "Suma liczb NIEparzystych od 1 do 100 wynosi:\t" + suma);

    }
}
