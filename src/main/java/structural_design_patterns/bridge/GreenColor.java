package structural_design_patterns.bridge;

public class GreenColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling in green color");
    }
}
