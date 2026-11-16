# Level 3: Advanced

This directory contains the completed source code and layout files for Level 3 (Advanced) of the Cognifyz Android Development Internship.

## Tasks Included

### Task 5: Fetch and Display Data
* **Objective:** Dynamically bind and present dataset elements using the modern RecyclerView architectural pattern.
* **Implementation Details:**
  1. Defined `CourseItem` data model encapsulating course titles, descriptions, ratings, durations, and color indicators.
  2. Implemented `CourseAdapter` and `CourseViewHolder` utilizing Material `CardView` components with custom accent borders.
  3. Populated structured technical courses dataset and integrated card selection handlers.
* **Files:**
  * `Task 5 - Fetch and Display Data/FetchDataActivity.java`
  * `Task 5 - Fetch and Display Data/CourseAdapter.java`
  * `Task 5 - Fetch and Display Data/CourseItem.java`
  * `Task 5 - Fetch and Display Data/activity_fetch_data.xml`
  * `Task 5 - Fetch and Display Data/item_course.xml`

### Task 6: Simple Form
* **Objective:** Build an end-to-end data input form with client-side validation and feedback processing.
* **Implementation Details:**
  1. Built an input form capturing Name, Email, Phone, Gender (radio group), and Technical Domain (dropdown spinner).
  2. Implemented field validation logic with descriptive input error messages.
  3. Rendered a comprehensive submission confirmation panel summarizing submitted user details.
* **Files:**
  * `Task 6 - Simple Form/SimpleFormActivity.java`
  * `Task 6 - Simple Form/activity_simple_form.xml`
