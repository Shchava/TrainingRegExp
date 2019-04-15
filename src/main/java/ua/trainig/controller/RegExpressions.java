package ua.trainig.controller;

public interface RegExpressions {
    String SINGLENAME_UA = "[А-ЩЄЮЯЇІҐ&&[^И]]([']?[а-щєюяїіьґ])+";
    String SURNAME_UA = "(?d)^(" + SINGLENAME_UA + ")([- ]" + SINGLENAME_UA + ")*$";
    String NAME_UA = "(?d)^(" + SINGLENAME_UA + ")(-" + SINGLENAME_UA + ")?$";
    String LOGIN = "^[\\w&&[^_]][-\\w]*[\\w&&[^_]]$";
}
