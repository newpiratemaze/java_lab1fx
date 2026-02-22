package Model;

public class ConverterModel
{
    public String convert(String value,String from, String to)
    {
        String result="";

        if(from  == "Нота")
        {
            if(to=="Гц")
            {
                switch(value)
                {
                    case "До":
                        result = "261.63";
                        break;
                    case "Ре":
                        result = "293.66";
                        break;
                    case "Ми":
                        result = "329.63";
                        break;
                    case "Фа":
                        result = "349.23";
                        break;
                    case "Соль":
                        result = "392.00";
                        break;
                    case "Ля":
                        result = "440.00";
                        break;
                    case "Си":
                        result = "493.88";
                        break;
                    default:
                        result = "Конвертация невозможна";
                        break;
                }
            }
            else if(to=="Длительность")
            {
                switch(value)
                {
                    case "До":
                        result = "1";
                        break;
                    case "Ре":
                        result = "1/4";
                        break;
                    case "Ми":
                        result = "1/16";
                        break;
                    case "Фа":
                        result = "1/32";
                        break;
                    case "Соль":
                        result = "Длительность зависит от темпа и ритмического рисунка";
                        break;
                    case "Ля":
                        result = "Длительность зависит от темпа и ритмического рисунка";
                        break;
                    case "Си":
                        result = "Длительность зависит от темпа и ритмического рисунка";
                        break;
                    default:
                        result = "Конвертация невозможна";
                        break;

                }
            }
            else if(to=="Нота")
            {
                return value;
            }
        }
        else if (from=="Гц")
        {
            if(to=="Нота")
            {
                switch(value)
                {
                    case "261.63":
                        result = "До";
                        break;
                    case "293.66":
                        result = "Ре";
                        break;
                    case "329.63":
                        result = "Ми";
                        break;
                    case "349.23":
                        result = "Фа";
                        break;
                    case "392.00":
                        result = "Соль";
                        break;
                    case "440.00":
                        result = "Ля";
                        break;
                    case "493.88":
                        result = "Си";
                        break;
                    default:
                        result = "Конвертация невозможна";
                        break;

                }
            }
            else if(to=="Длительность")
            {
                switch(value)
                {
                    case "261.63":
                        result = "1";
                        break;
                    case "293.66":
                        result = "1/4";
                        break;
                    case "329.63":
                        result = "1/16";
                        break;
                    case "349.23":
                        result = "1/32";
                        break;
                    case "392.00":
                        result = "Длительность зависит от темпа и ритмического рисунка";
                        break;
                    case "440.00":
                        result = "Длительность зависит от темпа и ритмического рисунка";
                        break;
                    case "493.88":
                        result = "Длительность зависит от темпа и ритмического рисунка";
                        break;
                    default:
                        result = "Конвертация невозможна";
                        break;
                }
            }
            else if(to=="Гц")
            {
                return value;
            }
        }
        else if(from=="Длительность")
        {
            if(to=="Нота")
            {
                switch(value)
                {
                    case "1":
                        result = "До";
                        break;
                    case "1/4":
                        result = "Ре";
                        break;
                    case "1/16":
                        result = "Ми";
                        break;
                    case "1/32":
                        result = "Фа";
                        break;
                    default:
                        result = "Конвертация невозможна";
                        break;
                }
            }
            else if(to=="Гц")
            {
                switch(value)
                {
                    case "1":
                        result = "261.63";
                        break;
                    case "1/4":
                        result = "293.66";
                        break;
                    case "1/16":
                        result = "329.63";
                        break;
                    case "1/32":
                        result = "349.23";
                        break;
                    default:
                        result = "Конвертация невозможна";
                        break;
                }
            }
            else if(to=="Длительность")
            {
                return value;
            }
        }

        return result;

    }

//    public void main()
//    {
//        ConverterModel model = new ConverterModel();
//
//        // Тест 1: 10 своих единиц  = 25.4 чужих единиц
//        double result1 = model.convert(10, "UNIT1", "UNIT2");
//        System.out.println("10 своих единиц = " + result1 + " чужих единиц");
//
//        // Тест 2: 100 чужих единиц = ? своих единиц
//        double result2 = model.convert(100, "UNIT2", "UNIT1");
//        System.out.println("100 своих единиц = " + result2 + " чужих единиц");
//
//        // Проверьте, что результаты соответствуют ожиданиям
//        if (Math.abs(result1 - 25.4) < 0.1) {
//            System.out.println("✅ Тест 1 пройден!!");
//        } else {
//            System.out.println("❌ Тест 1 не пройден!!");
//        }
//    }
}


