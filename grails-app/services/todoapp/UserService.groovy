package todoapp

import grails.transaction.Transactional

@Transactional
class UserService {

    def serviceMethod() {

    }
	
	def getCurrentUser() {
		User.findAll().get(0);
	}
}
