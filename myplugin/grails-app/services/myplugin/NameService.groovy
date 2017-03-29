package myplugin

import grails.transaction.Transactional

@Transactional
class NameService {

    def name() {
	'Benoit'
    }
}
