package net.lpha.lphas_weaponry_mod;

import net.fabricmc.api.ModInitializer;

import net.lpha.lphas_weaponry_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class L_PhasWeaponryMod implements ModInitializer {
	public static final String MOD_ID = "lphas_weaponry_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}