@echo off
COLOR 2
echo      ___           ___           ___           ___           ___           ___
echo     /   \         /   \         /   \         /   \         /\__\         /   \
echo    /::\  \       /::\  \       /::\  \        \:\  \       /:/  /        /::\  \
echo   /:/ :\  \     /:/ :\  \     /:/ :\  \        \:\  \     /:/  /        /:/  \  \
echo  /:/  \:\  \   /::\~\:\  \   /:/  \:\  \       /::\  \   /:/  /  ___   _\:\~\ \  \
echo /:/__/ \:\__\ /:/ :\ \:\__\ /:/__/ \:\__\     /:/ :\__\ /:/__/  /\__\ /  \:\ \ \__\
echo \:\  \  \/__/ \/__\:\/:/  / \:\  \  \/__/    /:/  \/__/ \:\  \ /:/  / \:\ \:\ \/__/
echo  \:\  \            \::/  /   \:\  \         /:/  /       \:\  /:/  /   \:\ \:\__\
echo   \:\  \           /:/  /     \:\  \        \/__/         \:\/:/  /     \:\/:/  /
echo    \:\__\         /:/  /       \:\__\                      \::/  /       \::/  /
echo     \/__/         \/__/         \/__/                       \/__/         \/__/                                    
REM Change path to your community edition neo4j server bin
cd neo4j-community-4.4.2-windows\neo4j-community-4.4.2\bin
neo4j console
pause