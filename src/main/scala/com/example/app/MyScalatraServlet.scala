package com.example.app

import org.scalatra._

class MyScalatraServlet extends SamplescalascalatraStack {

  get("/") {
    contentType="text/html"
    layoutTemplate("/WEB-INF/templates/layouts/scalingo.jade")
  }

}
