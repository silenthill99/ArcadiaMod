package fr.silenthill99.arcadia_mod.data.tags;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class BlockTagsGenerator extends BlockTagsProvider {
    public BlockTagsGenerator(DataGenerator p_i48256_1_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_i48256_1_, Main.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        super.addTags();
    }
}
