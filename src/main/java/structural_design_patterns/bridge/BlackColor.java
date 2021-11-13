package structural_design_patterns.bridge;

public class BlackColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling in black color");
    }
}
