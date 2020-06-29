#12 Maven Repositories
##120 Configure Maven Repository in settings.xml  
##122 Using JBoss Repository  
##124 Assignment - Add JBoss Repo to settings.xml
- Add profile `jboss` to `settings.xml`
- Add `activeProfiles`
- Remove repository from `pom.xml`
##126 Using Spring Repositories
- See branch `spring-repo`
##127 Manually Installing Dependencies
- Go to Oracle website and download Oracle JDBC driver
- Run `mvn install:install-file -Dfile=ojdbc8.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=19.7.0.0 -Dpackaging=jar`
- It will install in `<userDir>/.m2/repository/com/oracle/ojdbc8/19.7.0.0/` 
- Remark: right `groupId` is `com.oracle.database.jdbc`
##130 Configure Maven Master Password
- Follow the instructions `https://maven.apache.org/guides/mini/guide-encryption.html`

