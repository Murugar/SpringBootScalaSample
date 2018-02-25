package com.iqmsoft.scala

import java.util

import org.slf4j.Logger
import org.springframework.http.{HttpStatus, MediaType, ResponseEntity}
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/"))
class IndexController {

  val logger: Logger = org.slf4j.LoggerFactory.getLogger(classOf[IndexController])

  @RequestMapping(value=Array("/test"), produces=Array(MediaType.APPLICATION_JSON_VALUE), method=Array(RequestMethod.GET))
  def test(): ResponseEntity[util.HashMap[Integer, String]] = {
    logger.info("index test")

    val status = new util.HashMap[Integer, String]()
    status.put(200, "Spring Boot Scala Test")

    new ResponseEntity(status, HttpStatus.OK)}
}
