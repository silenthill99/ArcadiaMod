package fr.silenthill99.arcadia_mod.data.models_and_blockstates;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Locale;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    private void simpleItem(Item item, GeneratedOrHandheld generatedOrHandheld) {
        withExistingParent(item.getRegistryName().getPath(), mcLoc("item/" + generatedOrHandheld.name().toLowerCase(Locale.ROOT)))
                .texture("layer0", new ResourceLocation(Main.MODID, "item/" + item.getRegistryName().getPath()));
    }

    private enum GeneratedOrHandheld {
        GENERATED, HANDHELD
    }
}
