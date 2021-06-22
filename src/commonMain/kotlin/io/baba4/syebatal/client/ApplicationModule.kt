package io.baba4.syebatal.client

import com.soywiz.korge.scene.Module
import com.soywiz.korim.color.Colors
import com.soywiz.korinject.AsyncInjector
import com.soywiz.korma.geom.SizeInt
import io.baba4.syebatal.client.scenes.MainMenuScene
import io.baba4.syebatal.client.scenes.SettingsScene


object ApplicationModule : Module() {
    private const val WINDOW_WIDTH = 640
    private const val WINDOW_HEIGHT = 480
    private const val BACKGROUND_COLOR = "#2d2d2d"

    override val mainScene = MainMenuScene::class
    override val bgcolor = Colors[BACKGROUND_COLOR]
    override val size = SizeInt(WINDOW_WIDTH, WINDOW_HEIGHT)


    override suspend fun AsyncInjector.configure() {
        mapPrototype { MainMenuScene() }
        mapPrototype { SettingsScene() }
    }
}
