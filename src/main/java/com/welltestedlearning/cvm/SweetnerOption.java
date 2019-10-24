package com.welltestedlearning.cvm;

public enum SweetnerOption {
    NONE, SUGAR, SPLENDA;

    @Override
    public String toString() {
        String name = name().toString();
        StringBuilder properName = new StringBuilder();
        properName.append(Character.toUpperCase(name.charAt(0)));
        return properName.append(name.substring(1).toLowerCase()).toString();
    }
}
