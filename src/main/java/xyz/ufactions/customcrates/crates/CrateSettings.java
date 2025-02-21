package xyz.ufactions.customcrates.crates;

import org.bukkit.Material;
import org.bukkit.Sound;
import xyz.ufactions.customcrates.libs.F;
import xyz.ufactions.customcrates.libs.ItemBuilder;
import xyz.ufactions.customcrates.libs.RandomizableList;
import xyz.ufactions.customcrates.spin.Spin;

import java.util.List;
import java.util.Map;

public class CrateSettings {

    private final String identifier;
    private final String display;
    private final List<String> openCommands;
    private final Material block;
    private final Spin.SpinType spinType;
    private final long spinTime;
    private final Sound openingSound;
    private final Sound spinSound;
    private final Sound winSound;

    private final ItemBuilder key;

    private final ItemBuilder pouch;

    private final RandomizableList<Prize> prizes;

    private final Map<String, ItemBuilder> holographicItemMap;
    private final List<String> holographicLines;

    public CrateSettings(String identifier, String display, List<String> openCommands, Material block, Spin.SpinType spinType,
                         long spinTime, Sound openingSound, Sound spinSound, Sound winSound, ItemBuilder key, ItemBuilder pouch,
                         RandomizableList<Prize> prizes, Map<String, ItemBuilder> holographicItemMap, List<String> holographicLines) {
        this.identifier = identifier;
        this.display = F.color(display);
        this.openCommands = openCommands;
        this.block = block;
        this.spinType = spinType;
        this.spinTime = spinTime;
        this.openingSound = openingSound;
        this.spinSound = spinSound;
        this.winSound = winSound;
        this.key = key;
        this.pouch = pouch;
        this.prizes = prizes;
        this.holographicItemMap = holographicItemMap;
        this.holographicLines = holographicLines;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public String getDisplay() {
        return display;
    }

    public List<String> getOpenCommands() {
        return openCommands;
    }

    public Material getBlock() {
        return block;
    }

    public Spin.SpinType getSpinType() {
        return spinType;
    }

    public long getSpinTime() {
        return spinTime;
    }

    public Sound getOpeningSound() {
        return openingSound;
    }

    public Sound getSpinSound() {
        return spinSound;
    }

    public Sound getWinSound() {
        return winSound;
    }

    public ItemBuilder getKey() {
        return new ItemBuilder(key.build().clone());
    }

    public ItemBuilder getPouch() {
        return new ItemBuilder(pouch.build().clone());
    }

    public RandomizableList<Prize> getPrizes() {
        return prizes;
    }

    public Map<String, ItemBuilder> getHolographicItemMap() {
        return holographicItemMap;
    }

    public List<String> getHolographicLines() {
        return holographicLines;
    }
}