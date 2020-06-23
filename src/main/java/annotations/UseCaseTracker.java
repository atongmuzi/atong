package annotations;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases,Class<?> cl){
        for(Method method:cl.getDeclaredMethods()){
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase!=null){
                System.out.println("Found Use Case " +
                        useCase.id() + "\n " + useCase.description());
               // useCases.remove(Integer.valueOf(useCase.id()));
            }

        }
        useCases.forEach(i ->
                System.out.println("Missing use case " + i));

    }

    public static void main(String[] args) {
        List<Integer> useCases = IntStream.range(47, 51)
                .boxed().collect(Collectors.toList());
        trackUseCases(useCases, PasswordUtils.class);
    }
}
