package Task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        Class<Calc> calcObj = Calc.class;

        Method[] classMethods = calcObj.getMethods();

        for (Method method: classMethods) {
            try {
                workWithAnnotation(method);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }




    }

    //static HashMap<String, Double> workWithAnnotation(Method element) {
    static void workWithAnnotation(Method element) throws InvocationTargetException, IllegalAccessException {


        Annotation[] annotations = element.getAnnotations();
        for (Annotation a : annotations) {


            if (a instanceof Anat fileInfo) {
                double fop = fileInfo.op1();
                double sop = fileInfo.op2();

                element.invoke(new Calc(), fop, sop);


            }


        }

        //return retMap;
    }
}