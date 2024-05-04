package net.lpha.lphas_weaponry_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.lpha.lphas_weaponry_mod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class L_PhasWeaponryModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REINFORCED_IRON_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REINFORCED_IRON_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STEEL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STEEL_TRAPDOOR, RenderLayer.getCutout());

    }
}
