package Exercise3;

public class Duck implements Animal{

    @Override
    public String walk() {
        return "duck-walking";
    }

    @Override
    public String talk() {
        return "duck-talking";
    }

    @Override
    public String eat() {
        return "duck-eating";
    }
}
