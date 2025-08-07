# 🧮 Calculator Project

A simple command-line calculator built using [your programming language here — e.g., C++, Python, Java].  
This project was created to demonstrate basic Git workflow, branching strategies, and feature-based development.

---

## 📁 Project Structure

- `main` branch → Base branch initialized with the project
- `dev` branch → Development branch where all features are merged
- Feature branches:
  - `feature/addition`
  - `feature/subtraction`
  - `feature/multiplication`
  - `feature/division`

---

## 🛠️ Features Implemented

Each feature was developed in its own branch, tested, and merged into the `dev` branch.

| Feature        | Branch Name            | Status   |
|----------------|------------------------|----------|
| Addition       | `feature/addition`     | ✅ Done   |
| Subtraction    | `feature/subtraction`  | ✅ Done   |
| Multiplication | `feature/multiplication` | ✅ Done |
| Division       | `feature/division`     | ✅ Done   |

---

## 🔀 Git Workflow Used

1. **Initialize repo on `main`**
2. Create development branch:
   ```bash
   git checkout -b dev


git checkout dev
git pull origin dev
git checkout -b feature/<feature-name>


git add .
git commit -m "Add <feature> functionality"
git push origin feature/<feature-name>


git checkout dev
git merge feature/<feature-name>
git push origin dev


