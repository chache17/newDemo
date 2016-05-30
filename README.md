# newDemo

##sugested build 
mvn -dtest=testStoreHomePage, RunCucumberFeatures test


##generate report
mvn surefire-report:report-only

##generate cucumber pretty html format
run mvn target install after running the feature tests in order to get a complete html set of reports

mvn install
