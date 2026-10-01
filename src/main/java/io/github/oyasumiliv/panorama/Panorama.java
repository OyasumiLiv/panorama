package io.github.oyasumiliv.panorama;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(Panorama.MODID)
public class Panorama {
    public static final String MODID = "panorama";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Panorama(IEventBus modEventBus, ModContainer modContainer) {
    }
}
