package com.mjr.extraplanets.moons.Oberon.worldgen.biomes;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.BiomeDictionary;

import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.moons.Oberon.worldgen.OberonBiomes;

public class BiomeGenOberonLargeMountain extends OberonBiomes {

	public BiomeGenOberonLargeMountain(BiomeProperties properties) {
		super(properties);
		BiomeDictionary.registerBiomeType(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SANDY);
		this.topBlock = Blocks.ICE.getDefaultState();
		this.fillerBlock = ExtraPlanets_Blocks.DENSE_ICE.getDefaultState();
	}
}
