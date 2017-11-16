# ShadowScanCrack

## 选项
```
[*]                      Linux Shadow离线弱口令扫描脚本
[*] Github:  https://github.com/iBearcat/ShadowScanCrack
[*]   Use:  java ShadowScan.jar john && /john-x.x.x/run/john ShadowPath PasswordList
```
## 使用
### Kali
```
java ShadowScan.jar john 资产Shadow 密码字典
```
### 其他Linux版本需安装john
#### Downloads 
https://github.com/magnumripper/JohnTheRipper
https://github.com/iBearcat/ShadowScanCrack/john-1.8.0-linux.tar.gz
#### Install
```
root@SecFree:/opt/ShadowScanCrack# tar -zxvf john-1.8.0-linux.tar.gz
root@SecFree:/opt/ShadowScanCrack/john-1.8.0/src# make linux-x86-64
root@SecFree:/opt/ShadowScanCrack/john-1.8.0/run# ./john
```
