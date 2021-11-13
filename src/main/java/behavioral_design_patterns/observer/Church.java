package behavioral_design_patterns.observer;

public interface Church {
    void registerParishioner(Parishioner parishioner);
    void notifyParishioners();
}
