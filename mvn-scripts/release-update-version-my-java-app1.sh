#cd ../my-java-app1
cd ..
# new version will be prompted (ex: 1.1-SNAPSHOT)
mvn release:update-versions  
#mvn release:update-versions -DautoVersionSubmodules=true (pour projet multi-modules)
#mvn --batch-mode release:update-versions -DdevelopmentVersion=1.1-SNAPSHOT
echo "fin?" ; read fin
