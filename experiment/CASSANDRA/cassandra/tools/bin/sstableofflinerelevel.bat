@REM  Licensed to the Apache Software Foundation (ASF) under one or more
@REM  contributor license agreements.  See the NOTICE file distributed with
@REM  this work for additional information regarding copyright ownership.
@REM  The ASF licenses this file to You under the Apache License, Version 2.0
@REM  (the "License"); you may not use this file except in compliance with
@REM  the License.  You may obtain a copy of the License at
@REM
@REM      http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM  Unless required by applicable law or agreed to in writing, software
@REM  distributed under the License is distributed on an "AS IS" BASIS,
@REM  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM  See the License for the specific language governing permissions and
@REM  limitations under the License.

@echo off

if "%OS%" == "Windows_NT" setlocal

pushd "%~dp0"
call cassandra.in.bat

if NOT DEFINED JAVA_HOME goto :err
if NOT DEFINED MAX_HEAP_SIZE set MAX_HEAP_SIZE="256M"
set TOOL_MAIN=org.apache.cassandra.tools.SSTableOfflineRelevel

REM ***** JAVA options *****
set JAVA_OPTS=^
 -ea ^
 -Xmx%MAX_HEAP_SIZE% ^
 -Dlogback.configurationFile=logback-tools.xml

"%JAVA_HOME%\bin\java" %JAVA_OPTS% %CASSANDRA_PARAMS% -cp %CLASSPATH% %TOOL_MAIN% %*
goto finally

:err
echo JAVA_HOME environment variable must be set!
set ERRORLEVEL=1
pause

:finally
ENDLOCAL & set RC=%ERRORLEVEL%
goto :exit_with_code

:returncode
exit /B %RC%

:exit_with_code
call :returncode %RC%