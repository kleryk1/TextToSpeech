:: C:\Users\Kleryk\Documents\GitHub\TextToSpeech\GetMoreVoices\getVoices.bat
@echo off

:: set filename variable    
set "puthon_scripts_location=py_scripts_3.6.5"
set "xmlFile=voices.xml"

:: set context to batch location
CD %~dp0

:: run python script 
python %puthon_scripts_location%\index.py %xmlFile%


pause
