package me.pessiuff.aillieth.mixin;

import me.pessiuff.aillieth.AilliethMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class AilliethMixin {
	@Inject(at = @At("HEAD"), method = "init()V")

	private void init(CallbackInfo info) {
		AilliethMod.LOGGER.info("Hello from Aillieth mod mixin!");
	}
}
