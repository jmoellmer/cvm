package com.welltestedlearning.cvm;

public enum CreamerOption {
    NONE, MILK, HALF_N_HALF;

    @Override
    public String toString() {
        String name = name().toString();

        StringBuilder properName = new StringBuilder();
        properName.append(Character.toUpperCase(name.charAt(0)));
        properName.append(name.substring(1).toLowerCase());

       if (name == "HALF_N_HALF") {
           return properName.replace(4, 8, " & H").toString();
       } else {
           return properName.toString();
       }
    }
}
