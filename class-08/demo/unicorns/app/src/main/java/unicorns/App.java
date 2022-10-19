/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package unicorns;

import com.google.gson.Gson;
import org.checkerframework.checker.units.qual.A;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Unicorn> classUnicorns = new ArrayList<>();
        ArrayList<String> mattColors = new ArrayList<>();
        mattColors.add("Blue");
        Unicorn matticorn = new Unicorn(mattColors, 20, false, "Matticorn");
        ArrayList<String> patrickColors = new ArrayList<>();
        patrickColors.add("Blue"); patrickColors.add("White"); patrickColors.add("Red");
        Unicorn patricorn = new Unicorn(patrickColors, 30, true, "Patricorn");
        ArrayList<String> jenColors = new ArrayList<>();
        jenColors.add("Black");
        Unicorn jennicorn = new Unicorn(jenColors, 35, true, "Jennicorn");
        ArrayList<String> haustinColors = new ArrayList<>();
        haustinColors.add("Orange"); haustinColors.add("White");
        Unicorn hausicorn = new Unicorn(haustinColors, 14, false, "Hausicorn");

        classUnicorns.add(matticorn);
        classUnicorns.add(patricorn);
        classUnicorns.add(jennicorn);
        classUnicorns.add(hausicorn);

        Gson gson = new Gson();
        String matticornJson = gson.toJson(matticorn);
        System.out.println(matticornJson);

        String edicornJson =
                "{" +
                "   \"colors\": [\"black\", \"white\", \"purple\"]," +
                "   \"hornLength\": 2," +
                "   \"hasWings\": true," +
                "   \"name\": \"Edicorn\"" +
                "}";

        //Unicorn edicorn = gson.fromJson(edicornJson, Unicorn.class);

        File unicornFile = new File(".\\app\\src\\test\\resources\\unicorn.json");
        FileReader unicornFileReader = new FileReader(unicornFile);

        Unicorn edicorn = gson.fromJson(unicornFileReader, Unicorn.class);

        // try-with-resources

        File unicornFileOut = new File(".\\app\\src\\test\\resources\\unicorn2.json");
        try (FileWriter unicornFileWriter = new FileWriter(unicornFileOut))
        {
            gson.toJson(edicorn, unicornFileWriter);
            System.out.println("test");
        }
        //gson.
        //Cupcake cupcake = gson.fromJson(edicornJson, Cupcake.class);
    }
}