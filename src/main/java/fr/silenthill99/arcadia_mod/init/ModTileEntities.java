package fr.silenthill99.arcadia_mod.init;


import fr.silenthill99.arcadia_mod.Main;
import fr.silenthill99.arcadia_mod.tileentity.TileEntityRedBlock;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Main.MODID);

    public static final RegistryObject<TileEntityType<?>> RED_BLOCK_TILE_ENTITY = TILE_ENTITY.register("red_block_tile_entity", () -> TileEntityType.Builder.of(TileEntityRedBlock::new, ModBlocks.RED_BLOCK.get()).build(null));

}
