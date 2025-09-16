# 🧑‍💻 Spring Boot Practice Scenarios
---
## Project Scenarios

### 1️⃣ Student Management System
**Description:** Manage students in a school.  
**Features:**
- Add, update, view, and delete students 
- Each student has (`id`, `name`, `email`, `grade`).
- Bonus: Search students by grade.

---

### 2️⃣ Pet Adoption Center
**Description:** Track adoptable pets.  
**Features:**
- Add pets (`id`,`name`, `species`, `age`, `isAdopted`).
- Mark pet as adopted.
- Bonus: Endpoint to get a **random pet of the day**.

---

### 3️⃣ Hogwarts Student Tracker
**Description:** Track Hogwarts students and their houses.  
**Features:**
- Add students (`id`,`name`, `house`, `year`, `wandType`).
- View students by house.
- Bonus: Get a **random student for a duel**.

---

### 4️⃣ Dragon Hatchery
**Description:** Manage dragons in a fantasy world.  
**Features:**
- Add dragons (`id`,`name`, `color`, `element`, `age`).
- Update dragon age.
- Bonus: Endpoint to “hatch” a new dragon with random color/element.

---

### 5️⃣ Video Game High Score Board 
**Description:** Track arcade game high scores.  
**Features:**
- Add players with `id` ,`username`, `gameName`, `score`.
- View leaderboard sorted by score.
- Bonus: Endpoint for the **top 3 players**.

---

### 6️⃣ Friends Episode Watchlist 
**Description:** Track watched episodes of Friends.  
**Features:**
- Add episodes (`id`,`season`, `episodeNumber`, `title`, `watched`).
- Mark episodes as watched/unwatched.
- Bonus: Endpoint for a **random unwatched episode recommendation**.

---

### 7️⃣ Pizza Planet Order System
**Description:** Manage pizza orders for a space-themed pizza shop using just one class.
**Features:**
- Use a single `Order` class with these fields: `id`, `customerName`, `pizzaType`, `price`,`status` (e.g., "pending", "delivered").
- Add new orders.
- Update order status to “delivered.”
- Bonus: Calculate **total cost of order**.

---

### 8️⃣ Millennium Falcon Cargo Manager
**Description:** Track cargo aboard the Millennium Falcon.  
**Features:**
- Add cargo items (`id`,`name`, `weight`, `owner`).
- Track status: stored or delivered.
- Bonus: Calculate **total cargo weight** and warn if overloaded.

---

### 9️⃣ Wizard Spellbook️
**Description:** Manage spells for wizards.  
**Features:**
- Add spells (`id`,`spellName`, `difficulty`, `manaCost`).
- Delete banned spells.
- Bonus: Endpoint to **cast a spell** with a fun message.

---

### 🔟 Avengers Mission Log
**Description:** Track Avengers missions.  
**Features:**
- Add missions (`id``title`, `location`, `teamMembers`, `status`).
- Update mission status: `planned`, `inProgress`, `completed`.
- Bonus: Endpoint for getting **active missions** or a **random mission of the day**.

---

## 🛠️ How to Practice
1. Pick 1 scenario from the list.
2. Create a new Spring Boot project from scratch
3. Implement **Repository → Service → Controller** pattern.
4. Build basic CRUD endpoints first, then add the **bonus fun/pop-culture endpoints**.
5. Test your API with Postman or curl.

---

## 💡 Tips
- Start with **one entity, one controller, one service, one repository**.
- Be creative! Add extra fields, endpoints, or fun logic to make your project unique.
- after initial problem has been solved try and write some unit test for that code

---

🎯 **Goal:** By completing these exercises, students should gain confidence in setting up Spring Boot projects, implementing REST APIs, and structuring code using a clean and maintainable architecture.
