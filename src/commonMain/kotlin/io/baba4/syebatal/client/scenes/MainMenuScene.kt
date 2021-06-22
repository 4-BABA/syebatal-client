package io.baba4.syebatal.client.scenes

import com.soywiz.korge.view.View
import com.soywiz.korge.view.get
import com.soywiz.korge.view.onClick
import com.soywiz.korio.async.launchImmediately


class MainMenuScene : KTreeScene(kTreeName = "main_menu") {
    override suspend fun init(kTree: View) {
        kTree["btn_settings"].onClick {
            launchImmediately { sceneContainer.pushTo<SettingsScene>() }
        }
    }
}
