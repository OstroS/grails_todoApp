import todoapp.Task;
import todoapp.User;

class BootStrap {

    def init = { servletContext ->
		println "Application starting"

		prepareTasks()

		}
    def destroy = {
    }
	
	def prepareTasks() {
		def user = new User(username: "Krzychu", createDate: new Date())
		user.save()
		
		new Task(priority: Task.Priority.NORMAL, timestamp: new Date(), user: user, description: "dupa blada"  ).save()
		new Task(priority: Task.Priority.HIGH, timestamp: new Date(), user: user, description: "dupa blada bardzo"  ).save()
		new Task(priority: Task.Priority.LOW, timestamp: new Date(),  user: user, description: "dupa średnio blada"  ).save()	
	}
	

}
