import com.soywiz.korge.*
import io.baba4.syebatal.client.ApplicationModule

suspend fun main() =
	Korge(config = Korge.Config(module = ApplicationModule))
