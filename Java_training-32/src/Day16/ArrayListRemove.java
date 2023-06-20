package Day16;

import java.util.ArrayList;

public class ArrayListRemove
{
    public static void main(String[] args)
    {
        //create ArrayList

        ArrayList<String> arrayListColors= new ArrayList<String>();

        //add some elements

        arrayListColors.add("Red");
        arrayListColors.add("white");
        arrayListColors.add("Black");
        arrayListColors.add("Orange");

        /*To remove last element of ArrayList
     use remove method.*/

        if( arrayListColors.size() > 0 )
            arrayListColors.remove( arrayListColors.size() - 1 );

        //print ArrayList
        System.out.println(arrayListColors);

    }
}
