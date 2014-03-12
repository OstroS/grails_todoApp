package todoapp

class Task {

    static constraints = {
    }
	
	enum Priority {HIGH, NORMAL, LOW} 
	
	Long id
	Date timestamp
	User user
	String description
	Priority priority

}
