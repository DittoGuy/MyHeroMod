package net.mcreator.myhero.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.myhero.world.inventory.CreatesionMenu;
import net.mcreator.myhero.network.CreatesionButtonMessage;
import net.mcreator.myhero.MyHeroMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CreatesionScreen extends AbstractContainerScreen<CreatesionMenu> {
	private final static HashMap<String, Object> guistate = CreatesionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_item;
	Button button_enchants;
	Button button_done;

	public CreatesionScreen(CreatesionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("my_hero:textures/screens/createsion.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.my_hero.createsion.label_creation"), 57, 4, -6750208);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_item = Button.builder(Component.translatable("gui.my_hero.createsion.button_item"), e -> {
			if (true) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new CreatesionButtonMessage(0, x, y, z));
				CreatesionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 9, 46, 20).build();
		guistate.put("button:button_item", button_item);
		this.addRenderableWidget(button_item);
		button_enchants = Button.builder(Component.translatable("gui.my_hero.createsion.button_enchants"), e -> {
			if (true) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new CreatesionButtonMessage(1, x, y, z));
				CreatesionButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 29, 67, 20).build();
		guistate.put("button:button_enchants", button_enchants);
		this.addRenderableWidget(button_enchants);
		button_done = Button.builder(Component.translatable("gui.my_hero.createsion.button_done"), e -> {
			if (true) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new CreatesionButtonMessage(2, x, y, z));
				CreatesionButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 137, 46, 20).build();
		guistate.put("button:button_done", button_done);
		this.addRenderableWidget(button_done);
	}
}
