package com.lsdconsulting.activityengine.api.response

import com.lsdconsulting.activityengine.api.shared.question.InputQuestion
import java.time.ZonedDateTime
import java.util.*

data class ActivityResponse(
    val id: String,
    val lessonId: String,
    val inputQuestions: List<InputQuestion> = ArrayList(),
    val maxScore: Int?,
    val createdAt: ZonedDateTime
)