package configuration

object Application {

    const val VersionCode = 1
    const val VersionName = "0.1"
    const val Id = "bluevelvet.blueprint.hilt"

    object DEVELOPMENT {
        const val BuildName = "debug"
        const val EndPoint = "\"https://mortitech.com/api/blueprint/online-shopping/dev\""
        const val Icon = "@mipmap/ic_launcher"
        const val ApplicationIdSuffix = ".dev"
    }

    object ACCEPTANCE {
        const val BuildName = "acceptance"
        const val EndPoint = "\"https://mortitech.com/api/blueprint/online-shopping/acceptance\""
        const val Icon = "@mipmap/ic_launcher"
        const val ApplicationIdSuffix = ".acc"
    }

    object RELEASE {
        const val BuildName = "release"
        const val EndPoint = "\"https://mortitech.com/api/blueprint/online-shopping/prod\""
        const val Icon = "@mipmap/ic_launcher"
    }
}
