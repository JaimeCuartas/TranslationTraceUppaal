@setlocal enableextensions enabledelayedexpansion

set model=%1
set trace=%2

REM "C:\Users\Jaime\Desktop\Train-Gate-Controller\carpetaMut\tadSyncid8id4.xml"
REM "C:\Users\Jaime\Desktop\Train-Gate-Controller\mut\tadSyncid8id2.xml0Trace.trn"


prueba %model% %trace% > output.txt 2>&1

REM FOR /F "USEBACKQ tokens=*" %%i in (`prueba %model% %trace%`) do @(echo %%i)

rem FOR /F "USEBACKQ tokens=*" %%i in (`prueba %model% %trace%`) do set last=%%i
REM echo last=%last%


