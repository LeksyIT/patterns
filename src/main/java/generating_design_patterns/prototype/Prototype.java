package generating_design_patterns.prototype;

public class Prototype implements Copyable {
    public int value;
    public String name;

    public Prototype(int value,String name){
        this.value = value;
        this.name = name;
    }

    @Override
    public Copyable copy() {
        Prototype copy = new Prototype(this.value,this.name);
        return copy;
    }

}
