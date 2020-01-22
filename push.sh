#!/usr/bin/expect

spawn ssh root@172.16.50.216
expect "*password:" {send "root.123\r"}
expect "*'yes' or 'no':" {send "yes\r"}
interact
