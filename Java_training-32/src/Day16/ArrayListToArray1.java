package Day16;

import java.util.ArrayList;
import java.util.Arrays;

    public class ArrayListToArray1 {
        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Ram");
            arrayList.add("Krishna");
            arrayList.add("&&");

            // Convert ArrayList to Array
            String[] array = new String[arrayList.size()];

            // Display the converted array
            System.out.println("Converted Array:");
            for(int i=0;i<arrayList.size();i++){
                array[i]=arrayList.get(i);

            }

            System.out.println(Arrays.toString(array));
        }
    }


