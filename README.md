# ⛰️ Mountain Hiking Challenge Registration

Java console application for managing FPT University student registrations in the Mountain Hiking Challenge.  
Stores data in a `.dat` file (binary serialization) and uses `MountainList.csv` for available mountain codes.

---

## 📋 Requirements
- Java **8** or later
- `MountainList.csv` in project folder
- Read/write access for `registrations.dat`

---

## 🛠 Features
- New Registration – Add a new student with input validation.  
- Update Registration – Edit name, phone, email, or mountain code.  
- Display Registered List – Show all registered students in table format.  
- Delete Registration – Remove a student by their ID.  
- Search by Name – Find students by full or partial name.  
- Filter by Campus – List students from a specific campus.  
- Statistics by Mountain – Show participant count and total tuition per mountain.  
- Save Data – Write all records to `registrations.dat`.  
- Exit Program – Quit with optional save prompt.
  
---

## 💡 Notes
- **Default tuition:** 6,000,000 VND  
- **Discount:** 35% for Viettel or VNPT phone numbers  
- **ID format:** `{CampusCode}{6 digits}` (Campus codes: SE, HE, DE, QE, CE)  

---

## ▶️ How to Run
```bash
javac *.java
java Main

  
