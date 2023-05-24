import java.lang.reflect.Method;

import packageEx02.Service;
import packageEx02.printAnnotation;

public class Main {
    public Main() {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for(Method method : declaredMethods) {
            if(method.isAnnotationPresent(printAnnotation.class)) {
                printAnnotation pa = method.getAnnotation(printAnnotation.class);

                System.out.println("["+method.getName()+"] Running...");
                System.out.println("["+method.getName()+"] Num >> " + pa.number() + " ");
                System.out.println("["+method.getName()+"] Value >> " + pa.value());

                for(int i = 0; i < pa.number(); i++) {
                    System.out.println("[SYSTEM] Counting >> " + i + " ");
                }

                System.out.println();

                try {
                    method.invoke(new Service());
                } catch (Exception e) { System.out.println(e.getMessage()); }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}