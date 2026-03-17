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
KineticEnergyProject6/
│
├── EnergyData6.java
├── KineticEnergySolver6.java
├── ResultRepository6.java
│
├── Command.java
├── AddResultCommand6.java
│
├── CommandManager6.java        // Singleton
│
├── WorkerThread.java          // Worker Thread
├── TaskQueue.java             // Черга задач
│
├── ParallelProcessor6.java    // Паралельна обробка
│
├── ConsoleInterface6.java
├── TestRunner6.java
│
└── README.md