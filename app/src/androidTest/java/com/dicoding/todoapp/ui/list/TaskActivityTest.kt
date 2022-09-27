package com.dicoding.todoapp.ui.list

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule

import com.dicoding.todoapp.R
import org.junit.Rule
import org.junit.Test

//TODO 16 : Write UI test to validate when user tap Add Task (+), the AddTaskActivity displayed
class TaskActivityTest {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(TaskActivity::class.java)

    @Test
    fun addNewTask() {
        Espresso.onView(ViewMatchers.withId(R.id.fab)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withText("Add Task"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}