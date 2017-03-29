package myplugin

import grails.transaction.Transactional

import java.time.LocalDateTime

@Transactional
class GettimeService {

    def dateTime() {
        LocalDateTime.now()
    }
}
