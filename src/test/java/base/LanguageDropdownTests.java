package base;

import org.testng.annotations.Test;
import pages.LanguagesDropdown;

import static org.testng.Assert.assertEquals;

public class LanguageDropdownTests extends BaseTests{

    @Test //The default language is English.
    public void testDefaultLanguage(){
        String currentLang = homePage.getCurrentLanguage();
        System.out.println("The current language is: " + currentLang);
        assertEquals(currentLang, "En", "The default language is different from English");
    }

    @Test
    public void switchLanguageToItalian() {

        LanguagesDropdown page = homePage.openLanguageDropdown();
        page.chooseLanguageFromDropdown("Italiana");
        String currentLanguage = homePage.getCurrentLanguage();
        assertEquals(currentLanguage, "It", "Failed");
    }

    /*@Test //Test if correct number of languages is available.
    public void testLanguagesOptions(){
        LanguagesDropdown page = homePage.clickLanguageButton();

        var languagesList = page.getLanguagesList();
        System.out.println(languagesList);

        assertEquals(languagesList.size(), 8, "Different quantity");
    }*/



}
