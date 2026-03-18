## 🧪Pr_5 - Обробка колекцій

## 📌 Мета роботи
- реалізація алгоритмів обробки колекції об'єктів;
- демонстрація можливості відокремлення об'єктів, що оброблюються, від методів обробки на прикладі реалізації алгоритмів обробки колекції об'єктів;
- використання шаблонів проектування Command, Singleton и Factory Method;
- використання модульного тестування.

## 🏭 Використані шаблони

- Command Pattern
- Singleton

## 🔄 Undo

Команди зберігаються в CommandManager (Singleton).  
Метод undo() відміняє останню команду.

## 🔁 Макрокоманда

MacroCommand виконує кілька команд одночасно.  
Undo виконує в зворотному порядку.

## 💬 Діалоговий режим

Користувач може:

- Додати результат
- Скасувати останню команду
- Показати результати
- Вийти

## Структура проєкту
Pr_5
│
├── EnergyData5.java<br>
├── KineticEnergySolver5.java<br>
├── ResultRepository5.java<br>
├── ResultView.java<br>
├── TextResultView5.java<br>
├── TableResultView5.java<br>
├── ViewFactory.java<br>
├── TextViewFactory5.java<br>
├── TableViewFactory5.java<br>
├── Command.java             // Інтерфейс команди<br>
├── AddResultCommand.java    // Конкретна команда<br>
├── MacroCommand.java        // Макрокоманда<br>
├── CommandManager.java      // Singleton для undo<br>
├── ConsoleInterface5.java<br>
├── TestRunner5.java<br>
└── README.md