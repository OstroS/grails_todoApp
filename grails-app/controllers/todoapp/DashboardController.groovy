package todoapp

class DashboardController {

	UserService userService;
	
    def index() { 
		def welcomeMessage = "Hello Todo App dashboard"
		render(view: 'index', model: [welcomeMessage: welcomeMessage, username: userService.getCurrentUser().username])
	}
}
