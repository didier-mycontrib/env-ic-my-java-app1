#cd ../my-java-app1
cd ..
mvn -Dmessage="yet another commit from developpeur xy" scm:checkin > mvn-scripts/res-build.txt
echo "fin?" ; read fin