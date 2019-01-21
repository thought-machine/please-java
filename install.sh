#!/bin/sh
# Builds and installs the binaries into ~/.please
set -eu

plz build //javac_worker //junit_runner
rm -f ~/.please/javac_worker
rm -f ~/.please/junit_runner.jar
cp plz-out/bin/javac_worker/javac_worker ~/.please/javac_worker
cp plz-out/bin/junit_runner/junit_runner.jar ~/.please/junit_runner.jar
echo "Tools installed"
