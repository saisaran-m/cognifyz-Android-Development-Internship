# Cognifyz Technologies - Android Development Internship

![Android](https://img.shields.io/badge/Platform-Android-green.svg?logo=android)
![Language](https://img.shields.io/badge/Language-Java-orange.svg?logo=java)
![Min SDK](https://img.shields.io/badge/Min%20SDK-24-blue.svg)
![Target SDK](https://img.shields.io/badge/Target%20SDK-34-brightgreen.svg)
![License](https://img.shields.io/badge/License-MIT-purple.svg)

> **Where Data Meets Intelligence**  
> Complete implementation of all 8 tasks across 4 levels for the Cognifyz Technologies Android Development Internship Program.

---

## Table of Contents
- [About the Internship](#about-the-internship)
- [Project Architecture](#project-architecture)
- [Tasks and Levels Breakdown](#tasks-and-levels-breakdown)
  - [Level 1: Beginner](#level-1-beginner)
  - [Level 2: Intermediate](#level-2-intermediate)
  - [Level 3: Advanced](#level-3-advanced)
  - [Level 4: Expert](#level-4-expert)
- [Technical Stack](#technical-stack)
- [Repository Structure](#repository-structure)
- [Getting Started and Build Instructions](#getting-started-and-build-instructions)
- [Submission Guidelines](#submission-guidelines)
- [Contact and Verification](#contact-and-verification)

---

## About the Internship

Cognifyz Technologies is a technology company specializing in Data Science, Artificial Intelligence (AI), Machine Learning (ML), and Data Analytics. The Android Development Internship curriculum provides comprehensive training across core mobile engineering competencies, from fundamental user interfaces to relational database management and animated transitions.

This repository fulfills all 8 assigned tasks organized into two complementary formats:
1. **Unified Application (`CognifyzInternship`)**: A production-grade Android Studio project containing all activities unified under a centralized Task Menu dashboard for direct evaluation.
2. **Modular Level Directories (`Level 1` to `Level 4`)**: Dedicated folders containing isolated task source files and layouts for modular inspection and submission.

---

## Project Architecture

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
│   │   │       ├── anim/             # Custom slide and fade transition animations
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

## Tasks and Levels Breakdown

### Level 1: Beginner

#### Task 1: Hello World App
* **Objective:** Construct a foundational Android application displaying a branded introductory interface.
* **Key Implementation Details:**
  * Animated layout transition utilizing `AlphaAnimation` fade-in sequences.
  * Formal Cognifyz corporate identity and slogan presentation.
  * Explicit entry point directing to the primary task index.
* **Key Artifacts:** `HelloWorldActivity.java`, `activity_hello_world.xml`.

#### Task 2: Button Interaction
* **Objective:** Implement interactive controls, state manipulation, and event handling.
* **Key Implementation Details:**
  * Primary click listener with real-time numeric counter incrementation and Toast notifications.
  * Long-click gesture recognition (`OnLongClickListener`) for counter reset operations.
  * Contextual status messaging dynamically rendered within the layout.
* **Key Artifacts:** `ButtonInteractionActivity.java`, `activity_button_interaction.xml`.

---

### Level 2: Intermediate

#### Task 3: List Display
* **Objective:** Implement structured collection rendering using a scrollable list view.
* **Key Implementation Details:**
  * Custom `ArrayAdapter` implementation featuring alternating row backgrounds for enhanced contrast.
  * Structured static dataset representing modern programming technologies.
  * Item click callbacks delivering user selection details via Toast messages.
* **Key Artifacts:** `ListDisplayActivity.java`, `activity_list_display.xml`, `list_item.xml`.

#### Task 4: Basic UI Layout
* **Objective:** Design multi-activity navigation and structured view hierarchies.
* **Key Implementation Details:**
  * Primary input form passing dynamic data across activity boundaries via Intent extras.
  * `ProfileActivity` displaying structured user data and metadata attributes.
  * `SettingsActivity` featuring toggle switches for push notifications, dark theme, and audio effects.
* **Key Artifacts:** `BasicUILayoutActivity.java`, `ProfileActivity.java`, `SettingsActivity.java`, `activity_basic_ui_layout.xml`.

---

### Level 3: Advanced

#### Task 5: Fetch and Display Data
* **Objective:** Implement scalable list rendering utilizing the modern RecyclerView architectural pattern.
* **Key Implementation Details:**
  * Encapsulated `CourseItem` model containing domain properties (title, description, rating, duration, color identifier).
  * High-performance `CourseAdapter` and `CourseViewHolder` lifecycle pattern.
  * Card-based view presentation with elevation and categorized left accent strips.
  * Touch feedback with item selection handling.
* **Key Artifacts:** `FetchDataActivity.java`, `CourseAdapter.java`, `CourseItem.java`, `activity_fetch_data.xml`, `item_course.xml`.

#### Task 6: Simple Form
* **Objective:** Build an end-to-end user data input form with client-side validation and state management.
* **Key Implementation Details:**
  * Input fields with Material `TextInputLayout` styling for Name, Email Address, and Phone Number.
  * Multi-rule validation engine validating required fields, email structure, and minimum digit constraints.
  * Gender selection via single-choice `RadioGroup`.
  * Technical domain selection utilizing a drop-down `Spinner`.
  * Comprehensive result confirmation panel dynamically displayed upon successful validation.
* **Key Artifacts:** `SimpleFormActivity.java`, `activity_simple_form.xml`.

---

### Level 4: Expert

#### Task 7: Basic Database Usage
* **Objective:** Integrate local relational data persistence utilizing Android SQLite APIs.
* **Key Implementation Details:**
  * Custom `DatabaseHelper` extending `SQLiteOpenHelper` with automated DDL table creation and migration handlers.
  * Transactional insertion (`addUser`), structured querying (`getAllUsers`), and bulk deletion operations.
  * Real-time UI synchronization showing current record counts and data listings.
  * Confirmation dialog prompt (`AlertDialog`) safeguarding against accidental mass deletion.
* **Key Artifacts:** `DatabaseActivity.java`, `DatabaseHelper.java`, `activity_database.xml`.

#### Task 8: Implement Navigation
* **Objective:** Establish seamless inter-activity transitions with custom graphic animations.
* **Key Implementation Details:**
  * Explicit Intent routing between multiple distinct activity targets.
  * Custom XML window transition animations:
    * Slide transition: `slide_in_right` and `slide_out_left`.
    * Fade transition: `fade_in` and `fade_out`.
    * Reverse animations configured on back button presses (`slide_in_left` and `slide_out_right`).
  * Passing structured parameters across intent boundaries.
* **Key Artifacts:** `NavigationHomeActivity.java`, `NavigationDetailActivity.java`, `NavigationAboutActivity.java`, `res/anim/*`.

---

## Technical Stack

| Component | Specification |
|---|---|
| Language | Java (JDK 17 / 21 compatible, Java 8 bytecode compatibility) |
| Target Platform | Android SDK (Min SDK: 24, Target SDK: 34, Compile SDK: 34) |
| Development Environment | Android Studio (Hedgehog, Iguana, Jellyfish, Koala, Ladybug) |
| UI Framework | Material Components, CardView, ConstraintLayout, RecyclerView, ListView |
| Data Persistence | Local SQLite (`SQLiteOpenHelper`, `SQLiteDatabase`, `Cursor`) |
| Architectural Model | Activity-based with Adapters, Models, and Helper Services |
| Transition Engine | Custom XML Alpha and Translate animations |

---

## Getting Started and Build Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/saisaran-m/cognifyz-Android-Development-Internship.git
   ```

2. **Open in Android Studio:**
   * Open Android Studio.
   * Navigate to **File > Open...**
   * Select the `CognifyzInternship` directory and click **OK**.
   * Wait for Gradle synchronization to resolve all dependencies.

3. **Build and Execute:**
   * Select a target emulator or connected physical Android device (API 24 or higher).
   * Click **Run (Shift + F10)**.
   * The application launches into **Task 1: Hello World**, which provides access to the master **Task Menu** dashboard.

---

## Submission Guidelines

Per the Cognifyz Technologies internship instructions:
1. Produce a video demonstration displaying each completed task operating in an emulator or physical device.
2. Publish the video on LinkedIn providing proof of project completion.
3. Reference and tag the official organization profile: `@Cognifyz Technologies`.
4. Include the designated tracking hashtags: `#cognifyz`, `#cognifyzTech`, `#cognifyzTechnologies`.
5. Submit the repository URL and video verification link through the official internship submission portal.

---

## Contact and Verification

* **Organization:** Cognifyz Technologies
* **Website:** https://www.cognifyz.com
* **Official LinkedIn:** https://www.linkedin.com/company/cognifyz-technologies
* **Inquiries:** contact@cognifyz.com
