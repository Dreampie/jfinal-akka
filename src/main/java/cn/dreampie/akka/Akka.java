package cn.dreampie.akka;

import akka.actor.ActorSystem;

/**
 * Created by wangrenhui on 14-5-6.
 */
public class Akka {

  /**
   * Retrieve the application Akka Actor system.
   * <p/>
   * Example:
   * {{{
   * val newActor = Akka.system.actorOf[Props[MyActor]]
   * }}}
   *
   * @return ActorSystem
   */
  public static ActorSystem system() {
    ActorSystem applicationSystem = AkkaPlugin.applicationSystem;
    if (applicationSystem == null) {
      throw new RuntimeException("Akka plugin is not registered.");
    }
    return applicationSystem;
  }
}
