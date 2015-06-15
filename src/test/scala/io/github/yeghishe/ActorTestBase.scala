package io.github.yeghishe

import akka.actor.ActorSystem
import akka.testkit.{ TestKit, ImplicitSender }
import org.scalatest.{ BeforeAndAfterAll, WordSpecLike, Matchers }

/**
 * Created by yeghishe on 6/15/15.
 */
abstract class ActorTestBase extends TestKit(ActorSystem())
    with ImplicitSender
    with WordSpecLike
    with Matchers
    with BeforeAndAfterAll {
  override protected def afterAll(): Unit = system.terminate()
}
