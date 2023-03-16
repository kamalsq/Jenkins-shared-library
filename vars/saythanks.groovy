#!/usr/bin/env groovy

def call(String name = 'Kamal', message ='Thanks') {
  echo "Hello, ${name} ${message} for explaining the concepts of jenkins shared library."
}
