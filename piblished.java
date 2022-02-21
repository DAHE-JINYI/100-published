import java.io.IOError;
import java.io.IOException;

public class piblished{
    public static void main(String[] args) throws IOException{
        /**
         * 100个不美观就10个
         */
        for( int i = 1; i < 10; i++ ){
           for( int j = 1; j < 10; j++ ){
            if( i >= j ){
                //这里要注意“ print ” 是不 print “ ln “ 复数
                System.out.print(i+"*"+j+"="+i*j+" ");
            
            }
           }
           //这里这个显示是换行的意思
           System.out.println();
        }
        
    }
}