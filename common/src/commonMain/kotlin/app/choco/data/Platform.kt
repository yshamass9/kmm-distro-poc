package app.choco.data

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform