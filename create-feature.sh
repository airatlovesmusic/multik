#!/bin/bash
cp -R template/feature features/feature-$1

mv features/feature-$1/src/main/java/com/airatlovesmusic/template features/feature-$1/src/main/java/com/airatlovesmusic/$1

# shellcheck disable=SC2016
find . -name '*' -exec sed -i -e 's/com.airatlovesmusic.template/com.airatlovesmusic.$1/g' {} \;
