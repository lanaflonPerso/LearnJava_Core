package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ExamplePaths {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------
        // относительнui path
        Path path = Paths.get("src/main/resources/nio/Example.txt");
        System.out.println(path.getFileName());
        System.out.println(path.isAbsolute());

        // абсолютнui path
        Path path1 = Paths.get("/src/main/resources/nio");
        System.out.println(path1.isAbsolute());
//--------------------------------------------------------------------------------------------------------------------
    }
}

/*
----------------------------------------------------------------------------------------------------------------------
Следует, однако, иметь в виду, что создание объекта типа Path не приво·
дит к открытию или созданию файла. Вместо этого лишь создается объект, инкап·
сулирующий путь к каталогу, в котором находится файл.
----------------------------------------------------------------------------------------------------------------------
*/
