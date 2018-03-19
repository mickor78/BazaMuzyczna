import java.util.*;
import java.lang.*;

public class BazaMuzyczna {
    public static void main(String[] args)
    {
        Utwor[] playlist = new Utwor[4];

        playlist[0] = new Utwor("./music/pop/", "Perfect", "Edd Sheeran");
        playlist[1] = new Utwor("./music/pop/", "Let it's snow", "Frank Sinatra" );
        playlist[2] = new Utwor("./music/pop/");
        //playlist[3] = new Utwor();

        for (Utwor e : playlist)
            System.out.println(e.getTitlle()+e.getAlubum()+e.getDirection()+e.getTitlle() );
    }

}
