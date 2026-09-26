package net.kitbonga.teachinggenetics.client.gui;


import com.mojang.blaze3d.systems.RenderSystem;
import net.kitbonga.teachinggenetics.init.TeachingGeneticsModScreens;
import net.kitbonga.teachinggenetics.world.inventory.GUUIMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

import java.awt.*;

public class GUUIScreen extends AbstractContainerScreen<GUUIMenu> implements TeachingGeneticsModScreens.ScreenAccessor {
    private final Level world;
    private final int x, y, z;
    private final Player entity;
    private boolean menuStateUpdateActive = false;
    private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("teachinggenetics:textures/screens/minecraft_book_page.png");
    private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("teachinggenetics:textures/screens/arrow.png");
    private static final ResourceLocation IMAGE_2 = ResourceLocation.parse("teachinggenetics:textures/screens/bracket.png");

    public GUUIScreen(GUUIMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
    }

    @Override
    public void updateMenuState(int elementType, String name, Object elementState) {
        menuStateUpdateActive = true;
        menuStateUpdateActive = false;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        guiGraphics.blit(IMAGE_0, this.leftPos + -60, this.topPos + -12, 0, 0, 292, 180, 292, 180);
        guiGraphics.blit(IMAGE_1, this.leftPos + 34, this.topPos + 109, 0, 0, 16, 16, 16 ,16);
        guiGraphics.blit(IMAGE_2, this.leftPos -25, this.topPos + 103, 0, 0, 32, 32, 32, 32);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == 256) {
            this.minecraft.player.closeContainer();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_a"), -45, 5, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_b"), -45, 13, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_c"), -45, 22, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_d"), -45, 30, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_e"), -45, 39, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_f"), -45, 52, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_g"), -45, 62, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_h"), -45, 75, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_i"), -45, 84, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_j"), -32, 99, -52429, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_k"), 1, 98, -52429, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_l"), 36, 98, -52429, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_m"), -33, 124, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_n"), 17, 124, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_o"), -45, 5, -13395457, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_p"), -45, 22, -13395457, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_q"), 51, 62, -52429, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_r"), 48, 84, -52429, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_s"), 92, 4, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_t"), 92, 12, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_u"), 92, 20, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_v"), 92, 29, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_w"), 92, 38, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_x"), 92, 46, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_y"), 92, 57, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_z"), 92, 65, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_aa"), 92, 77, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_ab"), 92, 86, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_ac"), 92, 95, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_ad"), 142, 38, -13395457, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_ae"), 92, 46, -13395457, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_af"), 92, 57, -52429, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.teachinggenetics.guui.label_ag"), 92, 77, -52429, false);
    }

    @Override
    public void init(){
        super.init();
    }
}
