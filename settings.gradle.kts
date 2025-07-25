pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
rootProject.name="MessengerApp2"
plugins {
    id("com.gradle.develocity") version "4.0.2"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2"
    
}

develocity {
    server = "https://ge.solutions-team.gradle.com/"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
} 
include (":core:push")
include (":core:contact")
include (":core:login")
include (":core:identity")
include (":core:checkout")
include (":core:cart")
include (":core:user")
include (":core:profile")
include (":core:feed")
include (":core:comment")
include (":core:post")
include (":core:search")
include (":core:location")
include (":feature:network")
include (":feature:sync")
include (":feature:share")
include (":feature:group")
include (":feature:message")
include (":feature:notification")
include (":feature:setting")
include (":feature:account")
include (":feature:session")
include (":feature:analytics")
include (":feature:report")
include (":feature:log")
include (":feature:status")
include (":feature:metric")
include (":feature:task")
include (":feature:calendar")
include (":feature:event")
include (":feature:alarm")
include (":feature:timer")
include (":feature:file")
include (":feature:document")
include (":feature:note")
include (":feature:todo")
include (":feature:list")
include (":feature:map")
include (":feature:weather")
include (":domain:forecast")
include (":repository:news")
include (":repository:article")
include (":repository:podcast")
include (":repository:video")
include (":repository:photo")
include (":repository:gallery")
include (":repository:media")
include (":repository:audio")
include (":repository:playlist")
include (":repository:push-contact")
include (":repository:contact-contact")
include (":repository:login-contact")
include (":repository:identity-contact")
include (":model:checkout-contact")
include (":model:cart-contact")
include (":model:user-contact")
include (":model:profile-contact")
include (":model:feed-contact")
include (":model:comment-contact")
include (":model:post-contact")
include (":model:search-contact")
include (":model:location-contact")
include (":model:network-contact")
include (":model:sync-contact")
include (":model:share-contact")
include (":model:group-contact")
include (":model:message-contact")
include (":model:notification-contact")
include (":model:setting-contact")
include (":model:account-contact")
include (":model:session-contact")
include (":model:analytics-contact")
include (":model:report-contact")
include (":model:log-contact")
include (":model:status-contact")
include (":model:metric-contact")
include (":model:task-contact")
include (":model:calendar-contact")
include (":model:event-contact")
include (":app:app")