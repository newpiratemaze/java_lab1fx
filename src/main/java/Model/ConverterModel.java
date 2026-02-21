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

    public void main()
    {
        ConverterModel model = new ConverterModel();

        // Тест 1: 10 своих единиц  = 25.4 чужих единиц
        double result1 = model.convert(10, "UNIT1", "UNIT2");
        System.out.println("10 своих единиц = " + result1 + " чужих единиц");

        // Тест 2: 100 чужих единиц = ? своих единиц
        double result2 = model.convert(100, "UNIT2", "UNIT1");
        System.out.println("100 своих единиц = " + result2 + " чужих единиц");

        // Проверьте, что результаты соответствуют ожиданиям
        if (Math.abs(result1 - 25.4) < 0.1) {
            System.out.println("✅ Тест 1 пройден!!");
        } else {
            System.out.println("❌ Тест 1 не пройден!!");
        }
    }
}


