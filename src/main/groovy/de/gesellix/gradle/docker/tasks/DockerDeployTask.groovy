package de.gesellix.gradle.docker.tasks

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DockerDeployTask extends AbstractDockerTask {

  private static Logger logger = LoggerFactory.getLogger(DockerDeployTask)

  @Input
  def imageName

  @TaskAction
  def deploy() {
    logger.info "running deploy..."
    dockerClient.pull(imageName)
  }
}
