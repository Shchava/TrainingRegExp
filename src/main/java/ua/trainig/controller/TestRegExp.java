package ua.trainig.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRegExp {
    @Nested
    @DisplayName("Tests for surname")
    class surnameTests {
        String generalSurname = "Абвгґдеєжзиіїйклмнопрстуфхцчшщьюя";
        String wrongFirstLetterSurname = "Ибвгдж";
        String wrongFirstLetterSurname2 = "Ьбвгдж";
        String apostropheSurname = "Аб'вгдж";
        String lastApostropheSurname = "Абвгдж'";
        String doubleApostropheSurname = "А''п'п";
        String oneLetterSurname = "А";
        String doubleSurnameWithSpace = "Абвг Деєї";
        String doubleSurnameWithHyphen = "Абвг-Деєї";
        String tripleSurname = "Абвгґде Єжзиіїйклмнопрст Уфхцчшщьюя";

        @Test
        void SurnameCheckGeneral() {
            assertTrue(generalSurname.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void SurnameCheckFirstLetter() {
            assertFalse(wrongFirstLetterSurname.matches(RegExpressions.SURNAME_UA));
            assertFalse(wrongFirstLetterSurname2.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void SurnameCheckInnerApostrophe() {
            assertTrue(apostropheSurname.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void SurnameCheckLastApostrophe() {
            assertFalse(lastApostropheSurname.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void SurnameCheckDoubleApostrophe() {
            assertFalse(doubleApostropheSurname.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void SurnameOneLetter() {
            assertFalse(oneLetterSurname.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void doubleSurNameWithSpace() {
            assertTrue(doubleSurnameWithSpace.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void doubleSurNameWithHyphen() {
            assertTrue(doubleSurnameWithHyphen.matches(RegExpressions.SURNAME_UA));
        }

        @Test
        void tripleSurNameWithHyphen() {
            assertTrue(tripleSurname.matches(RegExpressions.SURNAME_UA));
        }
    }

    @Nested
    @DisplayName("Tests for first name")
    class firstNameTests {
        String generalName = "Абвгґдеєжзиіїйклмнопрстуфхцчшщьюя";
        String wrongFirstLetterName = "Ибвгдж";
        String wrongFirstLetterName2 = "Ьбвгдж";
        String apostropheName = "Аб'вгдж";
        String lastApostropheName = "Абвгдж'";
        String doubleApostropheName = "А''п'п";
        String oneLetterName = "А";
        String doubleNameWithHyphen = "Абвг-Деєї";
        String doubleNameWithSpace = "Абвг Деєї";

        @Test
        void nameCheckGeneral() {
            assertTrue(generalName.matches(RegExpressions.NAME_UA));
        }

        @Test
        void nameCheckFirstLetter() {
            assertFalse(wrongFirstLetterName.matches(RegExpressions.NAME_UA));
            assertFalse(wrongFirstLetterName2.matches(RegExpressions.NAME_UA));
        }

        @Test
        void nameCheckInnerApostrophe() {
            assertTrue(apostropheName.matches(RegExpressions.NAME_UA));
        }

        @Test
        void nameCheckLastApostrophe() {
            assertFalse(lastApostropheName.matches(RegExpressions.NAME_UA));
        }

        @Test
        void nameCheckDoubleApostrophe() {
            assertFalse(doubleApostropheName.matches(RegExpressions.NAME_UA));
        }

        @Test
        void nameOneLetter() {
            assertFalse(oneLetterName.matches(RegExpressions.NAME_UA));
        }

        @Test
        void doubleNameWithSpace() {
            assertFalse(doubleNameWithSpace.matches(RegExpressions.NAME_UA));
        }


        @Test
        void doubleNameWithHyphen() {
            assertTrue(doubleNameWithHyphen.matches(RegExpressions.NAME_UA));
        }
    }

    @Nested
    @DisplayName("Tests for nickname")
    class nicknameTests {
        String generalNickname = "abcdefghijklmnopqrstuvwxyz";
        String nicknameWithSymbols = "Ab-cd__efg---hi_jk-l";
        String wrongNicknameWithSymbols1 = "Ab-cd__efg---hi_jk-l_";
        String wrongNicknameWithSymbols2 = "_Ab-cd__efg---hi_jk-l";
        String nicknameWithNumbers = "1Ab-cd0__e11fg---h10i_j6k-l9";
        String cyrillicNickname = "Аабвгдж";


        @Test
        void nicknameCheckGeneral() {
            assertTrue(generalNickname.matches(RegExpressions.LOGIN));
        }
        @Test
        void nicknameWithSymbolsCheck() {
            assertTrue(nicknameWithSymbols.matches(RegExpressions.LOGIN));
            assertFalse(wrongNicknameWithSymbols1.matches(RegExpressions.LOGIN));
            assertFalse(wrongNicknameWithSymbols2.matches(RegExpressions.LOGIN));
        }
        @Test
        void nicknameWithNumbers() {
            assertTrue(nicknameWithNumbers.matches(RegExpressions.LOGIN));
        }
        @Test
        void nicknameWithCyrillic() {
            assertFalse(cyrillicNickname.matches(RegExpressions.LOGIN));
        }

    }
}
