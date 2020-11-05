mvn clean install
cd iraksha-ear
mvn clean install
rm -rf ../../wildfly-9.0.2.Final/standalone/deployments/*
ls -al ../../wildfly-9.0.2.Final/standalone/deployments/
cp target/iraksha-monolithic.ear ../../wildfly-9.0.2.Final/standalone/deployments/
ls -al ../../wildfly-9.0.2.Final/standalone/deployments/
sh ../../wildfly-9.0.2.Final/bin/standalone.sh

