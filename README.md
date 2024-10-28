# Calculator Application (MVC Pattern)

## Описание  
Это простой **калькулятор**, реализованный с использованием паттерна **MVC (Model-View-Controller)**. Приложение выполняет базовые арифметические операции, такие как:  
- **Сложение** (+)  
- **Вычитание** (-)  
- **Умножение** (*)  
- **Деление** (/)

Программа разделена на три компонента:
1. **Model** – выполняет вычисления и хранит логику.
2. **View** – отображает интерфейс и взаимодействует с пользователем.
3. **Controller** – управляет передачей данных между моделью и представлением.

---

## Функционал  
### Операции:
1. **Сложение**  
2. **Вычитание**  
3. **Умножение**  
4. **Деление** с обработкой ошибки на ноль

### Пользовательский интерфейс:
- **Два поля для ввода чисел**
- **Кнопки операций**: +, -, *, /  
- **Поле вывода результата**

### Обработка ошибок:
- При **делении на ноль** отображается сообщение:  
Ошибка: деление на ноль
- При **неправильном вводе** (например, текст вместо чисел) выводится сообщение об ошибке.

---

## Структура проекта  

```plaintext
CalculatorApp/
├── Controller/
│   └── CalculatorController.java
├── Model/
│   └── CalculatorModel.java
├── View/
│   └── CalculatorView.java
└── Main.java
```
---

## Пример использования  
1. **Введите два числа.**  
2. **Нажмите на одну из кнопок** (+, -, *, /).  
3. **Результат сразу отобразится на экране.**
---

## Кодовые блоки
### Пример метода сложения из модели:
```java
public double add(double a, double b) {
    return a + b;
}
```
### Пример обработки события в контроллере:
```java
@Override
public void actionPerformed(ActionEvent e) {
    try {
        double num1 = view.getFirstNumber();
        double num2 = view.getSecondNumber();
        double result = model.add(num1, num2);
        view.setResult(String.valueOf(result));
    } catch (Exception ex) {
        view.setResult("Ошибка: Неверный ввод");
    }
}
```
---

## Установка и запуск
### Склонируйте репозиторий:
```bash
git clone https://github.com/your-username/CalculatorApp.git
```
### Перейдите в папку проекта:
```bash
cd CalculatorApp
```

### Соберите и запустите проект:
```bash
javac Main.java
java Main
```

### Требования
- JDK 11+
- IDE: IntelliJ IDEA или любая другая поддерживающая Java

### Контрибьюторы
- Marden Aruzhan
