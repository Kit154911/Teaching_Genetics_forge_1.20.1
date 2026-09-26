package net.kitbonga.teachinggenetics.init;

import net.kitbonga.teachinggenetics.TeachingGenetics;
import net.kitbonga.teachinggenetics.client.gui.GUUIScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = TeachingGenetics.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TeachingGeneticsModScreens {
    public interface ScreenAccessor {
        void updateMenuState(int elementType, String name, Object elementState);
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> MenuScreens.register(TeachingGeneticsModMenus.GUUI.get(), GUUIScreen::new));
    }
}
