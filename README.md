# WebImageView

version 1.0.1

Use Webview to show image, reduce memory usage on java heap for Android.

## usage
If you use jcenter, add compile lib in your roject's build.gradle
```shell
dependencies {
  compile 'kevenchen.net:webimageview:1.0.1'
}
```
Or if you want to use jitpack, add jitpack in project root build.gradle
```shell
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```
add compile lib in your roject's build.gradle
```shell
dependencies {
  compile 'com.github.kevenchen123:WebImageView:v1.0.1'
}
```
Then import WebImageView to you project
```shell
import kevenchen.utils.WebImageView;
```
For more detail of usage, see example.
