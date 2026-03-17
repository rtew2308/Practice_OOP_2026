## 🧪Pr_4 - Поліморфізм

## 📌 Мета роботи
- набуття практичних навичок розробки програм з використанням поліморфізму;
- вивчення особливостей перевантаження і перевизначення методів;
- ознайомлення із засобами форматованого виведення тексту до консолі;
- використання шаблону проектування Factory Method;
- використання модульного тестування.

## 🔄 Поліморфізм

ResultView view = factory.createView();
view.display(repository);

Метод викликається динамічно залежно від обраного класу.

## 💬 Діалоговий режим

Користувач вводить:
- кількість обчислень
- масу та швидкість
- тип відображення
- ширину колонок

## Структура проєкту
Pr_4
│
├── EnergyData4.java
├── KineticEnergySolver4.java
├── ResultRepository4.java
│
├── ResultView.java
├── TextResultView4.java
├── TableResultView4.java      // НОВИЙ клас таблиці
│
├── ViewFactory.java
├── TextViewFactory4.java
├── TableViewFactory4.java     // НОВА фабрика
│
├── ConsoleInterface4.java     // Діалоговий режим
├── TestRunner4.java
│
└── README.md