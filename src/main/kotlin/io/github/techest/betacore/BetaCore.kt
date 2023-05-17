package io.github.techest.betacore

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MODID = "examplemod"

class BetaCore : ModInitializer {

    companion object {
        val logger: Logger = LoggerFactory.getLogger(MODID)
    }

    override fun onInitialize() {
        logger.info("Hello Fabric!")
    }

}