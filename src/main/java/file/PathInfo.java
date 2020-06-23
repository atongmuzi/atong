package file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo {
    static void show(String id,Object p){
        System.out.println(id+"："+p);
    }
    static void info(Path p){
        show("toString",p);
        show("Exists", Files.exists(p));
        show("RegularFile",Files.isRegularFile(p));
        show("Directory",Files.isDirectory(p));
        show("Absolute",p.isAbsolute());
        show("FileName",p.getFileName());
        show("Parent",p.getParent());
        show("Root",p.getRoot());
        System.out.println("*****************");
    }
    public static void main(String[] args) {
//        System.out.println(System.getProperty("os.name"));
//        info(Paths.get("C:", "path", "to", "nowhere", "NoFile.txt"));
        Path path = Paths.get("data","a.txt");
        System.out.println(path);
        info(path);
        Path ap = path.toAbsolutePath();
        System.out.println(ap);
    }
}
