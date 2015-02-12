#cd ../my-java-app1
cd ..

# after "mvn release:prepare"
# use release.properties to (in a // fork) 
#        checkout sources of released  version  from scm 
#        and build it (with javadoc)
#        and deploy the release version in the maven repo (ex: nexus) via mvn deploy )
#        three ".jar" are build and deployed (artifact.jar , artifact-sources.jar , artifact-javadoc.jar)
mvn release:perform
echo "fin?" ; read fin

