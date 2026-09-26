package net.kitbonga.teachinggenetics.init;

import net.kitbonga.teachinggenetics.TeachingGenetics;
import net.kitbonga.teachinggenetics.world.inventory.GUUIMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TeachingGeneticsModMenus {
    public static final DeferredRegister<MenuType<?>> REGISTRY =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, TeachingGenetics.MODID);
    public static final RegistryObject<MenuType<GUUIMenu>> GUUI = REGISTRY.register("guui",
            () -> IForgeMenuType.create((windowId, inv, data) -> new GUUIMenu(windowId, inv)));
    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
