// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNomu<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nomu"), "main");
	private final ModelPart fullbody;

	public ModelNomu(ModelPart root) {
		this.fullbody = root.getChild("fullbody");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fullbody = partdefinition.addOrReplaceChild("fullbody", CubeListBuilder.create(),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition head = fullbody.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition brain = head.addOrReplaceChild("brain",
				CubeListBuilder.create().texOffs(76, 62)
						.addBox(-5.0F, -48.0F, 5.0F, 7.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(134, 0)
						.addBox(-5.0F, -49.0F, 8.0F, 7.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(140, 40)
						.addBox(-6.0F, -48.0F, 9.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 144)
						.addBox(1.0F, -48.0F, 9.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = brain
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.85F, -48.0F, 6.0F, 2.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = brain
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -48.0F, 7.0F, 2.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition topjaw = jaw.addOrReplaceChild("topjaw",
				CubeListBuilder.create().texOffs(50, 6)
						.addBox(3.0F, -44.0F, 9.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-8.0F, -44.0F, 9.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 27)
						.addBox(-8.0F, -45.0F, 14.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 27)
						.addBox(3.0F, -45.0F, 14.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(3.0F, -45.0F, 14.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-4.0F, -44.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = topjaw
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(29, 78).addBox(-19.0F, -41.8F, 1.0F, 3.5F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r4 = topjaw
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(68, 91).addBox(-3.0F, -41.5F, 16.0F, 3.0F, 1.5F, 2.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = topjaw
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(67, 90).addBox(12.5F, -43.0F, 1.0F, 3.5F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r6 = topjaw.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(64, 15)
						.addBox(3.0F, -20.0F, 38.0F, 2.0F, 1.5F, 2.8F, new CubeDeformation(0.0F)).texOffs(64, 20)
						.addBox(-8.0F, -20.0F, 38.0F, 2.0F, 1.5F, 2.8F, new CubeDeformation(0.0F)).texOffs(50, 34)
						.addBox(3.0F, -22.0F, 39.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-8.0F, -22.0F, 39.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r7 = topjaw
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(19, 135).addBox(-4.0F, -44.0F, 1.0F, 2.0F, 2.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r8 = topjaw
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(139, 85).addBox(-1.0F, -44.0F, 0.0F, 2.0F, 2.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bottomjaw = jaw.addOrReplaceChild("bottomjaw",
				CubeListBuilder.create().texOffs(104, 42)
						.addBox(-8.0F, -42.0F, 9.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(29, 72)
						.addBox(-2.0F, -42.0F, 9.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 41)
						.addBox(-8.0F, -43.0F, 13.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 40)
						.addBox(-2.0F, -43.0F, 13.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 87)
						.addBox(-8.0F, -43.5F, 13.5F, 7.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(76, 77)
						.addBox(-2.0F, -43.5F, 13.5F, 7.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(-8.0F, -44.0F, 13.5F, 7.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(64, 14)
						.addBox(-8.0F, -43.5F, 13.3F, 7.0F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(62, 42)
						.addBox(-2.0F, -43.5F, 13.3F, 7.0F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(107, 133)
						.addBox(-4.0F, -41.0F, -1.0F, 5.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-4.0F, -42.0F, -1.0F, 5.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-4.0F, -41.5F, -1.0F, 5.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(133, 13)
						.addBox(-4.0F, -42.0F, 4.0F, 5.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bottomjaw.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(68, 118)
						.addBox(0.0F, -42.0F, 0.0F, 1.0F, 0.5F, 11.0F, new CubeDeformation(0.0F)).texOffs(108, 118)
						.addBox(0.0F, -41.5F, 0.0F, 1.0F, 0.5F, 11.0F, new CubeDeformation(0.0F)).texOffs(134, 27)
						.addBox(-4.0F, -41.0F, 0.0F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r10 = bottomjaw.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(94, 0)
						.addBox(-4.0F, -42.0F, 1.0F, 1.0F, 0.5F, 11.0F, new CubeDeformation(0.0F)).texOffs(28, 109)
						.addBox(-4.0F, -41.5F, 1.0F, 1.0F, 0.5F, 11.0F, new CubeDeformation(0.0F)).texOffs(130, 133)
						.addBox(-4.0F, -41.0F, 1.0F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone = bottomjaw.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(46, 90)
						.addBox(-8.0F, -41.0F, 9.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 90)
						.addBox(-2.0F, -41.0F, 9.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso = fullbody.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 27)
						.addBox(-11.0F, -46.0F, 18.0F, 19.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -41.0F, 15.0F, 18.0F, 13.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(62, 15)
						.addBox(-9.0F, -28.0F, 16.0F, 16.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = torso.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -35.0F, 5.0F));

		PartDefinition cube_r11 = bone5.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(45, 62)
						.addBox(-5.0F, -20.0F, 2.0F, 7.0F, 11.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(101, 49)
						.addBox(-8.0F, -18.0F, 4.0F, 13.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition arms = fullbody.addOrReplaceChild("arms", CubeListBuilder.create(),
				PartPose.offset(-25.0F, -8.0F, -5.0F));

		PartDefinition rightarm = arms.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(17.0F, -3.0F, -2.0F));

		PartDefinition bone16 = rightarm.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.1745F));

		PartDefinition cube_r12 = bone16
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(0, 53).addBox(-16.0F, -43.0F, 15.0F, 21.0F, 9.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bone14 = rightarm.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, -1.0F, 0.0F, -0.1848F, 0.1166F, 0.7309F));

		PartDefinition cube_r13 = bone14
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(102, 99).addBox(-16.0F, -43.0F, 15.0F, 18.0F, 9.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bone15 = rightarm.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-10.0F, -8.0F, 1.0F, -0.0934F, 0.1974F, 1.2997F));

		PartDefinition cube_r14 = bone15
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(46, 99).addBox(-16.0F, -43.0F, 15.5F, 18.0F, 9.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition leftarm = arms.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(32.0F, -3.0F, -2.0F));

		PartDefinition bone17 = leftarm.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, -0.1745F));

		PartDefinition cube_r15 = bone17
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(52, 43).addBox(-5.0F, -43.0F, 15.0F, 21.0F, 9.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone18 = leftarm.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, -1.0F, 0.0F, -0.1848F, -0.1166F, -0.7309F));

		PartDefinition cube_r16 = bone18
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(0, 90).addBox(-2.0F, -43.0F, 15.0F, 18.0F, 9.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone19 = leftarm.addOrReplaceChild("bone19", CubeListBuilder.create(),
				PartPose.offsetAndRotation(10.0F, -8.0F, 1.0F, -0.0934F, -0.1974F, -1.2997F));

		PartDefinition cube_r17 = bone19
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(83, 80).addBox(-2.0F, -43.0F, 15.5F, 18.0F, 9.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition legs = fullbody.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(50, 0).addBox(-9.0F,
				-15.0F, 16.0F, 16.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legright = legs.addOrReplaceChild("legright", CubeListBuilder.create(),
				PartPose.offset(-13.0F, -8.0F, -5.0F));

		PartDefinition bone6 = legright.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(80, 118).addBox(2.0F, -18.0F, 16.0F, 8.0F, 14.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone8 = legright.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(40, 118).addBox(1.0F, -5.0F, -24.0F, 8.0F, 14.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 12.0F, 4.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition bone9 = bone8
				.addOrReplaceChild("bone9",
						CubeListBuilder.create().texOffs(129, 70).addBox(1.0F, -8.0F, -23.5F, 8.0F, 3.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone10 = bone9
				.addOrReplaceChild("bone10",
						CubeListBuilder.create().texOffs(105, 27).addBox(1.0F, -19.0F, -23.0F, 8.0F, 2.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legleft = legs.addOrReplaceChild("legleft", CubeListBuilder.create(),
				PartPose.offset(-25.0F, -8.0F, -5.0F));

		PartDefinition bone7 = legleft.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 109).addBox(2.0F, -18.0F, 16.0F, 8.0F, 14.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone11 = legleft.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(106, 0).addBox(1.0F, -5.0F, -24.0F, 8.0F, 14.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 12.0F, 4.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition bone12 = bone11
				.addOrReplaceChild("bone12",
						CubeListBuilder.create().texOffs(120, 118).addBox(1.0F, -8.0F, -23.5F, 8.0F, 3.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone13 = bone12
				.addOrReplaceChild("bone13",
						CubeListBuilder.create().texOffs(0, 72).addBox(1.0F, -19.0F, -23.0F, 8.0F, 2.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		fullbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}