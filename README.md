✈️ Travel and Tourism Management System
�
�
�
�
Load image
Load image
Load image
Load image
A console-based Java application for managing travel agency operations — customer records, hotel bookings, travel packages, payments, and more.
📌 Table of Contents
About
Features
Project Structure
Tech Stack
Prerequisites
Installation
Database Setup
Running the Application
Contributing
License
📖 About
The Travel and Tourism Management System is a Java-based application built to streamline the operations of a travel agency. It supports full customer lifecycle management, travel package and hotel booking, payment tracking, and destination browsing — all backed by a relational MySQL database via JDBC.
✨ Features
Module
Description
🔐 Authentication
Login, Signup, Forgot Password
🏠 Dashboard
Central navigation hub
👤 Customer Management
Add, View, Update, Delete customers
🌍 Destinations
Browse and manage travel destinations
📦 Packages
Book and check available travel packages
🏨 Hotels
Book hotels and view reservations
💳 Payments
Process and track payments
🧮 Calculator
Estimate travel costs
ℹ️ About
Agency and application information
📁 Project Structure
Travel-and-Tourism-Management-System/
│
├── src/
│   ├── About.java                  # About/info screen
│   ├── AddCustomer.java            # Add new customer
│   ├── BookHotel.java              # Hotel booking
│   ├── Bookpackage.java            # Travel package booking
│   ├── Calculator.java             # Cost estimator
│   ├── CheckHotels.java            # Browse available hotels
│   ├── CheckPackage.java           # Browse available packages
│   ├── DBConnection.java           # JDBC database handler
│   ├── Dashboard.java              # Main menu/dashboard
│   ├── DeleteCustomer.java         # Remove customer records
│   ├── Destination.java            # Destination listing
│   ├── ForgotPassword.java         # Password recovery
│   ├── Loading.java                # Splash/loading screen
│   ├── Login.java                  # User authentication
│   ├── Payment.java                # Payment processing
│   ├── Signup.java                 # New user registration
│   ├── UpdateCustomer.java         # Edit customer details
│   ├── ViewBookedHotel.java        # View hotel reservations
│   ├── ViewCustomer.java           # List all customers
│   └── ViewPackage.java            # List all packages
│
├── database/
│   └── travel_db.sql               # MySQL schema + seed data
│
└── README.md
🛠️ Tech Stack
Language: Java (JDK 8+)
Database: MySQL 8.0+
Connectivity: JDBC (MySQL Connector/J)
IDE: IntelliJ IDEA / Eclipse / NetBeans
✅ Prerequisites
Make sure the following are installed on your machine:
Java JDK 8+
MySQL Server 8.0+
MySQL Connector/J (JDBC Driver)
Any Java IDE or terminal with javac
📥 Installation
1. Clone the repository
git clone https://github.com/your-username/Travel-and-Tourism-Management-System.git
cd Travel-and-Tourism-Management-System
2. Add the JDBC driver to your classpath
Download mysql-connector-j-x.x.x.jar and place it in a /lib folder, then include it when compiling:
javac -cp ".;lib/mysql-connector-j-x.x.x.jar" src/*.java
On macOS/Linux, replace ; with :
🗄️ Database Setup
1. Open MySQL and run the schema:
mysql -u root -p < database/travel_db.sql
2. Update DBConnection.java with your credentials:
private static final String URL      = "jdbc:mysql://localhost:3306/travel_db";
private static final String USER     = "root";
private static final String PASSWORD = "your_password_here";
▶️ Running the Application
# Compile all source files
javac -cp ".;lib/mysql-connector-j-x.x.x.jar" src/*.java

# Run the application
java -cp ".;lib/mysql-connector-j-x.x.x.jar;src" Loading
Default login credentials (from seed data):
Username: admin
Password: admin123
🤝 Contributing
Contributions, issues, and feature requests are welcome!
Fork the project
Create your branch: git checkout -b feature/amazing-feature
Commit your changes: git commit -m "Add amazing feature"
Push to the branch: git push origin feature/amazing-feature
Open a Pull Request
📄 License
This project is licensed under the MIT License.
👨‍💻 Author
Developed as a Java academic project.
Feel free to reach out for collaboration or questions!
�
⭐ If you found this helpful, please give it a star on GitHub!

