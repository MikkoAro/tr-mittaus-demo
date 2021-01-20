package com.tyoturvallisuus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObservationNoteTest {

	@Test
	public void addObservationNoteComment_AddCommentById_ShouldAddObservationCommentById() {
		ObservationNote on = new ObservationNote(0);
		on.addObservationNoteComment("Test comment");
		assertEquals("Test comment", on.getComment(0));
	}

	@Test
	public void size_CallFunction_ShouldReturn4() {
		assertEquals(4, ObservationNote.size());
	}
}
