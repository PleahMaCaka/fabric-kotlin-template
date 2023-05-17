package io.github.techest.betacore.client

import io.github.techest.betacore.MODID
import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory

class BetaCoreClient : ClientModInitializer {

    val logger = LoggerFactory.getLogger(MODID)

    override fun onInitializeClient() {
        logger.info("Hello Fabric! from client")
    }

}
