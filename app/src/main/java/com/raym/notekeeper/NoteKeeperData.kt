package com.raym.notekeeper

class CourseInfo(val courseId: String, val courseTitle: String)

class NoteInfo (var course : CourseInfo, var noteTitle: String, var noteText: String)