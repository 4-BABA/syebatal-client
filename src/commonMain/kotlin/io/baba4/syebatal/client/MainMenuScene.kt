package io.baba4.syebatal.client

import com.soywiz.korge.view.View
import com.soywiz.korge.view.get
import com.soywiz.korge.view.onClick


class MainMenuScene : KTreeScene(kTreeName = "main_menu") {
    override suspend fun init(kTree: View) {
        val button = kTree["start_game"]
        button.onClick {
            println("-> Hello World!")
        }
    }
}
