# stackoverflow58356978
https://stackoverflow.com/questions/58356978/camunda-wont-deploy-to-tomcat

This project builds a Camunda WAR for deployemnt on a standalone Tomcat 9.
mvn clean tomcat:deploy
or
mvn clean tomcat:redeploy


If you want to use tomcat maven plugin to (re)deploy add

  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <user username="admin" password="admin" roles="manager-gui, manager-script"/>

to tomcat-users.xml

and
 		 <server>
    			<id>TomcatServer</id>
    			<username>admin</username>
    			<password>admin</password>
    		 </server>

to settings.xml

