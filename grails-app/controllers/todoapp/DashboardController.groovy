package todoapp

class DashboardController {

	UserService userService;
	TasksService tasksService;
	
    def index() { 
		def welcomeMessage = "Hello Todo App dashboard"
		def currentUser = userService.getCurrentUser()
		def username = currentUser.username
		def usersTasks = tasksService.getUsersTasks(currentUser)
		
		render(view: 'index', model: [welcomeMessage: welcomeMessage, username: username, usersTasks: usersTasks])
	}
}
