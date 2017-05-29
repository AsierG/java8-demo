import java.io.File;
import java.io.FileFilter;


public class FirstLambda {

    public static void main(String [] args){

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
               return pathname.getName().endsWith(".java");
            }
        };

        FileFilter filterLamda= (File pathname) ->
                pathname.getName().endsWith(".java");


        File dir = new File("d:/tmp");
//        File[] files = dir.listFiles(filter);
        File[] files = dir.listFiles(filterLamda);

        for(File f:files){
            System.out.print(f);
        }

    }

}
