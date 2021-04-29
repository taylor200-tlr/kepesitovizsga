package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String outputPath) {
        Path path = Path.of(outputPath);
//        try {
//            Files.writeString(path, "valami");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Map<String, String> writeableContacts = new HashMap<>();
//        Set<String> keys = writeableContacts.keySet(); // Kulcsok
//        Collection<String> values = writeableContacts.values(); // Értékek
        if (outputPath == null) {
            throw new IllegalArgumentException("Path can not be empty!");
        }
        if (contacts == null) {
            throw new IllegalArgumentException("Contacts can not be empty!");
        }
        try {
            for (Map.Entry<String, String> entry: writeableContacts.entrySet()) {
                Files.writeString(path,entry.getKey() + " - " + entry.getValue() + "\n", StandardOpenOption.APPEND);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        String actualPath = "phonebookOutput/output2.txt";
        TreeMap<String, String> contacts = new TreeMap<>();
        contacts.put("John Doe", "1-555-1010");
        phonebook.exportPhonebook(contacts, actualPath);
    }
}
