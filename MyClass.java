package student;

public class MyClass {
    private String enrollno;
    private String resul;

    public String getEnrollno() {
        return enrollno;
    }

    public void setEnrollno(String enrollno) {
        this.enrollno = enrollno;
    }

    public String getResult() {
        return resul;
    }

    public void setResult(String resul) {
        this.resul = resul;
    }

    @Override
    public String toString() {
        return "Enrollment number = " + getEnrollno() + ", Result = " + getResult();
    }
}

