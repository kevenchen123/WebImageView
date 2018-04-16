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
Then import WebImageView to you project
```shell
import keven_chen.webimageviewlib.WebImageView;
```
For more detail of usage, see example.

