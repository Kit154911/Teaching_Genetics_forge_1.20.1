package net.kitbonga.teachinggenetics.client.gui.pages;

import net.kitbonga.teachinggenetics.client.gui.GUUIScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;

public class PunettPage extends EncyclopediaPage {
    public PunettPage(GUUIScreen screen, int leftPos, int topPos) {
        super(screen, leftPos, topPos);
    }

    @Override
    public void init() {
        addWidget(Button.builder(Component.literal("Try it"), button -> {
            //interaction logic goes here
            Minecraft.getInstance().getSoundManager().play(
                    SimpleSoundInstance.forUI(SoundEvents.CAT_AMBIENT, 1.0f)
            );
        }).bounds(leftPos +60, topPos + 70, 60, 20).build());
    }

    @Override
    public void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(screen.getFont(), Component.literal("An interactive page"), 20, 20, -12829636, false);
    }
}
