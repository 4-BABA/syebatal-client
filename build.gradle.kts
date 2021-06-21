import com.soywiz.korge.gradle.*

plugins {
	kotlin("multiplatform") version "1.5.10"
	id("io.gitlab.arturbosch.detekt") version "1.17.1"
}

buildscript {
	val korgePluginVersion: String by project

	repositories {
		mavenLocal()
		maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
		maven { url = uri("https://plugins.gradle.org/m2/") }
		mavenCentral()
		google()
	}
	dependencies {
		classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
	}
}

apply<KorgeGradlePlugin>()

korge {
	id = "io.baba4.syebatal.client"
// To enable all targets at once

	//targetAll()

// To enable targets based on properties/environment variables
	//targetDefault()

// To selectively enable targets

	targetJvm()
	targetJs()
	targetDesktop()
	targetIos()
	targetAndroidIndirect() // targetAndroidDirect()
}


dependencies {
	detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.17.1")
}

detekt {
	toolVersion = "1.17.1"
	failFast = true
	buildUponDefaultConfig = true
	input = files("$projectDir/src/commonMain", "$projectDir/src/commonTest")
	config = files("$projectDir/config/detekt.yml")

	reports.html {
		enabled = true
		destination = file("$projectDir/reports/detekt.html")
	}
}
