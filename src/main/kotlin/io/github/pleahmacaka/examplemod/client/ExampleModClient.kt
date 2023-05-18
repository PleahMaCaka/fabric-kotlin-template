package io.github.pleahmacaka.examplemod.client

import io.github.pleahmacaka.examplemod.ExampleMod
import net.fabricmc.api.ClientModInitializer

object ExampleModClient : ClientModInitializer {

    private val logger = ExampleMod.logger

    override fun onInitializeClient() {
        logger.info("Hello Fabric! from client")
    }

}
