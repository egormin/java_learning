# Создание простейшей программы:

1.	Создать файл xxx.java с содержимым:

```
public class xxx {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```
Имя файла и имя класса должны совпадать!!!

2. `javac xxx` – скомпилируем. Появится java.class файл.
3. `java xxx`  – запустим.

Далее можно запаковать готовый класс xxx с помощью jar (java archive):
- `jar cfe Hello.jar Hello xxx.class`

где `jar cfe` – команда, `Hello.jar` – имя архива, `Hello` – имя класса в архиве, `xxx.class` – класс, который хотим запаковать. Появится файл `Hello.jar`.

- `jar tf Hello.jar` - чтобы посмотреть содержимое данного архива, используется команда. Содержимое будет следующее: META-INF/MANIFEST.MF (имя класса, версия и кем создан), xxx.class
- `zipinfo Hello.jar` - тоже посмотреть.
- `jar xf Hello.jar` – распаковать содержимое данного архива.
