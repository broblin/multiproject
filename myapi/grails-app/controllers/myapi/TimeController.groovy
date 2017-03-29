package myapi


import grails.rest.*
import grails.converters.*

import static org.springframework.http.HttpStatus.OK

class TimeController {

    def gettimeService
	
    def index() { render text:"Current time : ${gettimeService.dateTime()}", status: OK }
}
