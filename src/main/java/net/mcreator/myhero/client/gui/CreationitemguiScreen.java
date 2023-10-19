package net.mcreator.myhero.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.myhero.world.inventory.CreationitemguiMenu;
import net.mcreator.myhero.network.CreationitemguiButtonMessage;
import net.mcreator.myhero.MyHeroMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CreationitemguiScreen extends AbstractContainerScreen<CreationitemguiMenu> {
	private final static HashMap<String, Object> guistate = CreationitemguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_iron_sword;
	Button button_shield;
	Button button_back;

	public CreationitemguiScreen(CreationitemguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("my_hero:textures/screens/creationitemgui.png");

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_iron_sword = Button.builder(Component.translatable("gui.my_hero.creationitemgui.button_iron_sword"), e -> {
			if (true) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new CreationitemguiButtonMessage(0, x, y, z));
				CreationitemguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 0, this.topPos + 5, 77, 20).build();
		guistate.put("button:button_iron_sword", button_iron_sword);
		this.addRenderableWidget(button_iron_sword);
		button_shield = Button.builder(Component.translatable("gui.my_hero.creationitemgui.button_shield"), e -> {
			if (true) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new CreationitemguiButtonMessage(1, x, y, z));
				CreationitemguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 0, this.topPos + 24, 56, 20).build();
		guistate.put("button:button_shield", button_shield);
		this.addRenderableWidget(button_shield);
		button_back = Button.builder(Component.translatable("gui.my_hero.creationitemgui.button_back"), e -> {
			if (true) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new CreationitemguiButtonMessage(2, x, y, z));
				CreationitemguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 81, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
