package com.backend.tms.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentScheduleRemoveRequest {
	
	private Long assignmentId;
    private Long scheduleId;
}
