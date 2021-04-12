package legoset;

import jaxb.JAXBHelper;

import java.io.FileOutputStream;
import java.time.Year;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        var legoSet = new LegoSet();
        legoSet.setNumber("75211");
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setPackaging(Packaging.BOX);
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoSet.setMinifigs(List.of(new Minifig(2, "Imperial Mudtrooper"), new Minifig(1, "Imperial Pilot"),
                new Minifig(1, "Mimban Stormtrooper")));
        legoSet.setRatings(new Ratings(468, 4.4));

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));
    }
}