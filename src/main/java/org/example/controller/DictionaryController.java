package org.example.controller;

import org.example.services.IDictionaryService;
import org.example.services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DictionaryController {
    static IDictionaryService dictionaryService = Services.getInstance().getDictionaryService();

    @GetMapping("/")
    public String showFormDictionary() {
        return "index";
    }

    @GetMapping("/result")
    public String showResultDictionary(@RequestParam String vietnamese, Model model) {
        List<String> english = dictionaryService.findByName(vietnamese);

        if (vietnamese.equals("")) {
            english = new ArrayList<>();
        } else {
            if (english.size() == 0) {
                english.add("Not Found Result");
            }
        }

        model.addAttribute("vietnamese", vietnamese);
        model.addAttribute("english", english);

        return "index";
    }
}
