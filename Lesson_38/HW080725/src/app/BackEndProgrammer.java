package app;

public class BackEndProgrammer extends Programmer{
    public BackEndProgrammer(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Back-End Programmer";
    }
}
