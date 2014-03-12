package todoapp

import grails.transaction.Transactional

@Transactional
class TasksService {

	static scope = "singleton" // default
	
	def listUserTasks(User userInstance) {
		return Task.findByUser(userInstance);
	}
	
	def getUsersTasks(User userInstance) {
		Task.findAllByUser(userInstance)
	}
}
