# 1. Introduction
A number of rich JavaScript frameworks have become available since 2010 that allow developers
to provide near-desktop quality user experience over the web.  Traditional HTTP request-response
flows for web applications are steadily being replaced with AJAX flows.  This trend has gained
even more traction with the advent of JavaScript MVC libraries such as Backbone.js and
Ember.js.  One of the challenges that application development teams when adopting such libraries
for existing applications is to enforce proper security controls on the AJAX calls originating
from such libraries.

This sample application demonstrates how Spring Security can be used to secure and protect
application resources in an AJAX environment.

# 2. Overview
[Todo MVC](http://todomvc.com/) is an open-source project that demonstrates capabilities of
various JavaScript based MVC frameworks.  It provides a single-page application that allows
users to manage a list of tasks (todo's).

This sample application provides an implementation of Todo MVC using [Ember.js](http://emberjs.com/)
where the list of todo's is pulled from the server using a REST API call.  The REST API endpoint
is secured using Spring MVC to allow access to only authenticated users.

# 3. Running the application
The following pre-requisites must be met in order to run this application:

1. Java Development Kit (JDK) 6.0 or higher;
1. Apache Maven 3.0.4 or higher.

Once the pre-requisites have been installed, check out or download this application and simply
run `mvn clean package tomcat7:run` to run the application.  This will start an embedded
Apache Tomcat instance on local port 8080.  The application can then be accessed using any
web browser on `http://localhost:8080`.

# 4. Testing the application
When the application is first accessed, it will display a login page.  Simply click the **Login**
button to continue on to the application home page that displays all the available todo's.  If
the home page is displayed correctly, along with todo's, everything is in order.

If you attempt to access the REST API endpoint `http://localhost:8080/tasks` used to fetch the
list of available todo's without logging in first, you will be redirected to the login page.

# 5. License
This sample application and its associated source code in its entirety is being made
available under the following licensing terms.

    Copyright (C) 2014

    Permission is hereby granted, free of charge, to any person obtaining a copy of
	this software and associated documentation files (the "Software"), to deal in the
	Software without restriction, including without limitation the rights to use, copy,
	modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
	and to permit persons to whom the Software is furnished to do so, subject to the
	following conditions:

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
	INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
	PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
	HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
	CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
	OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
