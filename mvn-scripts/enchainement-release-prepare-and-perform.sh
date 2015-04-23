#cd ../my-java-app1
cd ..
# enchainement prepare + perform
mvn -B -Dresume=false release:prepare release:perform
# -B or --batch-mode is for non interactive mode
echo "fin?" ; read fin

