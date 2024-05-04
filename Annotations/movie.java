public class MovieClass {
    @MethodInfo(
        director = "Valkov",
        date = "1996-05-03",
        description = "A movie about the nature in Strandzha",
        duration = 32.6,
        actors = {"Ivan Ivanov", "Rosen Velkov"}
    )
    public static void movieMethod1() {
        System.out.println("The movie...");
    }

    @MethodInfo(
        director = "Panayotov",
        date = "2021-06-03",
        description = "Hill mystery",
        duration = 65.1,
        actors = {"Bogomil Rusev"}
    )
    public static void movieMethod2() {
        System.out.println("Another movie...");
    }

    public static void main(String[] args) throws Exception {
        MethodInfo methodInfo1 = MovieClass.class.getMethod("movieMethod1").getAnnotation(MethodInfo.class);
        System.out.println("Movie 1:");
        printMovieInfo(methodInfo1);

        MethodInfo methodInfo2 = MovieClass.class.getMethod("movieMethod2").getAnnotation(MethodInfo.class);
        System.out.println("Movie 2:");
        printMovieInfo(methodInfo2);
    }

    private static void printMovieInfo(MethodInfo methodInfo) {
        System.out.println("Director: " + methodInfo.director());
        System.out.println("Date: " + methodInfo.date());
        System.out.println("Description: " + methodInfo.description());
        System.out.println("Duration: " + methodInfo.duration());
        System.out.println("Actors: " + String.join(", ", methodInfo.actors()));
        System.out.println();
    }
}
