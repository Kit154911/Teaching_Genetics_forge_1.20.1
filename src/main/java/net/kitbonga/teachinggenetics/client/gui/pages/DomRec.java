package net.kitbonga.teachinggenetics.client.gui.pages;

import com.mojang.blaze3d.systems.RenderSystem;
import net.kitbonga.teachinggenetics.client.gui.GUUIScreen;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class DomRec extends EncyclopediaPage{
    private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("teachinggenetics:textures/screens/arrow.png");
    private static final ResourceLocation IMAGE_2 = ResourceLocation.parse("teachinggenetics:textures/screens/bracket.png");

    public DomRec(GUUIScreen screen, int leftPos, int topPos) {
        super(screen, leftPos, topPos);
    }

    @Override
    public void renderBackground(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        guiGraphics.blit(IMAGE_1, leftPos +34, topPos + 109, 0,0, 16, 16, 16, 16);
        guiGraphics.blit(IMAGE_2, leftPos -25, topPos + 103, 0, 0, 32, 32, 32, 32);
    }

    @Override
    public void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        var font = screen.getFont();
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_a"), -45, 5, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_b"), -45, 13, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_c"), -45, 22, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_d"), -45, 30, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_e"), -45, 39, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_f"), -45, 52, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_g"), -45, 62, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_h"), -45, 75, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_i"), -45, 84, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_j"), -32, 99, -52429, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_k"), 1, 98, -52429, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_l"), 36, 98, -52429, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_m"), -33, 124, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_n"), 17, 124, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_o"), -45, 5, -13395457, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_p"), -45, 22, -13395457, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_q"), 51, 62, -52429, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_r"), 48, 84, -52429, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_s"), 92, 4, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_t"), 92, 12, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_u"), 92, 20, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_v"), 92, 29, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_w"), 92, 38, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_x"), 92, 46, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_y"), 92, 57, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_z"), 92, 65, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_aa"), 92, 77, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_ab"), 92, 86, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_ac"), 92, 95, -12829636, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_ad"), 142, 38, -13395457, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_ae"), 92, 46, -13395457, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_af"), 92, 57, -52429, false);
        guiGraphics.drawString(font, Component.translatable("gui.teachinggenetics.guui.label_ag"), 92, 77, -52429, false);
    }
}
