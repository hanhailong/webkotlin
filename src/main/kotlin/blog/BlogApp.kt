package blog

import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.features.DefaultHeaders
import org.jetbrains.ktor.host.embeddedServer
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.logging.CallLogging
import org.jetbrains.ktor.netty.Netty
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.Routing
import org.jetbrains.ktor.routing.get
import org.jetbrains.ktor.routing.routing

/**
 * Created by hanhailong on 2017/8/8.
 */

//fun main(args: Array<String>) {
//    embeddedServer(Netty, 8080) {
//        routing {
//            get("/") {
//                call.respondText("My Example Blog", ContentType.Text.Html)
//            }
//        }
//    }.start(wait = true)
//}

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/") {
            call.respondText("My Example Blog2", ContentType.Text.Html)
        }
    }
}