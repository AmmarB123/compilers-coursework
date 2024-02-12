@echo off
echo ============================================
echo Cleaning old builds... 
echo(
cmd /c "gradlew -q clean & rd /s /q .gradle"
echo(
echo Done.
echo(
echo ============================================
echo(
echo Building the project...
echo( 
cmd /c "gradlew -q build"
echo(
echo Done.
echo(
echo ============================================
echo(
echo Input expression:
echo(
echo 3 + 5
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "echo 3 + 5 | gradlew -q :task1:run"
echo(
echo ============================================
echo(
echo Input expression:
echo(
echo 12 - 3 * 5
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "echo 12 - 3 * 5 | gradlew -q :task2:run"
echo(
echo ============================================
echo(
echo Input expression:
echo(
echo 13 - (4 + 7) + 2 * 2
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "echo 13 - (4 + 7) + 2 * 2 | gradlew -q :task3:run"
echo(
echo ============================================
echo If the numbers above are 8, -3, 6 then tests passed.
