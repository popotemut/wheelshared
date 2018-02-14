Readme.md UPDATED ON 10.2.61 AT 5:17 PM 
BUT NOT UPDATE ON GIT HUB.

﻿# WheelShared Project For Learning

**************************************************************
Our Tools:
**************************************************************
1. NetbeansIDE 8.2
2. Apache Maven 3.5.2
3. Java EE 8 Platform SDK
4. Java SE SDK 8u161
5. Aapche Tomcat 8.0.27
6. Jquery
7. HTML5
8. CSS3
9. JavaScript
10. JDBC
11. Amazon EC2 (Free tier)
12. Amazon RDS (Free tier)
13. Amazon S3 (Free tier)
14. Amazon CodeDeploy (Free For EC2)
15. MySQL
16. MySQL Workbench 6.3

Testing Architecture Link:
https://youtu.be/pklqfU5pp2g

**************************************************************
- Scope -
**************************************************************
Our Resource is not allowed to connect with anyone.Thus, you need to change the path for connecting DB and Storage by yourself.

**************************************************************
-Before Clone This Project , Please install the following-
**************************************************************
//////////////////////////////////////////////
1. Install Java EE 8 Platform SDK (http://download.oracle.com/…/java_ee_sdk/8/java_ee_sdk-8.zip)
//////////////////////////////////////////////
2. If you don't have any editor software , we suggest you to use NetbeansIDE8.2 because we use it to build this app. download here: (https://netbeans.org/downloads/) Note. Download All Bundles on the right that is 221MB for the size.
//////////////////////////////////////////////
3. Install Java SDK 8u161. 
download here: (http://www.oracle.com/…/downloa…/jdk8-downloads-2133151.html)
//////////////////////////////////////////////
3. Apache Maven 3.5.2 or above download here: (https://maven.apache.org/download.cgi)
//////////////////////////////////////////////

**************************************************************
- Installing Apache Maven - Resource:https://maven.apache.org/install.html
**************************************************************
//////////////////////////////////////////////
Detailed steps are:
//////////////////////////////////////////////
1. Ensure JAVA_HOME environment variable is set and points to your JDK installation

2. Extract distribution archive in any directory

3. unzip apache-maven-3.5.2-bin.zip
or
tar xzvf apache-maven-3.5.2-bin.tar.gz
Alternatively use your preferred archive extraction tool.

4. Add the bin directory of the created directory apache-maven-3.5.2 to the PATH environment variable

5. Confirm with mvn -v in a new shell or cmd. The result should look similar to
"
Apache Maven 3.5.2 (138edd61fd100ec658bfa2d307c43b76940a5d7d; 2017-10-18T08:58:13+01:00) Maven home: /opt/apache-maven-3.5.2 Java version: 1.8.0_45, vendor: Oracle Corporation Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre Default locale: en_US, platform encoding: UTF-8 OS name: “mac os x”, version: “10.8.5”, arch: “x86_64”, family: “mac”
"

//////////////////////////////////////////////
(Installing Apache Maven Tips) for Windows: 
//////////////////////////////////////////////
1. Check environment variable value e.g.

echo %JAVA_HOME% C:\Program Files\Java\jdk1.7.0_51

2. Adding to PATH: Add the unpacked distribution’s bin directory to your user PATH environment variable by opening up the system properties (WinKey + Pause), selecting the “Advanced” tab, and the “Environment Variables” button, then adding or selecting the PATH variable in the user variables with the value C:\Program Files\apache-maven-3.5.2\bin. The same dialog can be used to set JAVA_HOME to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_51

3. Open a new command prompt (Winkey + R then type cmd) and run mvn -v to verify the installation.

//////////////////////////////////////////////
(Installing Apache Maven Tips) for Unix-based Operating System (Linux, Solaris and Mac OS X):
//////////////////////////////////////////////
1. Check environment variable value

echo $JAVA_HOME /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home

2. Adding to PATH

export PATH=/opt/apache-maven-3.5.2/bin:$PATH