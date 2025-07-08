package app;

public class FrontEndProgrammer extends Programmer{
    public FrontEndProgrammer(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Front-End Programmer";
    }
}
