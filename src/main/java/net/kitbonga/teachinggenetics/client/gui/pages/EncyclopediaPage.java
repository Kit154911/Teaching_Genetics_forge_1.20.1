package net.kitbonga.teachinggenetics.client.gui.pages;

import net.kitbonga.teachinggenetics.client.gui.GUUIScreen;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;

public abstract class EncyclopediaPage {
    protected final GUUIScreen screen;
    protected final int leftPos, topPos;

    public EncyclopediaPage(GUUIScreen screen, int leftPos, int topPos) {
        this.screen = screen;
        this.leftPos = leftPos;
        this.topPos = topPos;
    }

    public void init() {} /* called once each time this page is active.
    add page specific buttons and widgets here */
    public void renderBackground(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {}
    /* updates every frame; draw page's pictures here */
    public void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {}
    /* updates every frame; draw page's text here */

    protected <T extends AbstractWidget> T addWidget(T widget) {
        return screen.addPageWidget(widget);
    }
}
