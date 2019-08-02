# GifView
继承view，自定义播放gif控件
1.1.0 增加了类似imageview的fit_center缩放模式，或可任意设置宽高拉伸。

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.feiyuu:GifView:1.1.0'	//1.1.0
	}


使用代码：

        GifView gif_view = findViewById(R.id.gif_view);
 	gif_view.setScaleType(GifView.FIT_CENTER);
        gif_view.setGifResource(R.mipmap.demo1);
        gif_view.play();
	

内部有锁屏监听，回到桌面监听，以及失去焦点监听，做了暂停继续处理。
