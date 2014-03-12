package todoapp

class DashboardController {

    def index() { 
		def welcomeMessage = "Hello Todo App dashboard"
		render(view: 'index', model: [welcomeMessage: welcomeMessage])
	}
}
