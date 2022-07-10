package com.cahrypt.me.soupsignsapi.manager;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public interface ISoupManager {

    boolean hasIntervalDelay(Player player);

    boolean hasRefillCooldownDelay(Player player);

    boolean hasRefillCooldown(Player player);

    double getRefillCooldownTime(Player player);

    void addIntervalDelay(Player player);

    void addRefillCooldownDelay(Player player, Sign sign);

    void resetRefillCooldownDelay(Player player, Sign sign);

    void sendIndicatorChange(Player player, Block supportingBLock, Material change);
}
