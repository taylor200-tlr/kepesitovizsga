package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String outputPath) {
        if (outputPath == null){
            throw new IllegalArgumentException("Path must not be empty!");
        }
        if (contacts == null){
            throw new IllegalArgumentException("Contacts must not be empty!");
        }

    }
}
