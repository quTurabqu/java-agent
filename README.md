# java-agent
## simple-agent-maven
#### simple java agent project

## simple-agent-maven-usage
#### use java agent for this project

## Usage
1. "mvn clean install" both projects
2. copy "simple-agent-maven" jar file from target folder and paste it to "simple-agent-maven-usage" projects "src/main/resources" folder
3. go to "Run"->"Edit Configurations" for project "simple-agent-maven-usage" go to "modify options"->"vm options" put "-javaagent:src/main/resources/your-agent-jar-filename.jar"
4. run your project ("simple-agent-maven-usage")
