package behavioral_design_patterns.mediator;

public abstract class Mediator {

    public abstract void send(String message, Colleague sender);
}
