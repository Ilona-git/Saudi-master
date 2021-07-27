package base;

import org.testng.annotations.Test;
import pages.LanguagesDropdown;

import static org.testng.Assert.assertEquals;

public class HomePageTests extends BaseTests {

    private final static String[] ABBREVIATIONS = {"En", "Ar", "De", "Es", "Fr", "It", "Tr", "Zh"};
    private final static String[] LANGUAGES = {"English", "عربى", "Deutsch",
            "Español", "Français", "Italiana",
            "Türk", "中文"};

    @Test
    public void HomePageOpened(){
        assertEquals(homePage.getTitle(), "SAUDIA | Entertainment");
    }


    @Test
    public void testDropdownIsWorking(){
        LanguagesDropdown page = homePage.openLanguageDropdown();

        var languagesList = page.getLanguagesList();
        System.out.println(languagesList);
        assertEquals(languagesList.size(), 8, "Different quantity");
    }

    @Test
    public void testDropdownIsClosed() {
        String currentLang = homePage.getCurrentLanguage();
        int counter = 0;
        for (String a : ABBREVIATIONS) {
            if(currentLang.equals(a)){
                counter++;
            }
        }
        System.out.println("The current is " + currentLang + " and the counter is " + counter);
        assertEquals(counter, 1, "The Language Dropdown Is Not Closed");
    }

    @Test
    public void testAllLanguages() {
        for(int i = 0; i < LANGUAGES.length; i++) {

                LanguagesDropdown dropdown = homePage.openLanguageDropdown();
                dropdown.chooseLanguageFromDropdown(LANGUAGES[i]);
                String lang = homePage.getCurrentLanguage();
                assertEquals(lang, ABBREVIATIONS[i], "Fail");

            }


    }



}
