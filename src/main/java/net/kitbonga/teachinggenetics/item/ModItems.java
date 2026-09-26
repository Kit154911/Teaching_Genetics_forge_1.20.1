package net.kitbonga.teachinggenetics.item;

import net.kitbonga.teachinggenetics.TeachingGenetics;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.kitbonga.teachinggenetics.world.inventory.GUUIMenu;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TeachingGenetics.MODID);

    public static final RegistryObject<Item> ENCYCLOPEDIA = ITEMS.register("encyclopedia",
            () -> new Item(new Item.Properties().stacksTo(1)) {
        @Override
        public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
            if (!level.isClientSide() && player instanceof ServerPlayer serverPlayer) {
                NetworkHooks.openScreen(serverPlayer, new SimpleMenuProvider(
                        (windowId, inventory, p) -> new GUUIMenu(windowId, inventory),
                        Component.translatable("item.teachinggenetics.encyclopedia")
                ));
            }
            return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
        }
    });
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
