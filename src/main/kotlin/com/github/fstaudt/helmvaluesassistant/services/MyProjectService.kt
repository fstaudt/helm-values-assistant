package com.github.fstaudt.helmvaluesassistant.services

import com.intellij.openapi.project.Project
import com.github.fstaudt.helmvaluesassistant.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
