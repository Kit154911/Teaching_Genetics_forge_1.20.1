package net.kitbonga.teachinggenetics.client.gui;


import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import net.kitbonga.teachinggenetics.client.gui.pages.DomRec;
import net.kitbonga.teachinggenetics.client.gui.pages.EncyclopediaPage;
import net.kitbonga.teachinggenetics.client.gui.pages.PunettPage;
import net.kitbonga.teachinggenetics.init.TeachingGeneticsModScreens;
import net.kitbonga.teachinggenetics.world.inventory.GUUIMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

import net.minecraft.client.gui.Font;

public class GUUIScreen extends AbstractContainerScreen<GUUIMenu> implements TeachingGeneticsModScreens.ScreenAccessor {
    private final Level world;
    private final int x, y, z;
    private final Player entity;

    private static final ResourceLocation BOOK_BG = ResourceLocation.parse("teachinggenetics:textures/screens/minecraft_book_page.png");

    private List<EncyclopediaPage> pages;
    private int currentPage = 0;

    public GUUIScreen(GUUIMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
    }

    @Override
    public void updateMenuState(int elementType, String name, Object elementState) {}

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        guiGraphics.blit(BOOK_BG, this.leftPos + -60, this.topPos + -12, 0, 0, 292, 180, 292, 180);
        pages.get(currentPage).renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        pages.get(currentPage).renderLabels(guiGraphics, mouseX, mouseY);
    }

    @Override
    public void init() {
        super.init();
        pages = List.of(
                new DomRec(this, leftPos, topPos),
                new PunettPage(this, leftPos, topPos)
        );
        setupChrome();
        pages.get(currentPage).init();
    }

    private void setupChrome() {
        this.addRenderableWidget(Button.builder(Component.literal("<"), b -> previousPage())
                .bounds(this.leftPos + 10, this. topPos + 150, 20, 20).build());
        this.addRenderableWidget(Button.builder(Component.literal(">"), b -> nextPage())
                .bounds(this.leftPos + 146, this.topPos + 150, 20, 20).build());
    }

    private void previousPage() {
        if (currentPage > 0) {
            currentPage--;
            Minecraft.getInstance().execute(this::rebuildForNewPage);
        }
    }

    private void nextPage() {
        if (currentPage < pages.size() - 1) {
            currentPage++;
            Minecraft.getInstance().execute(this::rebuildForNewPage);
        }
    }



    private void rebuildForNewPage() {
        this.clearWidgets();
        setupChrome();
        pages.get(currentPage).init();
    }

    public <T extends AbstractWidget> T addPageWidget(T widget) {
        return this.addRenderableWidget(widget);
    }

    public Font getFont() {
        return this.font;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == 256) {
            this.minecraft.player.closeContainer();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }
}