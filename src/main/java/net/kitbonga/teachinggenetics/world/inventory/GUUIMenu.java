package net.kitbonga.teachinggenetics.world.inventory;

import net.kitbonga.teachinggenetics.TeachingGenetics;
import net.kitbonga.teachinggenetics.init.TeachingGeneticsModMenus;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GUUIMenu extends AbstractContainerMenu {
    public final Level world;
    public final int x, y, z;
    public final Player entity;

    public GUUIMenu(int id, Inventory inventory) {
        this(id, inventory, inventory.player.level(), 0, 0, 0, inventory.player);
    }

    public GUUIMenu(int id, Inventory inventory, Level world, int x, int y, int z, Player entity) {
          super(TeachingGeneticsModMenus.GUUI.get(), id);
          this.world = world;
          this.x = x;
          this.y = y;
          this.z = z;
          this.entity = entity;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }
}


