package fr.silenthill99.arcadia_mod.utils;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Main.MODID);

    public static final RegistryObject<SoundEvent> ON_M_APPELLE_FUZE_III = registerSoundEvent("on_m_appelle_fuze_iii");
    public static final RegistryObject<SoundEvent> ANTI_ANTI_FUZE = registerSoundEvent("anti_anti_fuze");
    public static final RegistryObject<SoundEvent> LA_ROULETTE_PALADIENNE = registerSoundEvent("la_roulette_paladienne");
    public static final RegistryObject<SoundEvent> KING_S_CASTLE = registerSoundEvent("king_s_castle");
    public static final RegistryObject<SoundEvent> EPIC_FANTASY = registerSoundEvent("epic-fantasy");
    public static final RegistryObject<SoundEvent> DEAD_FOREST = registerSoundEvent("dead-forest");
    public static final RegistryObject<SoundEvent> BLACK_MASS = registerSoundEvent("black-mass");
    public static final RegistryObject<SoundEvent> MUSIQUE_EPIQUE = registerSoundEvent("musique-epique");

    public static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Main.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
