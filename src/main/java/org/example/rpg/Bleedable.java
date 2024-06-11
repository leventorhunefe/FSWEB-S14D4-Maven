package org.example.rpg;

// İki ayrı parent class'ı extend edemeyiz
// Ancak birden fazla Interface'i extend edebiliriz

public interface Bleedable {
    public double bleed();
    public double bleed(int level);
}
