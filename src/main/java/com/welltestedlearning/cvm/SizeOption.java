package com.welltestedlearning.cvm;

public enum SizeOption {
    SMALL, MEDIUM, LARGE, XL;

    @Override
    public String toString() {
        String name = name().toString();
        return Character.toUpperCase(name.charAt(0)) +  name.substring(1).toLowerCase();
    }
}
