package org.example.services;

public class Services {
    private static Services instance;
    private final IDictionaryService dictionaryService = new DictionaryServiceIMPL();

    public Services() {
    }

    public IDictionaryService getDictionaryService() {
        return dictionaryService;
    }

    public static Services getInstance() {
        if (instance == null) instance = new Services();
        return instance;
    }
}
