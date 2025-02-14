package task_11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoryStreamExample {

    public static List<String> listDirectory(String dir){
        List<String> pathsList = new ArrayList<>();
        Path path = Paths.get(dir);

        //Проверка директории и является ли он каталогом
        if (!Files.exists(path) || !Files.isDirectory(path)){
            System.out.println("Указанный путь не существует или не является каталогом: " + dir);
            return pathsList;
        }

        try (Stream<Path> pathStream = Files.walk(path)){
            pathsList = pathStream.map(Path::toAbsolutePath).map(Path::toString).collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Ошибка при обходе каталога: " + e.getMessage());
        }
        return pathsList;
    }


    public static void checkDirectory(){
        String directory = "C:/ВСГУТУ/Программная_инженерия/ЗБ762/Программирование_на_языке_Java/Глава_11/Вариант_3/";
        List<String> filePaths = listDirectory(directory);

        if (filePaths.isEmpty()){
            System.out.println("Каталог пуст или произошла ошибка при его обходе");
        } else {
            filePaths.forEach(System.out::println);
        }
    }
}
