package fr.natsystem.quiz.services;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import fr.natsystem.quiz.datamodel.Question;

public class Serialization {
	
	public static  List<Question> csvToQuestionList(File file) throws IOException  {
		List <String> lines=null; 
		
		lines= Files.readAllLines(file.toPath(),StandardCharsets.ISO_8859_1);
		lines.remove(0);
		List <Question> questions =new ArrayList<>();	
		for (String ligne :lines) {
			questions.add(deserialisation(ligne));
		}		
		return questions;	
	}
	
	public static  Question deserialisation(String line) {
		String categories_lines;
		List<String> categories=new ArrayList<>();
		Question question = new Question();
		String [] value = line.split(";") ;
		question.setQuestion(value[0].trim());
		categories_lines=value[1].trim();
		String [] value_categorie = categories_lines.split("\\|") ;
		for  (int i=0 ;i<value_categorie.length;i++) {
			categories.add(value_categorie[i].trim());
		}
		question.setCategorie(categories);
		return question;
	}
}
