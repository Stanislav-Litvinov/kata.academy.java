package academy.kata.lesson7;

// 3.1.5 Практическое задание Метод getCallerClassAndMethodName()

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] tracer = new Exception().getStackTrace();
        if (tracer.length < 3) {
            return null;
        } else return tracer[2].getClassName() + "#" + tracer[2].getMethodName();
    }
}
