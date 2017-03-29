package myweb

class TimeController {

    def gettimeService

    def index() { render "Current time : ${gettimeService.dateTime()}"}
}
