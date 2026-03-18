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
├── EnergyData4.java<br>
├── KineticEnergySolver4.java<br>
├── ResultRepository4.java<br>
├── ResultView.java<br>
├── TextResultView4.java<br>
├── TableResultView4.java      // НОВИЙ клас таблиці<br>
├── ViewFactory.java<br>
├── TextViewFactory4.java<br>
├── TableViewFactory4.java     // НОВА фабрика<br>
├── ConsoleInterface4.java     // Діалоговий режим<br>
├── TestRunner4.java<br>
└── README.md