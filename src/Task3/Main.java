package Task3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Annotation[] clAt = Son.class.getAnnotations();

        for (Annotation a:clAt) {
            System.out.println(a);
        }
        
    }
}
