#cd ../my-java-app1
cd ..
mvn clean install -DskipTests=true
mvn sonar:sonar # > mvn-scripts/res-build.txt
echo "fin?" ; read fin