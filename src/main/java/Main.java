import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        ArrayList<Integer> listInteger = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            listInteger.add(random.nextInt(20)+1);
        }
        System.out.println("Коллекция целых чисел");
        System.out.println(listInteger.toString());
        Iterator<Integer> listIterator = listInteger.iterator();
        while(listIterator.hasNext())
        {
            if(listIterator.next()%2==1)
            {
                listIterator.remove();
            }
        }
        System.out.println("Коллекция после удаление через итератор");
        System.out.println(listInteger.toString());
    }
}
