package com.cahrypt.me.soupsignsapi.data;

import org.bukkit.Material;
import org.bukkit.Sound;

public interface IDataManager {

    void setChangeIndicator(boolean change);

    void setDelayPerSoup(double delay);

    void setDelayBeforeRefillCooldown(double delay);

    void setRefillCooldown(double delay);

    void setIndicatorX(int x);

    void setIndicatorY(int y);

    void setIndicatorZ(int z);

    String translateCodes(String message);

    void setCooldownMessage(String message);

    void setFullInventoryMessage(String message);

    void setIndicatorMaterial(Material material);

    void setCooldownIndicatorMaterial(Material material);

    void setRefillSound(Sound sound);

    void reloadConfig();

    boolean canChangeIndicator();

    double getDelayPerSoup();

    double  getDelayBeforeRefillCooldown();

    double getRefillCooldown();

    int getIndicatorX();

    int getIndicatorY();

    int getIndicatorZ();

    String getCooldownMessage();

    String getFullInventoryMessage();

    Material getIndicatorMaterial();

    Material getCooldownIndicatorMaterial();

    Sound getRefillSound();
}
