package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String outputPath) {

        if (!(contacts == null) && !(outputPath == null)) {
            Path path = Path.of(outputPath);
            try {
                Files.writeString(path, "");
                for (Map.Entry<String, String> entry : contacts.entrySet()) {
                    Files.writeString(path, entry.getKey() + ": " + entry.getValue() + "\n", StandardOpenOption.APPEND);
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not write file", ioe);
            }
        } else {
            throw new IllegalArgumentException("Path and contacts can not be empty!");
        }
    }
}
