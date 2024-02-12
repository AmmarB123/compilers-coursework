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
echo 'Input expression:'
echo
echo '3 + 5'
echo
echo '---------------------'
echo
echo 'Output:'
echo
echo '3 + 5' | gradle -q :task1:run
echo
echo ============================================
echo
echo 'Input expression:'
echo
echo '12 - 3 * 5'
echo
echo '---------------------'
echo
echo 'Output:'
echo
echo '12 - 3 * 5' | gradle -q :task2:run
echo
echo ============================================
echo
echo 'Input expression:'
echo
echo '13 - (4 + 7) + 2 * 2'
echo
echo '---------------------'
echo
echo 'Output:'
echo
echo '13 - (4 + 7) + 2 * 2' | gradle -q :task1:run
echo
echo ============================================
echo 'If the numbers above are 8, -3, 6 then tests passed.'
