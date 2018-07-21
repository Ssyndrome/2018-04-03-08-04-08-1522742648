import java.io.File;
import java.io.FilenameFilter;

public class InputOutputFileSystem_2 {
    public static void main(String a[]){
        File file = new File("/home/students/");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".py")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
