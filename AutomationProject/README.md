
# 🧪 Selenium Java Automation Project

Hi there! 👋

This is a simple Selenium automation framework I built using **Java**, **TestNG**, and **Maven**. It follows the **Page Object Model (POM)** design pattern to keep things organized and easy to maintain.

The main goal of this project is to automate basic web UI test cases and generate neat test reports — perfect for learning, showcasing QA skills, or even expanding into a bigger framework later on.

---

## 💡 What This Project Does

- Automates browser-based testing with Selenium WebDriver
- Uses TestNG to structure and run test cases
- Organizes everything using Page Object Model (so things don’t get messy)
- Generates clean, professional HTML reports using ExtentReports
- Manages dependencies through Maven (so you don’t have to download everything manually)

---

## 🧰 Tools & Technologies

Here’s what I used to build this:

- **Java**  
- **Selenium WebDriver**  
- **TestNG**  
- **Maven**  
- **ExtentReports**  
- **Git & GitHub**  
- IDE: Eclipse / IntelliJ (use whichever you prefer)

---

## 📁 Folder Structure (Simplified View)

SeleniumJava/
├── test/
│ └── java/
| |── Base/ # Base class
│ ├── Pages/ # Page Object classes
│ ├── Test/ # TestNG test cases
│
├── pom.xml # Maven config file
├── testng.xml # Test suite configuration
└── README.md # This file you're reading 🙂

---

## ⚙️ How to Run the Project

### Prerequisites:

Make sure you have the following installed:

- Java (JDK 8 or above)
- Maven
- ChromeDriver or GeckoDriver
- Eclipse or IntelliJ IDEA

### Setup Steps:

1. Clone this repo  
   ```bash
   git clone https://github.com/palak-chouksey/SeleniumJava.git
Open the project in your IDE as a Maven project

Download the browser driver (e.g., ChromeDriver) and update the path in your utility class if needed

Run the test suite:
Right-click on testng.xml → Run as → TestNG Suite

That’s it!
