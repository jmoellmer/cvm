package com.welltestedlearning.cvm;

public enum CreamerOption {
    NONE, MILK, HALF_N_HALF;

    @Override
    public String toString() {
        String name = name().toString();
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
    }
}
