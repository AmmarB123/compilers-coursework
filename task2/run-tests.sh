#!/bin/bash
echo '============================================'
echo
echo 'Cleaning old builds... '
echo
(gradle -q clean; rm -fr .gradle)
echo
echo 'Done.'
echo
echo '============================================'
echo
echo 'Building the project... '
echo
gradle -q build
echo
echo 'Done.'
echo
echo '============================================'
echo
echo 'Input program:'
echo
cat ./01.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./01.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./02.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./02.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./03.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./03.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./04.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./04.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./05.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./05.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./06.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./06.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./07.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./07.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./08.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./08.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./09.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./09.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./10.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./10.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./11.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./11.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./12.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./12.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./13.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./13.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./14.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./14.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./15.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./15.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./16.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./16.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./17.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./17.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./18.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./18.sexp | gradle -q run
echo
echo ============================================
echo
echo 'Input program:'
echo
cat ./19.sexp
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./19.sexp | gradle -q run
echo
echo ============================================
