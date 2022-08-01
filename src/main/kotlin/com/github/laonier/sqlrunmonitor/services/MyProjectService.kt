package com.github.laonier.sqlrunmonitor.services

import com.intellij.openapi.project.Project
import com.github.laonier.sqlrunmonitor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
