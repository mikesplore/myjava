public static double min(double[]list) 
{
    double min=list[0];
    for (int i=1; i<list.length;i++){
        if (min>list[i])
        min=list[i];
    }
    return min;
    }

