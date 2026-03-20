# 🟢 Bean Management System (Spring Core)

This project demonstrates the **fundamental concepts of the Spring Framework**, focusing on **Inversion of Control (IoC)** and **Dependency Injection (DI)** using **XML configuration**.

---

## 🎯 Objective

To understand how Spring:

* Creates objects (Beans)
* Manages dependencies
* Injects dependencies without using `new`

---

## 🧱 Project Overview

This project models a simple system:

* `Car` depends on an `Engine`
* `Engine` is an interface
* Implementations:

  * PetrolEngine
  * DieselEngine

Spring injects the required engine into the car using XML configuration.

---

## ⚙️ Key Concepts Covered

* Inversion of Control (IoC)
* Dependency Injection (Setter Injection)
* BeanFactory / ApplicationContext
* XML-based configuration
* Loose Coupling using interfaces

---

## 🔄 How It Works

1. Beans are defined in `Spring.xml`
2. Engine implementations are created as beans
3. Car bean receives Engine via dependency injection
4. ApplicationContext loads and wires everything
5. Objects are retrieved and used in the main class

---

## 📌 Example Flow

```
Car → Engine (injected by Spring)
```

Spring handles:

* Object creation
* Dependency wiring
* Lifecycle management

---

## 🧠 What I Learned

* Why `new` is avoided in Spring
* How Spring container controls object creation
* How loose coupling improves flexibility
* How configuration drives behavior

---

## 🚀 Outcome

After completing this project, I can:

* Build and configure beans using XML
* Understand how Spring injects dependencies
* Visualize how the Spring container works internally

---

💡 This project forms the **foundation of all Spring-based applications**.
