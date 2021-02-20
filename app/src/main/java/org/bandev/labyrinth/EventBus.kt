package org.bandev.labyrinth

sealed class Notify {
    data class ReturnProject(val project: Project) : Notify()
    data class ReturnFork(val forks: Int, val newProject: Project) : Notify()
    data class ReturnStar(val stars: Int, val positive: Boolean) : Notify()
    data class ReturnCommit(val commit: Commit) : Notify()
    data class ReturnAvatar(val url: String) : Notify()
    data class ReturnProjectStats(val projectStats: ProjectStats) : Notify()
}