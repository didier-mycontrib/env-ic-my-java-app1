#cd ../my-java-app1
cd ..
# verifications effectuées par release:prepare 
#      * pas de modifications locales (sans commit)
#      * pas de dépendances vers des xxx-SNAPSHOT

# will be prompted:
#      * new mvn/pom relased version (ex: 1.0)
#      * new SCM(git or svn or ...) released tag version (ex: my-java-app1-v1.0) 
#      * new mvn/pom developpement version (ex: 1.1-SNAPSHOT)

# actions that will be executed (if no errors):
#      * update to realeased version in the pom (and build pom.xml.releaseBackup)
#      * build & test with new version (to verify no pb)
#      * tag and commit/checkin released version in SCM(git or svn or ...) 
#        and build release.properties (for future release:perform that (in a // fork) 
#        checkout release version from scm 
#        and deploy the release version in the maven repo (ex: nexus) via mvn deploy )
#      * update to new developpement version in the pom
#      * commit in SCM 
mvn release:prepare
echo "fin?" ; read fin

