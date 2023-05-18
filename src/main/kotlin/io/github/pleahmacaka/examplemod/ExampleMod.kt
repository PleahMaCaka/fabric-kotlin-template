package io.github.pleahmacaka.examplemod

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MODID = "examplemod"

object ExampleMod : ModInitializer {

    val logger: Logger = LoggerFactory.getLogger(MODID)

    override fun onInitialize() {
        logger.info("Hello Fabric!")
    }

}
