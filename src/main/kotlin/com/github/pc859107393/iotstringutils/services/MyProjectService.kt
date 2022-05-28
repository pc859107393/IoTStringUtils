package com.github.pc859107393.iotstringutils.services

import com.intellij.openapi.project.Project
import com.github.pc859107393.iotstringutils.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
