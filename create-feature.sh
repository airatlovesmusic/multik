#!/bin/bash

name="$1"
echo $name

cp -R template/feature features/feature-$name

mv features/feature-$name/src/main/java/com/airatlovesmusic/template features/feature-"$name"/src/main/java/com/airatlovesmusic/"$name"

cd features/feature-$name/src/main
find ./ -type f -exec sed -i "s/com.airatlovesmusic.template/com.airatlovesmusic.$name" {} \;
