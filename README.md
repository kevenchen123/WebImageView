# WebImageView

version 1.0.0

Use Webview to show image, reduce memory usage on java heap for Android.

## usage
Add repository in project root build.gradle
```shell
buildscript {
  repositories {
    jcenter()
    maven {url 'https://dl.bintray.com/kevenchen/AndroidUtilityLib'}
  }
}

allprojects {
  repositories {
    jcenter()
    maven {url 'https://dl.bintray.com/kevenchen/AndroidUtilityLib'}
  }
}
```
Add compile in project build.gradle
```shell
dependencies {
  compile 'kevenchen.net:webimageview:1.0.1'
}
```
Then import WebImageView to you project
```shell
import kevenchen.utils.WebImageView;
```
For more detail of usage, see example.

