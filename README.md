# Cognifyz Technologies — Android Development Internship 📱

![Android](https://img.shields.io/badge/Platform-Android-green.svg?logo=android)
![Language](https://img.shields.io/badge/Language-Java-orange.svg?logo=java)
![Min SDK](https://img.shields.io/badge/Min%20SDK-24-blue.svg)
![Target SDK](https://img.shields.io/badge/Target%20SDK-34-brightgreen.svg)
![License](https://img.shields.io/badge/License-MIT-purple.svg)

> **Where Data Meets Intelligence**  
> Complete implementation of all **8 Tasks** across **4 Levels** for the **Cognifyz Technologies Android Development Internship Program**.

---

## 📑 Table of Contents
- [About the Internship](#-about-the-internship)
- [Project Architecture](#-project-architecture)
- [Tasks & Levels Breakdown](#-tasks--levels-breakdown)
  - [Level 1: Beginner (Tasks 1 & 2)](#level-1-beginner)
  - [Level 2: Intermediate (Tasks 3 & 4)](#level-2-intermediate)
  - [Level 3: Advanced (Tasks 5 & 6)](#level-3-advanced)
  - [Level 4: Expert (Tasks 7 & 8)](#level-4-expert)
- [Tech Stack](#-tech-stack)
- [Repository Structure](#-repository-structure)
- [Getting Started / How to Run](#-getting-started--how-to-run)
- [Submission Guidelines](#-submission-guidelines)
- [Contact & Affiliation](#-contact--affiliation)

---

## 🏢 About the Internship

**Cognifyz Technologies** is a leading technology company specializing in Data Science, Artificial Intelligence (AI), Machine Learning (ML), and Data Analytics. The Android Development Internship program equips interns with foundational and production-grade mobile engineering skills using Android Studio, Java, Material Design, and SQLite.

This repository fulfills all **8 tasks** (minimum 5 required) organized into both:
1. **A Unified Master Android App (`CognifyzInternship`)** with a centralized navigation hub to launch and test any task.
2. **Individual Level Folders (`Level 1` to `Level 4`)** for granular code inspection and per-level submission.

---

## 🏛️ Project Architecture

```
Cognifyz-Android-Development-Internship/
├── CognifyzInternship/               # Complete, Runnable Android Studio Project
│   ├── app/
│   │   ├── src/main/
│   │   │   ├── AndroidManifest.xml   # Manifest declaring all 8 task activities
│   │   │   ├── java/com/cognifyz/internship/
│   │   │   │   ├── TaskMenuActivity.java     # Central Interactive Dashboard
│   │   │   │   ├── task1/HelloWorldActivity.java
│   │   │   │   ├── task2/ButtonInteractionActivity.java
│   │   │   │   ├── task3/ListDisplayActivity.java
│   │   │   │   ├── task4/BasicUILayoutActivity.java, ProfileActivity, SettingsActivity
│   │   │   │   ├── task5/FetchDataActivity.java, CourseAdapter, CourseItem
│   │   │   │   ├── task6/SimpleFormActivity.java
│   │   │   │   ├── task7/DatabaseActivity.java, DatabaseHelper
│   │   │   │   └── task8/NavigationHomeActivity, DetailActivity, AboutActivity
│   │   │   └── res/
│   │   │       ├── anim/             # Custom slide & fade transition animations
│   │   │       ├── layout/           # Material Design XML layouts
│   │   │       ├── drawable/         # Custom backgrounds, buttons, and badges
│   │   │       ├── values/           # Colors, strings, themes
│   │   │       └── mipmap-*/         # Multi-density launcher icons
│   │   └── build.gradle
│   ├── build.gradle
│   ├── settings.gradle
│   └── gradlew / gradlew.bat
│
├── Level 1 - Beginner/               # Individual Level Files
│   ├── Task 1 - Hello World/
│   └── Task 2 - Button Interaction/
├── Level 2 - Intermediate/
│   ├── Task 3 - List Display/
│   └── Task 4 - Basic UI Layout/
├── Level 3 - Advanced/
│   ├── Task 5 - Fetch and Display Data/
│   └── Task 6 - Simple Form/
└── Level 4 - Expert/
    ├── Task 7 - Database Usage/
    └── Task 8 - Navigation/
```

---

## 📋 Tasks & Levels Breakdown

### Level 1: Beginner

#### 🟢 Task 1: Hello World App
* **Objective:** Build a foundational Android application displaying a branded welcome message.
* **Features:**
  * Animated introduction using `AlphaAnimation` (fade-in sequence).
  * Cognifyz company branding and slogan (*"Where Data Meets Intelligence"*).
  * Direct launch button navigating to the interactive task menu.
* **Key Files:** `HelloWorldActivity.java`, `activity_hello_world.xml`.

#### 🟢 Task 2: Button Interaction
* **Objective:** Enhance user interaction using buttons, state tracking, and feedback.
* **Features:**
  * Single tap: Increments live click counter with dynamic `Toast` feedback.
  * Long press: Resets counter with custom warning toast.
  * Celebration action: Shows motivational toast alert and updates message banner.
* **Key Files:** `ButtonInteractionActivity.java`, `activity_button_interaction.xml`.

---

### Level 2: Intermediate

#### 🟠 Task 3: List Display
* **Objective:** Create an activity presenting structured data in a scrollable list view.
* **Features:**
  * Custom `ArrayAdapter` with alternating list row highlight colors for accessibility.
  * Static dataset featuring major modern programming languages & descriptions.
  * Item click listeners displaying item selection details via `Toast`.
* **Key Files:** `ListDisplayActivity.java`, `activity_list_display.xml`, `list_item.xml`.

#### 🟠 Task 4: Basic UI Layout
* **Objective:** Construct a multi-activity application demonstrating XML layout design and intent data transfer.
* **Features:**
  * **Main Dashboard:** Dynamic username input and intent routing.
  * **Profile Screen (`ProfileActivity`):** Displays dynamic username, generated company email, and avatar card.
  * **Settings Screen (`SettingsActivity`):** Interactive switches for Notifications, Dark Theme, and Sound effects.
* **Key Files:** `BasicUILayoutActivity.java`, `ProfileActivity.java`, `SettingsActivity.java`, `activity_basic_ui_layout.xml`.

---

### Level 3: Advanced

#### 🔴 Task 5: Fetch and Display Data (RecyclerView)
* **Objective:** Dynamically bind and present structured data using the modern `RecyclerView` pattern.
* **Features:**
  * Custom `CourseItem` model (Title, Description, Rating, Duration, Color Accent).
  * High-performance `CourseAdapter` and `ViewHolder` pattern with `CardView`.
  * Dynamic list with 10 Cognifyz technical courses (Android, Data Science, AI/ML, Cloud, DevOps, etc.).
  * Ripple touch feedback and enrollment toasts on card clicks.
* **Key Files:** `FetchDataActivity.java`, `CourseAdapter.java`, `CourseItem.java`, `activity_fetch_data.xml`, `item_course.xml`.

#### 🔴 Task 6: Simple Form
* **Objective:** Implement a full registration form with validation and submission processing.
* **Features:**
  * Input fields: Full Name, Email Address, Phone Number using Material `TextInputLayout`.
  * Field validation: Required fields check, email format verification (`@`), 10-digit phone verification.
  * Gender radio button selector (`RadioGroup` / `RadioButton`).
  * Domain selection dropdown using `Spinner`.
  * Real-time formatted summary card display upon valid submission.
  * Reset button to clear inputs and state.
* **Key Files:** `SimpleFormActivity.java`, `activity_simple_form.xml`.

---

### Level 4: Expert

#### 🟣 Task 7: Basic Database Usage (SQLite)
* **Objective:** Integrate a local SQLite database for persistent offline CRUD operations.
* **Features:**
  * `DatabaseHelper` extending `SQLiteOpenHelper` with automated schema creation and upgrade logic.
  * Insert new users with Name, Email, and Domain.
  * Fetch and display real-time records in a `ListView`.
  * Live record count counter.
  * Confirmation dialog (`AlertDialog`) before deleting all records.
* **Key Files:** `DatabaseActivity.java`, `DatabaseHelper.java`, `activity_database.xml`.

#### 🟣 Task 8: Implement Navigation
* **Objective:** Implement smooth multi-screen navigation using explicit intents and custom window transitions.
* **Features:**
  * **Slide Navigation:** Transitions to `NavigationDetailActivity` using `slide_in_right` / `slide_out_left`.
  * **Fade Navigation:** Transitions to `NavigationAboutActivity` using `fade_in` / `fade_out`.
  * Bidirectional animations on `onBackPressed()` and back button taps (`slide_in_left` / `slide_out_right`).
  * Passing and displaying custom Intent extras across activities.
* **Key Files:** `NavigationHomeActivity.java`, `NavigationDetailActivity.java`, `NavigationAboutActivity.java`, `res/anim/*`.

---

## 🛠️ Tech Stack

| Category | Technologies / Libraries |
|---|---|
| **Language** | Java (JDK 17 / 21 compatible, Java 8 bytecode target) |
| **Platform** | Android SDK (Min SDK: 24, Target SDK: 34) |
| **IDE** | Android Studio (Hedgehog, Iguana, Jellyfish, Koala, Ladybug+) |
| **UI Components** | Material Design 3, CardView, ConstraintLayout, RecyclerView, ListView |
| **Local Storage** | SQLite (`SQLiteOpenHelper`, `SQLiteDatabase`, `Cursor`) |
| **Architecture** | Activity-based with Adapters & Helper Services |
| **Animations** | XML Alpha & Translate View Animations |

---

## 🚀 Getting Started / How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/<your-username>/Cognifyz-Android-Development-Internship.git
   ```

2. **Open in Android Studio:**
   * Launch Android Studio.
   * Select **File > Open...**
   * Browse to the `CognifyzInternship` folder and click **OK**.
   * Allow Gradle to sync dependencies.

3. **Run the Application:**
   * Select an emulator or connected physical Android device (API 24+).
   * Click the green **Run (Shift + F10)** button.
   * The app launches into **Task 1: Hello World**, from which you can click **"Explore All Tasks"** to open the full interactive task menu.

---

## 📹 Submission Guidelines

When submitting your internship deliverables:
1. **Record a screen walkthrough video** demonstrating each task running smoothly.
2. **Post your video on LinkedIn** with proof of work and tag Cognifyz:
   * **Tag:** `@Cognifyz Technologies`
   * **Hashtags:** `#cognifyz #cognifyzTech #cognifyzTechnologies #AndroidDevelopment #Internship`
3. **Submit the project repository link** in the official Cognifyz submission form.

---

## 📬 Contact & Affiliation

* **Organization:** Cognifyz Technologies
* **Website:** [www.cognifyz.com](https://www.cognifyz.com)
* **LinkedIn:** [@cognifyz-technologies](https://www.linkedin.com/company/cognifyz-technologies)
* **Email:** contact@cognifyz.com
