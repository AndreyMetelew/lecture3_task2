# lecture3_task2

Задание Лекции №3 от Y_LAB University, практическое задание №2 из лекций на JavaRush.

1. Класс Cat и статическая переменная catCount - Создать статическую переменную int catCount в классе Cat. 
Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1. 
2. Статические методы: int getCatCount() и setCatCount(int) - Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int), с помощью которых можно получить/изменить количество котов (переменную catCount) 
3. Класс Util - Реализовать статический метод double getDistance(x1, y1, x2, y2). 
Он должен вычислять расстояние между точками. 
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра 
4. Класс ConsoleReader - Сделать класс ConsoleReader, у которого будут 4 статических метода: 
String readString() – читает с клавиатуры строку 
int readInt() – читает с клавиатуры число 
double readDouble() – читает с клавиатуры дробное число 
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false 
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода 
5. Класс StringHelper - Cделать класс StringHelper, у которого будут 2 статических метода: 
String multiply(String s, int count) – возвращает строку, повторенную count раз. 
String multiply(String s) – возвращает строку, повторенную 5 раз. 
