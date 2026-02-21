package Model;

public class ConverterModel
{
    public double convert(double value,String from, String to)
    {
        double result = 1;
        double coeff = 1;

        if(from =="UNIT1")
        {
            if(to=="UNIT2")
            {
                coeff = 2.54;
                result = value*coeff;
            }
            else if(to=="UNIT3")
            {
                coeff = 0.57;
                result = value*coeff;

            }
            else if(to=="UNIT1")
            {
                coeff = 1;
                result = value*coeff;

            }

        }
        else if(from == "UNIT2")
        {
            if(to=="UNIT1")
            {
                coeff = 1.25;
                result = value/coeff;
            }
            else if(to=="UNIT3")
            {
                coeff = 0.14;
                result = value*coeff;
            }
            else if(to=="UNIT2")
            {
                coeff = 1;
                result = value*coeff;

            }
        }
        else if(from == "UNIT3")
        {
            if(to=="UNIT1")
            {
                coeff = 0.57;
                result = value/coeff;
            }
            else if(to=="UNIT2")
            {
                coeff = 0.14;
                result = value/coeff;
            }
            else if(to=="UNIT3")
            {
                coeff = 1;
                result = value*coeff;

            }
        }

        return result;

    }
}


