# Travel and Tourism Management System ✈️

A full-featured **Java desktop application** for managing travel agency operations — from user authentication and customer management to hotel booking, package selection, and payment processing.

---

## ✨ Features

- 🔐 **User Authentication** — Secure login, signup, and forgot password flows
- 🧑‍💼 **Customer Management** — Add, update, delete, and view customer records
- 🏨 **Hotel Booking** — Browse, check availability, and book hotels
- 📦 **Package Management** — View, check, and book travel packages
- 💳 **Payment Processing** — Multi-step payment handling (Payment51, Payment52)
- 📍 **Destination Explorer** — View travel destinations
- 📊 **Dashboard** — Centralized control panel for agency operations
- 🗃️ **Database Integration** — Persistent data storage via `DBConnection`
- ⏳ **Loading Screen** — Smooth app initialization with loading UI

---

## 🗂️ Project Structure

```
Travel-and-Tourism-Management-System/
├── icons/                      # Application icon assets
├── About.java                  # About screen
├── AddCustomer.java            # Add new customer form
├── BookHotel.java              # Hotel booking interface
├── BookPackage.java            # Package booking interface
├── Calculator.java             # Trip cost calculator
├── CheckHotels.java            # Hotel availability checker
├── CheckPackage.java           # Package availability checker
├── DBConnection.java           # Database connectivity layer
├── Dashboard.java              # Main dashboard / home screen
├── DeleteCustomer.java         # Customer deletion management
├── Destination.java            # Destination viewer
├── ForgotPassword.java         # Password recovery screen
├── Loading.java                # Application loading / splash screen
├── Login.java                  # User login screen
├── Payment.java                # Payment handler
├── Signup.java                 # New user registration
├── UpdateCustomer.java         # Customer update form
├── ViewBookedHotel.java        # View booked hotels
├── ViewCustomer.java           # View all customers
├── ViewPackage.java            # View all packages
└── temCodeRunnerFile.java      # Entry point / code runner
```

---

## 🚀 Quick Start

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A relational database (MySQL recommended)
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans)

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Travel-and-Tourism-Management-System.git
cd Travel-and-Tourism-Management-System
```

### 2. Configure the Database

Open `DBConnection.java` and update your credentials:

```java
String url = "jdbc:mysql://localhost:3306/your_database";
String user = "your_username";
String password = "your_password";
```

Then import the provided SQL schema into your database:

```bash
mysql -u your_username -p your_database < schema.sql
```

### 3. Compile and Run

**Using an IDE:** Open the project folder, set JDK, and run `temCodeRunnerFile.java`.

**Using the command line:**

```bash
javac *.java
java temCodeRunnerFile
```

---

## 🛠️ Built With

| Technology | Purpose |
|---|---|
| Java (Swing / AWT) | Desktop UI framework |
| JDBC | Database connectivity |
| MySQL | Relational database |
| Java I/O | File and data handling |

---

## 📸 Application Flow

```
Loading Screen → Login / Signup
      ↓
   Dashboard
      ↓
 ┌────────────────────────────────┐
 │  Customers  │  Hotels  │  Packages  │
 │  Add / View │  Book /  │  Book /    │
 │  Update /   │  Check   │  Check     │
 │  Delete     │  View    │  View      │
 └────────────────────────────────┘
      ↓
   Payment → Confirmation
```

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- Java Swing documentation and community resources
- Open-source JDBC MySQL connector contributors

---

⭐ If you found this project helpful, please give it a star!
