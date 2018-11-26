//Mir Shahiduzzaman
public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        boolean forward = true;
        int place = 0;

        for(int i = 0;i<numRows;i++)
        {
            if(forward)
            {
                for(int a = 0;a<numCols;a++)
                {
                    view[i][a] = scanned[place];
                    place++;
                }
                forward = false;
            }
            else
            {
                for(int a = numCols-1;a>=0;a--)
                {
                    view[i][a] = scanned[place];
                    place++;
                }
                forward = true;
            }
        }
    }

    public double getAverage(int startRow,int endRow,int startCol,int endCol)
    {
        double sum = 0.0;
        int nums = 0;

        for(int i = startRow;i<=endRow;i++)
        {
            for(int a = startCol;a<=endCol;a++)
            {
                sum+=view[i][a];
                nums++;
            }
        }

        return(sum/nums);
    }

    public String toString()
    {
        String out = "";

        for(int i = 0;i<view.length;i++)
        {
            for(int a = 0;a<view[i].length;a++)
            {
                out += view[i][a] + " ";
            }
            out += "\n";
        }
        return(out);
    }

}
