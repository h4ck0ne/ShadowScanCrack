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
![StartScan](https://raw.githubusercontent.com/iBearcat/ShadowScanCrack/master/img/StartScan.png)

### 其他Linux版本需安装john
#### 下载 
https://github.com/magnumripper/JohnTheRipper
https://github.com/iBearcat/ShadowScanCrack/john-1.8.0-linux.tar.gz
#### 安装john
```
root@SecFree:/opt/ShadowScanCrack# tar -zxvf john-1.8.0-linux.tar.gz
root@SecFree:/opt/ShadowScanCrack/john-1.8.0/src# make linux-x86-64
root@SecFree:/opt/ShadowScanCrack/john-1.8.0/run# ./john
```
如看到下图，说明安装成功。

![install_john](https://raw.githubusercontent.com/iBearcat/ShadowScanCrack/master/img/install_john.png)
