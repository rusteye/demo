#!/usr/bin/expect
NAME=`mvn help:evaluate -Dexpression=project.name | grep "^[^\[]"`
VERSION=`mvn help:evaluate -Dexpression=project.version | grep "^[^\[]"`

spawn ssh root@172.16.50.216
expect "*password:" {send "root.123\r"}
expect "*'yes' or 'no':" {send "yes\r"}
expect "*]#" {send "touch 111.txt\r"}
interact
