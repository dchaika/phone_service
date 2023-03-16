## Getting Started

### Requirements:
* JDK 17

### Requests:

* [To retrieve list of all phones](http://127.0.0.1:8080/phones/list): GET http://127.0.0.1:8080/phones/list 
* [To book a phone](http://127.0.0.1:8080/phones/book?id=1&user=user): POST http://127.0.0.1:8080/phones/book?id=<PHONE_ID>&user=<USER>
* [To return a phone](http://127.0.0.1:8080/phones/release?id=1): POST http://127.0.0.1:8080/phones/return?id=<PHONE_ID>