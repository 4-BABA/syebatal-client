package io.baba4.syebatal.client.scenes

import com.soywiz.korge.scene.Scene
import com.soywiz.korge.view.Container
import com.soywiz.korge.view.View
import com.soywiz.korge.view.ktree.readKTree
import com.soywiz.korio.file.std.resourcesVfs


abstract class KTreeScene(
    private val kTreeName: String
) : Scene() {
    abstract suspend fun init(kTree: View)

    override suspend fun Container.sceneInit() {
        val tree = resourcesVfs["scenes/$kTreeName.ktree"].readKTree(views)
        addChild(tree)
        init(tree)
    }
}
