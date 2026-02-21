import Model.*;

void main()
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
        System.out.println("✅ Тест 1 пройден!");
    } else {
        System.out.println("❌ Тест 1 не пройден!");
    }
}
