package net.mcreator.myhero.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.myhero.world.inventory.EnchantsMenu;
import net.mcreator.myhero.network.EnchantsButtonMessage;
import net.mcreator.myhero.MyHeroMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EnchantsScreen extends AbstractContainerScreen<EnchantsMenu> {
	private final static HashMap<String, Object> guistate = EnchantsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_unbreaking;
	Button button_looting;
	Button button_sweeping;
	Button button_sharpness;
	Button button_mending;

	public EnchantsScreen(EnchantsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("my_hero:textures/screens/enchants.png");

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
		button_unbreaking = Button.builder(Component.translatable("gui.my_hero.enchants.button_unbreaking"), e -> {
			if (true) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new EnchantsButtonMessage(0, x, y, z));
				EnchantsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 1, this.topPos + 4, 77, 20).build();
		guistate.put("button:button_unbreaking", button_unbreaking);
		this.addRenderableWidget(button_unbreaking);
		button_looting = Button.builder(Component.translatable("gui.my_hero.enchants.button_looting"), e -> {
		}).bounds(this.leftPos + 7, this.topPos + 24, 61, 20).build();
		guistate.put("button:button_looting", button_looting);
		this.addRenderableWidget(button_looting);
		button_sweeping = Button.builder(Component.translatable("gui.my_hero.enchants.button_sweeping"), e -> {
		}).bounds(this.leftPos + 6, this.topPos + 44, 67, 20).build();
		guistate.put("button:button_sweeping", button_sweeping);
		this.addRenderableWidget(button_sweeping);
		button_sharpness = Button.builder(Component.translatable("gui.my_hero.enchants.button_sharpness"), e -> {
		}).bounds(this.leftPos + 4, this.topPos + 63, 72, 20).build();
		guistate.put("button:button_sharpness", button_sharpness);
		this.addRenderableWidget(button_sharpness);
		button_mending = Button.builder(Component.translatable("gui.my_hero.enchants.button_mending"), e -> {
		}).bounds(this.leftPos + 11, this.topPos + 83, 61, 20).build();
		guistate.put("button:button_mending", button_mending);
		this.addRenderableWidget(button_mending);
	}
}
