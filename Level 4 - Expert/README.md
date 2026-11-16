# Level 4: Expert

This folder contains the tasks completed for **Level 4 (Expert)** of the Cognifyz Android Development Internship.

## Tasks Included

### Task 7: Basic Database Usage (SQLite)
* **Objective:** Integrate a local SQLite database for persistent offline data storage and retrieval.
* **Steps Completed:**
  1. Implemented `DatabaseHelper` extending `SQLiteOpenHelper` with `onCreate()` and `onUpgrade()`.
  2. Implemented database insertion (`addUser`), querying (`getAllUsers`), and deletion (`deleteAllUsers`).
  3. Built `DatabaseActivity` to accept inputs, update dynamic record counts, and refresh the UI list.
* **Files:**
  * `Task 7 - Database Usage/DatabaseActivity.java`
  * `Task 7 - Database Usage/DatabaseHelper.java`
  * `Task 7 - Database Usage/activity_database.xml`

### Task 8: Implement Navigation
* **Objective:** Implement smooth navigation flows between multiple screens with custom animations.
* **Steps Completed:**
  1. Configured explicit intents to transfer data between activities.
  2. Created custom XML animations (`slide_in_right`, `slide_out_left`, `slide_in_left`, `slide_out_right`, `fade_in`, `fade_out`).
  3. Integrated transitions in forward navigation and back presses.
* **Files:**
  * `Task 8 - Navigation/NavigationHomeActivity.java`
  * `Task 8 - Navigation/NavigationDetailActivity.java`
  * `Task 8 - Navigation/NavigationAboutActivity.java`
  * `Task 8 - Navigation/activity_navigation_home.xml`
  * `Task 8 - Navigation/activity_navigation_detail.xml`
  * `Task 8 - Navigation/activity_navigation_about.xml`
  * `Task 8 - Navigation/anim/*`
