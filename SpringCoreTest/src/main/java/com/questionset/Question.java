package com.questionset;

import java.util.Set;

public class Question {
	private Set<String> answers;

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	

	@Override
	public String toString() {
		return "Question [answers=" + answers + "]";
	}
	
	
}
