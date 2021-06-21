package io.baba4.syebatal.client

import com.soywiz.korge.scene.Scene
import com.soywiz.korge.view.Container
import com.soywiz.korge.view.get
import com.soywiz.korge.view.ktree.readKTree
import com.soywiz.korge.view.onClick
import com.soywiz.korio.file.std.resourcesVfs


class MainMenuScene : Scene() {
    override suspend fun Container.sceneInit() {
        val tree = resourcesVfs["main_menu.ktree"].readKTree(views)
        addChild(tree)

        val button = tree["start_game"]
        button.onClick {
            println("-> Hello World!")
        }
    }
}
