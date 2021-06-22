package io.baba4.syebatal.client.scenes

import com.soywiz.korge.view.View
import com.soywiz.korge.view.get
import com.soywiz.korge.view.onClick
import com.soywiz.korio.async.launchImmediately


class SettingsScene : KTreeScene(kTreeName = "settings") {
	override suspend fun init(kTree: View) {
		kTree["btn_back"].onClick {
			launchImmediately { sceneContainer.back() }
		}
	}
}
