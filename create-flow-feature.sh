#!/bin/bash

name="$1"
nameUpperCase=$(echo $name | perl -nE 'say ucfirst')

echo Creating $name module

cp -R templates/flow-feature features/flow-$name

mv features/flow-$name/src/main/java/com/airatlovesmusic/template/ui/TemplateFragment.kt features/flow-$name/src/main/java/com/airatlovesmusic/template/ui/${nameUpperCase}Fragment.kt
mv features/flow-$name/src/main/java/com/airatlovesmusic/template features/flow-"$name"/src/main/java/com/airatlovesmusic/"$name"

cd features/feature-$name/src/main || return
find ./ -type f -exec perl -pi -e "s/com.airatlovesmusic.template/com.airatlovesmusic.$name/g" {} \;

find ./ -type f -exec perl -pi -e "s/Template/$nameUpperCase/g" {} \;

cd ../../../../
echo "\ninclude ':features:flow-$name'" >> settings.gradle

./gradlew :features:flow-$name:build