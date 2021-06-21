package io.baba4.syebatal.client

import com.soywiz.korge.scene.Module
import com.soywiz.korim.color.Colors
import com.soywiz.korinject.AsyncInjector
import com.soywiz.korma.geom.SizeInt


object ApplicationModule : Module() {
    override val mainScene = MainMenuScene::class
    override val bgcolor = Colors["#2d2d2d"]
    override val size = SizeInt(1280, 720)

    override suspend fun AsyncInjector.configure() {
        mapPrototype { MainMenuScene() }
    }
}
