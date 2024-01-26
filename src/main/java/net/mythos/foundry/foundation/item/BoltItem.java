package net.mythos.foundry.foundation.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import team.lodestar.lodestone.handlers.ScreenshakeHandler;
import team.lodestar.lodestone.setup.LodestoneParticles;
import team.lodestar.lodestone.systems.rendering.particle.WorldParticleBuilder;
import team.lodestar.lodestone.systems.rendering.particle.data.ColorParticleData;
import team.lodestar.lodestone.systems.screenshake.ScreenshakeInstance;

import java.awt.*;
import java.util.Random;

public class BoltItem extends Item {

	public BoltItem(Settings settings) {
		super(settings);
	}

	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

		HitResult hit = user.raycast(8.0, 2F, false);
		Vec3d position = hit.getPos();

		Random rand = new Random();

		ScreenshakeHandler.addScreenshake(new ScreenshakeInstance(40).setIntensity(20, 5));

		WorldParticleBuilder
			.create(LodestoneParticles.STAR_PARTICLE)
			.setColorData(
				ColorParticleData.create(Color.YELLOW, Color.ORANGE).build()
			)
			.addMotion(
				rand.nextDouble(-.5, .5),
				rand.nextDouble(-.5, .5),
				rand.nextDouble(-.5, .5)
			)
			.setLifetime(40)
			.spawn(world, position.getX(), position.getY(), position.getZ());

		return TypedActionResult.pass(user.getMainHandStack());

	}

}
