# Level 4: Expert

This directory contains the completed source code and layout files for Level 4 (Expert) of the Cognifyz Android Development Internship.

## Tasks Included

### Task 7: Basic Database Usage
* **Objective:** Implement persistent offline local storage utilizing the Android SQLite API framework.
* **Implementation Details:**
  1. Implemented `DatabaseHelper` extending `SQLiteOpenHelper` with automated schema creation and upgrade handlers.
  2. Implemented database insertion (`addUser`), querying (`getAllUsers`), and bulk deletion (`deleteAllUsers`).
  3. Built `DatabaseActivity` to accept inputs, synchronize live record counts, and update the UI list view.
  4. Added a confirmation dialog prompt safeguarding against unintended deletion.
* **Files:**
  * `Task 7 - Database Usage/DatabaseActivity.java`
  * `Task 7 - Database Usage/DatabaseHelper.java`
  * `Task 7 - Database Usage/activity_database.xml`

### Task 8: Implement Navigation
* **Objective:** Construct seamless multi-screen navigation flows using explicit intents and custom window animations.
* **Implementation Details:**
  1. Configured explicit intents to transfer parameters across activity targets.
  2. Created custom XML transition animations (`slide_in_right`, `slide_out_left`, `slide_in_left`, `slide_out_right`, `fade_in`, `fade_out`).
  3. Integrated transitions for forward navigation and back-stack return transitions.
* **Files:**
  * `Task 8 - Navigation/NavigationHomeActivity.java`
  * `Task 8 - Navigation/NavigationDetailActivity.java`
  * `Task 8 - Navigation/NavigationAboutActivity.java`
  * `Task 8 - Navigation/activity_navigation_home.xml`
  * `Task 8 - Navigation/activity_navigation_detail.xml`
  * `Task 8 - Navigation/activity_navigation_about.xml`
  * `Task 8 - Navigation/anim/*`
