package fr.natsystem.quiz.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.natsystem.quiz.datamodel.Question;
import fr.natsystem.quiz.services.Serialization;

public class SerializationTest {

	@Test 
public void testReadFromCsv() throws IOException {
	File data=new File("data.csv");
	List<Question> resultats=new ArrayList<Question>();	
		 resultats=Serialization.csvToQuestionList(data);	
	System.out.println(resultats);
	boolean success="Qu'est-ce que Maven?".equals(resultats.get(0).getQuestion());
	if (!success) {
		throw new AssertionError();
	}
	
}
}
