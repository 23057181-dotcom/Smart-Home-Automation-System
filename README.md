# 🏡 Smart Home Automation System

## Project Description
This project is a Java-based implementation of a **Smart Home Automation System**. It was developed for the **WIX1002 Fundamentals of Programming** assignment to demonstrate Object-Oriented Programming (OOP) principles.

The system simulates a central control unit that manages different types of smart devices (Lights and Fans) using a unified interface. It demonstrates how different objects can share a common parent structure while behaving differently—a core concept of Polymorphism.

## 🎥 Video Presentation
**[PASTE YOUR YOUTUBE VIDEO LINK HERE]**

> *Note: This video contains the introduction, code explanation, demonstration, peer Q&A, and reflection as required.*

---

## 🛠 OOP Concepts Applied
This project fulfills the strict coding requirements by implementing the following:

### 1. Inheritance
* **Parent Class (`Device`):** An `abstract` class that holds shared attributes like `deviceId`, `deviceName`, and `location`.
* **Child Classes:**
    * `SmartLight`: Extends `Device` to add brightness and color controls.
    * `SmartFan`: Extends `Device` to add speed and oscillation controls.

### 2. Polymorphism
* **Collection:** Uses an `ArrayList<Device>` to store both Lights and Fans in a single list.
* **Method Overriding:** Both child classes override the `turnOn()`, `turnOff()`, and `operate()` methods to provide unique behavior when called from the main loop.

### 3. Interface
* **`Controllable` Interface:** Defines the contract that all devices must implement (`turnOn()` and `turnOff()`), ensuring standardization across the system.

### 4. Encapsulation
* All sensitive attributes (like `speed` or `brightness`) are `private` and accessed/modified strictly through public methods to maintain data integrity.

---

## 📂 Project Structure

| File Name | Description |
|-----------|-------------|
| `Controllable.java` | **Interface.** Defines the mandatory methods (`turnOn`, `turnOff`) for all smart devices. |
| `Device.java` | **Abstract Parent Class.** Implements `Controllable`. Contains 3+ attributes and the constructor. |
| `SmartLight.java` | **Child Class.** Contains specific logic for lighting (dimming, color). |
| `SmartFan.java` | **Child Class.** Contains specific logic for fans (speed, oscillation). |
| `SmartHomeApp.java` | **Main Class.** The entry point that demonstrates object creation and polymorphism. |

---

## 🚀 How to Run the Project

Follow these steps to run the simulation on your local machine:

**1. Clone the Repository**
Open your terminal or command prompt and run:
```bash
git clone [https://github.com/23057181-dotcom/Smart-Home-Automation-System.git](https://github.com/23057181-dotcom/Smart-Home-Automation-System.git)
