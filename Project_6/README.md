## 🧪Pr_6 - Паралельне виконання

## 📌 Мета роботи
- ознайомлення з методами управління задачами, що виконуються паралельно;
- реалізація та демонстрація механізму обслуговування черги задач;
- використання шаблонів Worker Thread, Command і Factory Method для реалізації паралельного виконання обробки колекції об'єктів;
- використання модульного тестування.

## ⚡ Паралельна обробка

Використано parallelStream():

- findMax()
- findMin()
- findAverage()

## 💬 Діалог

Користувач вводить:
- кількість задач
- масу
- швидкість

## 📊 Результат

Програма обчислює:
- максимальну енергію
- мінімальну енергію
- середнє значення

## Структура проєкту
Pr_6<br>
│<br>
├── EnergyData6.java<br>
├── KineticEnergySolver6.java<br>
├── ResultRepository6.java<br>
├── Command.java<br>
├── AddResultCommand6.java<br>
├── CommandManager6.java        // Singleton<br>
├── WorkerThread.java          // Worker Thread<br>
├── TaskQueue.java             // Черга задач<br>
├── ParallelProcessor6.java    // Паралельна обробка<br>
├── ConsoleInterface6.java<br>
├── TestRunner6.java<br>
└── README.md