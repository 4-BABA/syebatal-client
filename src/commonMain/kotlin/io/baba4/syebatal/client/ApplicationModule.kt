package io.baba4.syebatal.client

import com.soywiz.korge.scene.Module
import com.soywiz.korim.color.Colors
import com.soywiz.korinject.AsyncInjector
import com.soywiz.korma.geom.SizeInt


object ApplicationModule : Module() {
    private const val WINDOW_WIDTH = 1280
    private const val WINDOW_HEIGHT = 720

    override val mainScene = MainMenuScene::class
    override val bgcolor = Colors["#2d2d2d"]
    override val size = SizeInt(WINDOW_WIDTH, WINDOW_HEIGHT)


    override suspend fun AsyncInjector.configure() {
        mapPrototype { MainMenuScene() }
    }
}
