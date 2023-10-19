package net.mcreator.myhero.client.gui;

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
		}).bounds(this.leftPos + 4, this.topPos + 17, 46, 20).build();

		guistate.put("button:button_item", button_item);
		this.addRenderableWidget(button_item);

		button_enchants = Button.builder(Component.translatable("gui.my_hero.createsion.button_enchants"), e -> {
		}).bounds(this.leftPos + 106, this.topPos + 16, 67, 20).build();

		guistate.put("button:button_enchants", button_enchants);
		this.addRenderableWidget(button_enchants);

		button_done = Button.builder(Component.translatable("gui.my_hero.createsion.button_done"), e -> {
		}).bounds(this.leftPos + 56, this.topPos + 60, 46, 20).build();

		guistate.put("button:button_done", button_done);
		this.addRenderableWidget(button_done);

	}

}
