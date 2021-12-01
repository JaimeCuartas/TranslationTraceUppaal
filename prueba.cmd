@setlocal enableextensions enabledelayedexpansion

set model=%1
set trace=%2

"C:\Users\Jaime\OneDrive - correounivalle.edu.co\Documentos\uppaal-tron-1.5-win32\tron.exe" %model% -Q log -I TraceAdapter -- -m "C:\Users\Jaime\OneDrive - correounivalle.edu.co\Documentos\Github\TranslationTraceUppaal\preamble.trn" < %trace%
