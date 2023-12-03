package Task4;

import Task2.Anat;
import Task2.Calc;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<SomeClass> classClass = SomeClass.class;

        Method[] mts = classClass.getMethods();

        for (Method m:mts) {
            Annotation[] annotations = m.getAnnotations();

            for (Annotation a: annotations) {
                if (a instanceof Math fileInfo) {
                    int fop = fileInfo.num1();
                    int sop = fileInfo.num2();

                    //.invoke(new Calc(), fop, sop);
                    m.invoke(new SomeClass(), fop,sop);


                }
            }

        }

    }
}
