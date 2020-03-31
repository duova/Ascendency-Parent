package com.gmail.andrewandy.ascendency.serverplugin.game.challenger;

import com.gmail.andrewandy.ascendency.lib.game.data.IChampionData;
import com.gmail.andrewandy.ascendency.serverplugin.game.ability.Ability;
import com.gmail.andrewandy.ascendency.serverplugin.game.rune.PlayerSpecificRune;

import java.util.List;

/**
 * Represents a champion which players can select.
 */
public interface Challenger {

    /**
     * Get the name of this challenger.
     *
     * @return The name of the challenger.
     */
    String getName();

    /**
     * Get this Challenger's runes
     *
     * @return Returns an array of this challenger's runes
     */
    PlayerSpecificRune[] getRunes();

    /**
     * Get the lore of this challenger.
     *
     * @return Returns the lore.
     */
    List<String> getLore();

    /**
     * Convert this champion into a serialisable data object.
     *
     * @return
     */
    IChampionData toData();

    /**
     * Get this Challenger's abilities
     *
     * @return Returns an array of this challenger's abilities
     */
    Ability[] getAbilities();

    /**
     * Calculate the damage which should be dealt based on incoming damage.
     *
     * @param baseDamage The magnitude of the incoming damage.
     * @return The modified damage based on abilities etc.
     */
    default double calculateDamage(double baseDamage) {
        return baseDamage;
    }
}
