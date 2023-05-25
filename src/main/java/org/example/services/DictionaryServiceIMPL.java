package org.example.services;

import java.util.*;

public class DictionaryServiceIMPL implements IDictionaryService {
    public static Map<String, String> hashtable = new HashMap<>();

    static {
        hashtable.put("hello", "Xin chào");
        hashtable.put("goodbye", "Tạm biệt");
        hashtable.put("sorry", "Xin lỗi");
        hashtable.put("good", "Tốt");
    }

    @Override
    public List<String> findByName(String name) {
        List<String> listKey = new ArrayList<>();
        List<String> result = new ArrayList<>();
        hashtable.forEach((k, v) -> {
            listKey.add(k);
        });
        for (String value : listKey) {
            if (value.toLowerCase().contains(name.toLowerCase())) {
                result.add(hashtable.get(value));
            }
        }
        return result;
    }
}
