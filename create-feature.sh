#!/bin/bash

name="$1"
nameUpperCase=$(echo $name | perl -nE 'say ucfirst')

echo Creating $name module

cp -R template/feature features/feature-$name

mv features/feature-$name/src/main/java/com/airatlovesmusic/template/ui/TemplateFragment.kt features/feature-$name/src/main/java/com/airatlovesmusic/template/ui/${nameUpperCase}Fragment.kt
mv features/feature-$name/src/main/java/com/airatlovesmusic/template features/feature-"$name"/src/main/java/com/airatlovesmusic/"$name"

cd features/feature-$name/src/main || return
find ./ -type f -exec perl -pi -e "s/com.airatlovesmusic.template/com.airatlovesmusic.$name/g" {} \;

find ./ -type f -exec perl -pi -e "s/Template/$nameUpperCase/g" {} \;

cd ../../../../
echo "\ninclude ':features:feature-$name'" >> settings.gradle

./gradlew :features:feature-$name:build