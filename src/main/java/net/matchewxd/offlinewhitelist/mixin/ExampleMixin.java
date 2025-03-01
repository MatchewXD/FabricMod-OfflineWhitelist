package net.matchewxd.offlinewhitelist.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.matchewxd.offlinewhitelist.OfflineWhitelist;

@Mixin(MinecraftServer.class)
public class ExampleMixin {

	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void onLoadWorld(CallbackInfo info) {
		OfflineWhitelist.LOGGER.info("OfflineWhitelist mixin loaded into MinecraftServer.loadWorld()");
	}
}
