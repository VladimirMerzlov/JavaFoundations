package exceptions;

public class MyFailed {
    private String name;
    private String cn = "Chuck Norris";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyFailed(String name) {
        this.name = name;
    }

    public void bestOfTheBest() throws MyException {
        if ((this.name).equals(cn)) {
            System.out.println("Самый крутой" + cn);
        } else {
            throw new MyException();
        }
    }
}
