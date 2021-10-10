package ru.mephi.hm2;
import ru.mephi.hm1.MyList;
public class prog1 {
    public static MyList merge(MyList first,MyList second) {
        MyList newList = new MyList();
        Object firstValue = null;
        Object secondValue = null;
        int firstIndex = 0;
        int secondIndex = 0;
        while(first.size() > firstIndex || second.size() > secondIndex ) {
            if (firstValue == null)
            {
                while(first.get(firstIndex)==null && firstIndex<first.size())
                {
                    firstIndex++;
                }

                if( first.get(firstIndex)!=null)
                {
                    firstValue = first.get(firstIndex);
                }
            }

            if (secondValue == null)
            {
                while(second.get(secondIndex)==null && secondIndex<second.size())
                {
                    secondIndex++;
                }

                if( second.get(secondIndex)!=null)
                {
                    secondValue = second.get(secondIndex);
                }
            }
            if(firstValue==null && secondValue==null)break;
            if(secondValue!=null && firstValue!=null)
            {
                int s = (int)secondValue;
                int f = (int)firstValue;
                if(s>f) {
                    newList.add(f);
                    firstValue=null;
                    firstIndex++;
                    continue;
                }
                else{
                    newList.add(s);
                    secondValue=null;
                    secondIndex++;
                    continue;
                }
            }
            if(firstValue==null)
            {
                int s = (int)secondValue;
                newList.add(s);
                secondValue=null;
                secondIndex++;
            }
            else
            {
                int f = (int)firstValue;
                newList.add(f);
                firstValue=null;
                firstIndex++;
            }

        }
        return newList;
    }

    public static void main(String arg[])
    {
        MyList abc = new MyList();
        MyList cba = new MyList();
        MyList f;
        abc.add(1);
        abc.add(2);
        abc.add(3);
        cba.add(2);
        cba.add(4);
        cba.add(5);
        abc.printf();
        cba.printf();
        f = merge(abc, cba);
        f.printf();
    }
}
