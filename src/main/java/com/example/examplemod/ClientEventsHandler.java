package com.example.examplemod;

import com.github.wintersteve25.tau.renderer.ScreenUIRenderer;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ClientEventsHandler {
    @SubscribeEvent
    public static void onKeyPress(InputEvent.Key evt) {
        if (evt.getKey() == GLFW.GLFW_KEY_COMMA) {
            Minecraft.getInstance().setScreen(new ScreenUIRenderer(new ExampleUI()));
        }
    }
}
