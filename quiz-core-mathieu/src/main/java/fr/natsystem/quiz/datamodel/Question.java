package fr.natsystem.quiz.datamodel;
import java.util.List;

public class Question {
	private String question;
	private List<String> categorie ;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getCategorie() {
		return categorie;
	}
	public void setCategorie(List<String> categorie) {
		this.categorie = categorie;
	}
	@Override
	public String toString() {
		return "\n Question [question=" + question + ", categorie=" + categorie.toString() + "]" ;
	}
	

}
